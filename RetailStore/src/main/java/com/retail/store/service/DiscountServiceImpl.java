package com.retail.store.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.retail.store.model.Bill;

@Service
public class DiscountServiceImpl implements DiscountService {

	@Override
	public JSONObject calculateDiscount(Bill billRequest) throws JSONException {

	    JSONObject responseJSON = new JSONObject();
		int initalAmount = billRequest.getBillDetails().getAmount();
		double netPaybaleAmount;
		double percentDiscount = 0;

		boolean isDiscounted = false;

		int dollarDicountAmount = 5 * (initalAmount / 100);

		if (!billRequest.getBillDetails().getItemCategory().equalsIgnoreCase("GROCERY")) {
			if (billRequest.getIsEmployee()) {
				percentDiscount = (double) (initalAmount * 30 / 100);
				isDiscounted = true;

			}

			else if (!isDiscounted && billRequest.getIsAffilate()) {

				percentDiscount = (double) (initalAmount - (initalAmount * 10 / 100));
			}

			else if (!isDiscounted && billRequest.getCustomerDuration() > 2) {

				percentDiscount = (double) (initalAmount - (initalAmount * 5 / 100));
			}

		}

		netPaybaleAmount = initalAmount - (dollarDicountAmount + percentDiscount);

		responseJSON.put("netPaybaleAmount", netPaybaleAmount);
		responseJSON.put("Status", "success");
		return responseJSON;

	}

}

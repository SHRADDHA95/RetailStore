/**
 * 
 */
package com.retail.store.service;

import org.json.JSONException;
import org.json.JSONObject;

import com.retail.store.model.Bill;

public interface DiscountService {

	public JSONObject calculateDiscount(Bill billRequest) throws JSONException;

}

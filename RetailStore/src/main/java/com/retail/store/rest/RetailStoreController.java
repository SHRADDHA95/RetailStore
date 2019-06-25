/**
 * 
 */
package com.retail.store.rest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.store.model.Bill;
import com.retail.store.service.DiscountServiceImpl;

@RestController
public class RetailStoreController {

	@Autowired
	DiscountServiceImpl discountService;

	@CrossOrigin
	@PostMapping(value = "/getDiscount", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<String> getDiscount(@RequestBody Bill billRequest) throws JSONException {

		JSONObject jsonResp = discountService.calculateDiscount(billRequest);
		return new ResponseEntity<String>(jsonResp.toString(), HttpStatus.OK);

	}

}

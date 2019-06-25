/**
 * 
 */
package com.retail.store.model;

/**
 * @author Deep
 *
 */
public class BillDetails {

	private String itemName;
	private String itemCategory;
	private Integer amount;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}

/**
 * 
 */
package com.retail.store.model;

/**
 * @author Deep
 *
 */
public class Bill {

	private BillDetails billDetails;
	private Boolean isEmployee;
	private Boolean isAffilate;
	private Integer customerDuration;
	
	public BillDetails getBillDetails() {
		return billDetails;
	}
	public void setBillDetails(BillDetails billDetails) {
		this.billDetails = billDetails;
	}
	public Boolean getIsEmployee() {
		return isEmployee;
	}
	public void setIsEmployee(Boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	public Boolean getIsAffilate() {
		return isAffilate;
	}
	public void setIsAffilate(Boolean isAffilate) {
		this.isAffilate = isAffilate;
	}
	public Integer getCustomerDuration() {
		return customerDuration;
	}
	public void setCustomerDuration(Integer customerDuration) {
		this.customerDuration = customerDuration;
	}

}

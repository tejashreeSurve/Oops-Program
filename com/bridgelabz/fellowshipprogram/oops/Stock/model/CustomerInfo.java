package com.bridgelabz.fellowshipprogram.oops.Stock.model;

public class CustomerInfo {
	int customerId;
	String nameOfCustomer;
	int amountOfCustomer;
	int numberOfShare;
	int pricePerShare;

	public CustomerInfo(int customerId, String nameOfCustomer, int amountOfCustomer, int numberOfShare,
			int pricePerShare) {
		this.customerId = customerId;
		this.nameOfCustomer = nameOfCustomer;
		this.amountOfCustomer = amountOfCustomer;
		this.numberOfShare = numberOfShare;
		this.pricePerShare = pricePerShare;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}

	public int getAmountOfCustomer() {
		return amountOfCustomer;
	}

	public void setAmountOfCustomer(int amountOfCustomer) {
		this.amountOfCustomer = amountOfCustomer;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public int getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
}

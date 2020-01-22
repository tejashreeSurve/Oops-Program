package com.bridgelabz.fellowshipprogram.oops.Stock.model;

public class Transaction {
	String transactionId;
	String buyerName;
	String sellerName;
	String dateTime;
	int tranAmount;

	public Transaction(String transactionId, String buyerName, String sellerName, String dateTime, int tranAmount) {
		this.transactionId = transactionId;
		this.buyerName = buyerName;
		this.sellerName = sellerName;
		this.dateTime = dateTime;
		this.tranAmount = tranAmount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(int tranAmount) {
		this.tranAmount = tranAmount;
	}
}

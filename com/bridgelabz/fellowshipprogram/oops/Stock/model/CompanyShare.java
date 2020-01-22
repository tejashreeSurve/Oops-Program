package com.bridgelabz.fellowshipprogram.oops.Stock.model;

public class CompanyShare {
	int companyId;
	String stockSymbol;
	int numberOfShare;
	int priceForEachShare;
	int amountOfCompay;

	public CompanyShare(int companyId, String stockSymbol, int numberOfShare, int priceForEachShare,
			int amountOfCompay) {
		this.companyId = companyId;
		this.stockSymbol = stockSymbol;
		this.numberOfShare = numberOfShare;
		this.priceForEachShare = priceForEachShare;
		this.amountOfCompay = amountOfCompay;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public int getPriceForEachShare() {
		return priceForEachShare;
	}

	public void setPriceForEachShare(int priceForEachShare) {
		this.priceForEachShare = priceForEachShare;
	}

	public int getAmountOfCompay() {
		return amountOfCompay;
	}

	public void setAmountOfCompay(int amountOfCompay) {
		this.amountOfCompay = amountOfCompay;
	}

}

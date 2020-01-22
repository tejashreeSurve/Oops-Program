package com.bridgelabz.fellowshipprogram.oops.Stock.model;

public class StockPortFolio {
	String StockName;
	int NumberOfShare;
	int PriceForEachShare;
	int Price;

	public StockPortFolio(String stockName, int numberOfShare, int priceForEachShare, int price) {
		StockName = stockName;
		NumberOfShare = numberOfShare;
		PriceForEachShare = priceForEachShare;
		Price = price;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public int getNumberOfShare() {
		return NumberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		NumberOfShare = numberOfShare;
	}

	public int getPriceForEachShare() {
		return PriceForEachShare;
	}

	public void setPriceForEachShare(int priceForEachShare) {
		PriceForEachShare = priceForEachShare;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}
}

package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model;

public class Rice {
	String name;
	int weight;
	int pricePerKg;
	int totalRice;

	public Rice(String name, int weight, int pricePerKg, int totalRice) {

		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.totalRice = totalRice;
	}

	public Rice() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getTotalRice() {
		return totalRice;
	}

	public void setTotalRice(int totalRice) {
		this.totalRice = totalRice;
	}

}

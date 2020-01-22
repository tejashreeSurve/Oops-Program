package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model;

public class Wheat {
	String name;
	int weight;
	int pricePerKg;
	int totalWheat;

	public Wheat(String name, int weight, int pricePerKg, int totalWheat) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.totalWheat = totalWheat;
	}

	public Wheat() {
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

	public int getTotalWheat() {
		return totalWheat;
	}

	public void setTotalWheat(int totalWheat) {
		this.totalWheat = totalWheat;
	}

}

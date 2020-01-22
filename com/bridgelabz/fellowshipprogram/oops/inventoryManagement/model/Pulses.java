package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model;

public class Pulses {
	String name;
	int weight;
	int pricePerKg;
	int totalPulses;

	public Pulses(String name, int weight, int pricePerKg, int totalPulses) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.totalPulses = totalPulses;
	}

	public Pulses() {
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

	public int getTotalPulses() {
		return totalPulses;
	}

	public void setTotalPulses(int totalPulses) {
		this.totalPulses = totalPulses;
	}
}

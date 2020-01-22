package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model;

import java.util.ArrayList;

public class ListOfAllData {

	public ArrayList<Wheat> ObjectWheat;
	public ArrayList<Pulses> ObjectPulses;
	public ArrayList<Rice> ObjectRice;

	public ArrayList<Wheat> getObjectWheat() {
		return ObjectWheat;
	}

	public void setObjectWheat(ArrayList<Wheat> objectWheat) {
		ObjectWheat = objectWheat;
	}

	public ArrayList<Pulses> getObjectPulses() {
		return ObjectPulses;
	}

	public void setObjectPulses(ArrayList<Pulses> objectPulses) {
		ObjectPulses = objectPulses;
	}

	public ArrayList<Rice> getObjectRice() {
		return ObjectRice;
	}

	public void setObjectRice(ArrayList<Rice> objectRice) {
		ObjectRice = objectRice;
	}
}

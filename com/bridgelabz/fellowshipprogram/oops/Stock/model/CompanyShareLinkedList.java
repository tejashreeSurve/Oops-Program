package com.bridgelabz.fellowshipprogram.oops.Stock.model;

import com.bridgelabz.fellowshipprogram.oops.Stock.utility.UnOrderedList;

public class CompanyShareLinkedList {
	public UnOrderedList<CompanyShare> unorderedList = new UnOrderedList<CompanyShare>();

	public UnOrderedList<CompanyShare> getUnorderedList() {
		return unorderedList;
	}

	public void setUnorderedList(UnOrderedList<CompanyShare> unorderedList) {
		this.unorderedList = unorderedList;
	}

}

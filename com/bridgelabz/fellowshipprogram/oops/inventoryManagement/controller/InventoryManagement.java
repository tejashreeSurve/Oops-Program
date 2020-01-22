package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.ListOfAllData;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.Pulses;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.Rice;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.Wheat;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.repository.JsonOperation;

/**
 * @author Tejashree Surve
 * @Purpose : To manage Inventory Details.
 */
public class InventoryManagement {
	public static void main(String[] args) {
		JsonOperation operation = new JsonOperation();
		Scanner scanner = new Scanner(System.in);
		String filePath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/data.json";
		String object = null;
		String type;
		int weight, price;

		// List of all inventory items
		ListOfAllData list = new ListOfAllData();
		operation.toWriteIntoFile(filePath, list);
		ArrayList<Rice> listOfRice = new ArrayList<Rice>();
		ArrayList<Wheat> listOfWheat = new ArrayList<Wheat>();
		ArrayList<Pulses> listOfPulses = new ArrayList<Pulses>();

		// This add Rice details
		System.out.println("---------RICE-------\n");
		System.out.println("enter the number of values to add in listofRice\n");
		int numberOfInputForRice = scanner.nextInt();
		while (listOfRice.size() != numberOfInputForRice) {
			System.out.println("enter typeOFRice,weight,pricePerWeight\n");
			type = scanner.next();
			weight = scanner.nextInt();
			price = scanner.nextInt();
			listOfRice.add(new Rice(type, weight, price, 0));
		}

		// This add Wheat details
		System.out.println("--------WHEAT-------\n");
		System.out.println("enter the number of values to add in listofWheat\n");
		int numberOfInputForWheat = scanner.nextInt();
		while (listOfWheat.size() != numberOfInputForWheat) {
			System.out.println("enter typeOFWheat,weight,pricePerWeight\n");
			type = scanner.next();
			weight = scanner.nextInt();
			price = scanner.nextInt();
			listOfWheat.add(new Wheat(type, weight, price, 0));
		}

		// This add Pulses details
		System.out.println("-------PULSES-------\n");
		System.out.println("enter the number of values to add in listofPulses\n");
		int numberOfInputForPulses = scanner.nextInt();
		while (listOfPulses.size() != numberOfInputForPulses) {
			System.out.println("enter typeOFPulses,weight,pricePerWeight\n");
			type = scanner.next();
			weight = scanner.nextInt();
			price = scanner.nextInt();
			listOfPulses.add(new Pulses(type, weight, price, 0));
		}
		ObjectMapper mapper = new ObjectMapper();
		ListOfAllData listReaded = new ListOfAllData();
		list.setObjectRice(listOfRice);
		list.setObjectPulses(listOfPulses);
		list.setObjectWheat(listOfWheat);
		operation.toWriteIntoFile(filePath, list);
		try {
			listReaded = mapper.readValue((new File(filePath)), ListOfAllData.class);
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		for (int i = 0; i < list.ObjectRice.size(); i++) {
			int totalRice = (list.ObjectRice.get(i).getWeight()) * (list.ObjectRice.get(i).getPricePerKg());
			list.ObjectRice.get(i).setTotalRice(totalRice);
		}
		for (int i = 0; i < list.ObjectWheat.size(); i++) {
			int totalWheat = (list.ObjectWheat.get(i).getWeight()) * (list.ObjectWheat.get(i).getPricePerKg());
			list.ObjectWheat.get(i).setTotalWheat(totalWheat);
		}
		for (int i = 0; i < list.ObjectPulses.size(); i++) {
			int totalPulses = (list.ObjectPulses.get(i).getWeight()) * (list.ObjectWheat.get(i).getPricePerKg());
			list.ObjectPulses.get(i).setTotalPulses(totalPulses);
		}

		// Write details in json file
		try {
			object = mapper.writeValueAsString(list);
			System.out.println(object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		for (int i = 0; i < list.ObjectRice.size(); i++) {
			System.out.println(list.ObjectRice.get(i).getName() + "--->" + list.ObjectRice.get(i).getTotalRice());
		}
		System.out.println();
		for (int i = 0; i < list.ObjectWheat.size(); i++) {
			System.out.println(list.ObjectWheat.get(i).getName() + "--->" + list.ObjectWheat.get(i).getTotalWheat());
		}
		System.out.println();

		for (int i = 0; i < list.ObjectPulses.size(); i++) {
			System.out.println(list.ObjectPulses.get(i).getName() + "--->" + list.ObjectPulses.get(i).getTotalPulses());
		}

		System.out.println(object);
		scanner.close();
	}

}

package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.ListOfAllData;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.Pulses;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.Rice;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.model.Wheat;
import com.bridgelabz.fellowshipprogram.oops.inventoryManagement.repository.JsonOperation;

/**
 * @author Tejashree Surve
 * @Purpose : To Add no of inventory items.
 */
public class InventoryManager {
	public static void main(String[] args) throws IOException, JsonMappingException, IOException {
		String filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/inventoryManagement/inventoryManagerData.json";
		System.out.println("this is Inventory Manager option\n");
		JsonOperation operation = new JsonOperation();
		ListOfAllData list = new ListOfAllData();
		int totalInventoryPrice;
		int totalRicePrice = 0, totalWheatPrice = 0, totalPulsesPrice = 0;

		// List of inventory items
		ArrayList<Rice> listOfRice = new ArrayList<Rice>();
		ArrayList<Wheat> listOfWheat = new ArrayList<Wheat>();
		ArrayList<Pulses> listOfPulses = new ArrayList<Pulses>();

		System.out.println("Enter option to added total  number of inventory\n");
		Scanner scanner = new Scanner(System.in);
		int numberOfTotalInventory = scanner.nextInt();
		String type;
		int weight, price;
		int total = 0;

		// add number of inventory items
		while (numberOfTotalInventory != 0) {
			System.out.println("INVENTORY MANAGER OPTION\n");
			System.out.println("1.RICE\n");
			System.out.println("2.WHEAT\n");
			System.out.println("3.PULSES\n");
			System.out.println("enter option \n");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("enter type of rice,weight of rice,pricePerkg\n");
				type = scanner.next();
				weight = scanner.nextInt();
				price = scanner.nextInt();
				total = weight * price;
				listOfRice.add(new Rice(type, weight, price, total));
				numberOfTotalInventory--;
				break;
			case 2:
				System.out.println("enter type of wheat,weight of rice,pricePerkg\n");
				type = scanner.next();
				weight = scanner.nextInt();
				price = scanner.nextInt();
				total = weight * price;
				listOfWheat.add(new Wheat(type, weight, price, total));
				numberOfTotalInventory--;
				break;
			case 3:
				System.out.println("enter type of pulses,weight of rice,pricePerkg\n");
				type = scanner.next();
				weight = scanner.nextInt();
				price = scanner.nextInt();
				total = weight * price;
				listOfPulses.add(new Pulses(type, weight, price, total));
				numberOfTotalInventory--;
				break;
			default:
				System.out.println("please Enter valid option\n");
			}
		}
		list.setObjectRice(listOfRice);
		list.setObjectWheat(listOfWheat);
		list.setObjectPulses(listOfPulses);

		// To write inventory details in json file
		operation.toWriteIntoFile(filepath, list);
		list = (ListOfAllData) JsonOperation.toReadFromFile(filepath, list);
		System.out.println("This is an Entire InventoryDetail\n");
		System.out.println("NAME\t\tTYPE\t\tWEIGHT\t\tPRICEpERkG\t\tTOTALpRICE");
		for (int i = 0; i < list.ObjectRice.size(); i++) {
			totalRicePrice = totalRicePrice + list.ObjectRice.get(i).getTotalRice();
			System.out.println(
					"Rice\t\t" + list.ObjectRice.get(i).getName() + "\t\t" + list.ObjectRice.get(i).getWeight() + "\t\t"
							+ list.ObjectRice.get(i).getPricePerKg() + "\t\t" + list.ObjectRice.get(i).getTotalRice());
		}
		for (int i = 0; i < list.ObjectWheat.size(); i++) {
			totalWheatPrice = totalWheatPrice + list.ObjectWheat.get(i).getTotalWheat();
			System.out.println("Wheat\t\t" + list.ObjectWheat.get(i).getName() + "\t\t"
					+ list.ObjectWheat.get(i).getWeight() + "\t\t" + list.ObjectRice.get(i).getPricePerKg() + "\t\t"
					+ list.ObjectWheat.get(i).getTotalWheat());
		}
		for (int i = 0; i < list.ObjectPulses.size(); i++) {
			totalPulsesPrice = totalPulsesPrice + list.ObjectPulses.get(i).getTotalPulses();
			System.out.println("Pulses\t\t" + list.ObjectPulses.get(i).getName() + "\t\t"
					+ list.ObjectPulses.get(i).getWeight() + "\t\t" + list.ObjectPulses.get(i).getPricePerKg() + "\t\t"
					+ list.ObjectPulses.get(i).getTotalPulses());
		}
		totalInventoryPrice = totalPulsesPrice + totalRicePrice + totalWheatPrice;
		System.out.println("TOTAL INVENTORY PRICE IS: " + totalInventoryPrice);
		scanner.close();
	}
}

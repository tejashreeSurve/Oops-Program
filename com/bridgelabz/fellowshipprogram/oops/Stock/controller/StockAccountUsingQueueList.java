package com.bridgelabz.fellowshipprogram.oops.Stock.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.oops.Stock.model.CompanyShare;
import com.bridgelabz.fellowshipprogram.oops.Stock.model.CompanyShareList;
import com.bridgelabz.fellowshipprogram.oops.Stock.model.CustomerInfo;
import com.bridgelabz.fellowshipprogram.oops.Stock.model.CustomerList;
import com.bridgelabz.fellowshipprogram.oops.Stock.model.Transaction;
import com.bridgelabz.fellowshipprogram.oops.Stock.model.TransactionQueueStack;
import com.bridgelabz.fellowshipprogram.oops.Stock.repository.JsonOperation;

/**
 * @author Tejashree Surve
 * @Purpose : Stock management using Queue Linked list.
 */
public class StockAccountUsingQueueList {
	public static void main(String[] args) {
		ArrayList<CustomerInfo> customerList = new ArrayList<CustomerInfo>();
		ArrayList<CompanyShare> companyList = new ArrayList<CompanyShare>();
		CompanyShareList listOfCompany = new CompanyShareList();
		CustomerList listOfCustomer = new CustomerList();
		TransactionQueueStack queueList = new TransactionQueueStack();
		Transaction tra;
		Scanner scanner = new Scanner(System.in);
		JsonOperation operation = new JsonOperation();
		int customerId;
		String nameOfCustomer;
		int amountOfCustomer;
		int numberOfShare;
		int pricePerShare;
		int companyIdNumber;
		String stockSymbol;
		int numberOfCompanyShare;
		int priceForEachShare;
		int amountOfCompay;
		// json files
		String customarFilePath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/CustomerDetail.json";
		String comapnyFilePath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/CompanyDetail.json";
		String customerEditedPath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/CustomerEditedDetail.josn";
		String companyEditedPath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/CompanyEditedDetail.json";
		String stockDetailFilePath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/stockDetail.json";
		String transcationFilePath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/Stock/Transaction.json";
		System.out.println("----hello this is Commercial Data----\n");
		int option = 0;
		// add new customer and company
		while (option != 3) {
			System.out.println("Enter Customerinfo and CompanyDetails\n");
			System.out.println("1.Add New Customer\n");
			System.out.println("2.Add New Company\n");
			System.out.println("3.exit\n");
			System.out.println("Enter option\n");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("enter CustomerID");
				customerId = scanner.nextInt();
				System.out.println("enter Customer name\n");
				nameOfCustomer = scanner.next();
				System.out.println("Enter total Amount\n");
				amountOfCustomer = scanner.nextInt();
				System.out.println("Enter number of Share\n");
				numberOfShare = scanner.nextInt();
				System.out.println("Enter pricePerEachShare\n");
				pricePerShare = scanner.nextInt();
				customerList.add(
						new CustomerInfo(customerId, nameOfCustomer, amountOfCustomer, numberOfShare, pricePerShare));
				break;
			case 2:
				System.out.println("enter companyID\n");
				companyIdNumber = scanner.nextInt();
				System.out.println("enter stockSysmbol of comapny\n");
				stockSymbol = scanner.next();
				System.out.println("enter numberOfCompanyShare\n");
				numberOfCompanyShare = scanner.nextInt();
				System.out.println("Enter sharePrice of comapny\n");
				priceForEachShare = scanner.nextInt();
				System.out.println("Enter amount of comapny\n");
				amountOfCompay = scanner.nextInt();
				companyList.add(new CompanyShare(companyIdNumber, stockSymbol, numberOfCompanyShare, priceForEachShare,
						amountOfCompay));
				break;
			case 3:
				System.out.println("thanku for adding info--\n");
				break;
			}
		}
		listOfCompany.setListOfCompanyShare(companyList);
		listOfCustomer.setCustomerList(customerList);
		operation.toWriteIntoFile(comapnyFilePath, listOfCompany);
		operation.toWriteIntoFile(customarFilePath, listOfCustomer);
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		int compid;
		int custoshare;
		int cusId;
		int indexOfCustomer;
		int indexOfCompany;
		boolean isCustomerPresent = false;
		boolean isCompanyPresent = false;
		String transactid;
		String buyerName;
		String sellerName;
		String dateOfCp;
		int TransacAmount;
		System.out.println("---------Commercial Data operation------------\n");
		int option2 = 0;
		while (option2 != 3) {
			System.out.println("--wel-come to operation----\n");
			System.out.println("1.Operation For Customer\n");
			System.out.println("2.Operation For Company\n");
			System.out.println("3.Exit\n");
			System.out.println("Enter option\n");
			option2 = scanner.nextInt();
			switch (option2) {
			case 1:
				System.out.println("-----WEL-COME Customer----");
				System.out.println("Please Enter CustomerID \n");
				cusId = scanner.nextInt();
				for (int i = 0; i < customerList.size(); i++) {
					if (cusId == customerList.get(i).getCustomerId()) {
						isCustomerPresent = true;
						indexOfCustomer = i;
						System.out.println("Enter company id");
						compid = scanner.nextInt();
						for (int j = 0; j < companyList.size(); j++) {
							if (compid == companyList.get(j).getCompanyId()) {
								isCompanyPresent = true;
								indexOfCompany = j;
								System.out.println("1.Buy Share\n");
								System.out.println("2.Sell Share\n");
								System.out.println("Enter option");
								int option3 = scanner.nextInt();
								switch (option3) {
								case 1:
									System.out.println("----------Buy--------");
									System.out.println("enter nyumberOF Share to buy\n");
									custoshare = scanner.nextInt();
									if (custoshare < companyList.get(indexOfCompany).getNumberOfShare()) {
										int amountvalue = custoshare
												* (companyList.get(indexOfCompany).getPriceForEachShare());
										if (customerList.get(indexOfCustomer).getAmountOfCustomer() > amountvalue) {
											// customer amount change
											int newCustAmount = (customerList.get(indexOfCustomer)
													.getAmountOfCustomer()) - amountvalue;
											customerList.get(indexOfCustomer).setAmountOfCustomer(newCustAmount);
											// share change customer
											int newCustShare = (customerList.get(indexOfCustomer).getNumberOfShare())
													+ custoshare;
											customerList.get(indexOfCustomer).setNumberOfShare(newCustShare);
											// company amount change
											int newCompAmount = (companyList.get(indexOfCompany).getAmountOfCompay())
													+ amountvalue;
											companyList.get(indexOfCompany).setAmountOfCompay(amountvalue);
											// company share change
											int newCompShare = (companyList.get(indexOfCompany).getNumberOfShare())
													- custoshare;
											companyList.get(indexOfCompany).setNumberOfShare(newCompShare);
											transactid = customerList.get(indexOfCustomer).getNameOfCustomer()
													+ companyList.get(indexOfCompany).getStockSymbol();
											buyerName = customerList.get(indexOfCustomer).getNameOfCustomer();
											sellerName = companyList.get(indexOfCompany).getStockSymbol();
											dateOfCp = df.format(dateobj);
											TransacAmount = amountvalue;
											queueList.list.enqueue(new Transaction(transactid, buyerName, sellerName,
													dateOfCp, TransacAmount));
											System.out.println("sussfully add in json file\n");
										} else {
											System.out.println("Customer amount balance is to less\n");
										}
									} else {
										System.out.println("Company dont have that much share\n");
									}
									break;
								case 2:
									System.out.println("----------sell---------");
									System.out.println("Enter numberofShare to  sell \n");
									int SellShare = scanner.nextInt();
									int Amount = (customerList.get(indexOfCustomer).getPricePerShare()) * SellShare;
									if (SellShare < (customerList.get(indexOfCustomer).getNumberOfShare())) {
										if (Amount < (companyList.get(indexOfCompany).getAmountOfCompay())) {
											int newCustAmount = (customerList.get(indexOfCustomer)
													.getAmountOfCustomer()) + Amount;
											customerList.get(indexOfCustomer).setAmountOfCustomer(newCustAmount);
											// customer share change
											int newCustShare = (customerList.get(indexOfCustomer).getNumberOfShare())
													- SellShare;
											customerList.get(indexOfCustomer).setNumberOfShare(newCustShare);
											// company amount change
											int newCompAmount = (companyList.get(indexOfCompany).getAmountOfCompay())
													- Amount;
											companyList.get(indexOfCompany).setAmountOfCompay(newCompAmount);
											// company share change
											int newCompShare = (companyList.get(indexOfCompany).getNumberOfShare())
													+ SellShare;
											companyList.get(indexOfCompany).setNumberOfShare(newCompShare);
											transactid = customerList.get(indexOfCustomer).getNameOfCustomer()
													+ companyList.get(indexOfCompany).getStockSymbol();
											buyerName = companyList.get(indexOfCompany).getStockSymbol();
											sellerName = customerList.get(indexOfCustomer).getNameOfCustomer();
											dateOfCp = df.format(dateobj);
											TransacAmount = Amount;
											queueList.list.enqueue(new Transaction(transactid, buyerName, sellerName,
													dateOfCp, TransacAmount));
											System.out.println("sussfully add in json file\n");
										} else {
											System.out.println("no Sufficient amount in companyAccount");
										}
									} else {
										System.out.println("no sufficient share present\n");
									}

									break;
								default:
									System.out.println("Enter valide option\n");
									break;
								}
							}
						}
					}
				}
				if (!isCompanyPresent) {
					System.out.println("companyid is not present\n");
				}
				if (!isCustomerPresent) {
					System.out.println("customerId is not present\n");
				}
				break;
			case 2:
				System.out.println("-----WEL-COME Company----");
				System.out.println("please enter companyId\n");
				compid = scanner.nextInt();
				for (int i = 0; i < companyList.size(); i++) {
					if (compid == companyList.get(i).getCompanyId()) {
						isCompanyPresent = true;
						indexOfCompany = i;
						System.out.println("Enter customer id\n");
						cusId = scanner.nextInt();
						for (int j = 0; j < customerList.size(); j++) {
							if (cusId == customerList.get(j).getCustomerId()) {
								isCompanyPresent = true;
								indexOfCustomer = j;
								System.out.println("1.Buy Share\n");
								System.out.println("2.Sell Share\n");
								System.out.println("Enter option");
								int option3 = scanner.nextInt();
								switch (option3) {
								case 1:
									System.out.println("----------Buy--------");
									System.out.println("enter nyumberOF Share to buy\n");
									int compShare = scanner.nextInt();
									if (compShare < customerList.get(indexOfCustomer).getNumberOfShare()) {
										int amountvalue = compShare
												* (customerList.get(indexOfCustomer).getPricePerShare());
										if (amountvalue < companyList.get(indexOfCompany).getAmountOfCompay()) {
											// customer amount change
											int newCompAmount = (companyList.get(indexOfCompany).getAmountOfCompay())
													- amountvalue;
											companyList.get(indexOfCompany).setAmountOfCompay(newCompAmount);
											// share change company
											int newCompShare = (companyList.get(indexOfCompany).getNumberOfShare())
													+ compShare;
											companyList.get(indexOfCompany).setNumberOfShare(newCompShare);
											// customer amount change
											int newCustAmount = (customerList.get(indexOfCustomer)
													.getAmountOfCustomer()) + amountvalue;
											customerList.get(indexOfCustomer).setAmountOfCustomer(newCustAmount);
											// customer share change
											int newCustShare = (customerList.get(indexOfCustomer).getNumberOfShare())
													- compShare;
											customerList.get(indexOfCustomer).setNumberOfShare(newCustShare);
											transactid = companyList.get(indexOfCompany).getStockSymbol()
													+ customerList.get(indexOfCustomer).getNameOfCustomer();
											buyerName = companyList.get(indexOfCompany).getStockSymbol();
											sellerName = customerList.get(indexOfCustomer).getNameOfCustomer();
											dateOfCp = df.format(dateobj);
											TransacAmount = amountvalue;
											queueList.list.enqueue(new Transaction(transactid, buyerName, sellerName,
													dateOfCp, TransacAmount));
											System.out.println("sussfully add in json file\n");
										} else {
											System.out.println("Company amount balance is to less\n");
										}
									} else {
										System.out.println("customer dont have that much share\n");
									}
									break;

								case 2:
									System.out.println("----------sell---------");
									System.out.println("Enter numberofShare to sell \n");
									int SellShare = scanner.nextInt();
									int Amount = (companyList.get(indexOfCompany).getPriceForEachShare()) * SellShare;
									if (SellShare < (companyList.get(indexOfCompany).getNumberOfShare())) {
										if (Amount < (customerList.get(indexOfCustomer).getAmountOfCustomer())) {
											// company amount change
											int newCompAmount = (companyList.get(indexOfCompany).getAmountOfCompay())
													+ Amount;
											companyList.get(indexOfCompany).setAmountOfCompay(newCompAmount);
											// company share change
											int newCompShare = (companyList.get(indexOfCompany).getNumberOfShare())
													- SellShare;
											companyList.get(indexOfCompany).setNumberOfShare(newCompShare);
											// customer amount change
											int newCustAmount = (customerList.get(indexOfCustomer)
													.getAmountOfCustomer()) - Amount;
											customerList.get(indexOfCustomer).setAmountOfCustomer(newCustAmount);
											// customer share change
											int newCustShare = (customerList.get(indexOfCustomer).getNumberOfShare())
													+ SellShare;
											customerList.get(indexOfCustomer).setNumberOfShare(newCustShare);
											transactid = companyList.get(indexOfCompany).getStockSymbol()
													+ customerList.get(indexOfCustomer).getNameOfCustomer();
											buyerName = customerList.get(indexOfCustomer).getNameOfCustomer();
											sellerName = companyList.get(indexOfCompany).getStockSymbol();
											dateOfCp = df.format(dateobj);
											TransacAmount = Amount;
											queueList.list.enqueue(new Transaction(transactid, buyerName, sellerName,
													dateOfCp, TransacAmount));
											System.out.println("sussfully add in json file\n");
										} else {
											System.out.println("no Sufficient amount in companyAccount");
										}
									} else {
										System.out.println("no sufficient share present in company\n");
									}
									break;
								default:
									System.out.println("please enter valide option\n");
									break;
								}
							}
						}
					}
				}
				if (!isCompanyPresent) {
					System.out.println("companyid is not present\n");
				}
				if (!isCustomerPresent) {
					System.out.println("customerId is not present\n");
				}
				break;
			case 3:
				System.out.println("thankyou for operation\n");
				break;
			default:
				System.out.println("Enter valide option\n");
				break;
			}
		}
		listOfCustomer.setCustomerList(customerList);
		listOfCompany.setListOfCompanyShare(companyList);
		operation.toWriteIntoFile(companyEditedPath, listOfCompany);
		operation.toWriteIntoFile(customerEditedPath, listOfCustomer);
		while (!queueList.list.isEmpty()) {
			tra = queueList.list.dequeue();
			System.out.println(tra.getBuyerName());
			System.out.println(tra.getDateTime());
			System.out.println(tra.getSellerName());
			System.out.println(tra.getTranAmount());
			System.out.println(tra.getTransactionId());
			System.out.println();
		}
		scanner.close();
	}
}

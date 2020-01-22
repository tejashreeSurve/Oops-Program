package com.bridgelabz.fellowshipprogram.oops.Stock.utility;

import java.util.Scanner;

public class Utility {
	static Scanner scanner = new Scanner(System.in);

	public static int isString() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter valide option\n");
		}
		scanner.close();
		return 0;
	}
}

package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a series of decimal integer values (separate them by a space): ");
		String userIntValues = scanner.nextLine();
		String[] intValues = userIntValues.split(" ");

		for (String theDecimalIntValue : intValues) {
			int decimalValue = Integer.parseInt(theDecimalIntValue);

			String binaryValue = Integer.toBinaryString(decimalValue);

			System.out.println(decimalValue + " in binary is " + binaryValue);
			scanner.close();
		}
	}
}

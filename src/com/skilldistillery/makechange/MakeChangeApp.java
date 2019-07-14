package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Hello cashier, what is the cost of your customer's item:  ");
		double cost = kb.nextDouble();

		System.out.println("How much did the customer pay? ");
		double tenderedAmount = kb.nextDouble();

		double endTransaction, changeOwed;

		if (tenderedAmount == cost) {
			System.out.println("Thank you for the business.");
		}

		else if (tenderedAmount > cost) {

			changeOwed = tenderedAmount - cost;
			System.out.println("The amount that is owed: $ " + changeOwed);

			int costNPennies = pennyConverter(changeOwed);
			makeChange(costNPennies);

		}

		else if (tenderedAmount < cost) {
			System.out.println("Insufficient funds.");

		}

		else {
			System.out.println("ERROR");

		}

	}

	public static int pennyConverter(double input) {
		int numberPennies;
		numberPennies = (int) ((input * 100) + 0.001);
		return numberPennies;
	}

	public static void makeChange(int costNPennies) {
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		if (costNPennies >= 2000) {
			twenties = costNPennies / 2000;
			costNPennies = costNPennies % 2000;

		}

		if (costNPennies >= 1000) {
			tens = costNPennies / 1000;
			costNPennies = costNPennies % 1000;
		}

		if (costNPennies >= 500) {
			fives = costNPennies / 500;
			costNPennies = costNPennies % 500;
		}

		if (costNPennies >= 100) {
			ones = costNPennies / 100;
			costNPennies = costNPennies % 100;
		}

		if (costNPennies >= 25) {
			quarters = costNPennies / 25;
			costNPennies = costNPennies % 25;
		}
		if (costNPennies >= 10) {
			dimes = costNPennies / 10;
			costNPennies = costNPennies % 10;
		}
		if (costNPennies >= 5) {
			nickels = costNPennies / 5;
			costNPennies = costNPennies % 5;
		}
		if (costNPennies >= 1) {
			pennies = costNPennies / 1;
			costNPennies = pennies % 1;
		}
		System.out.println("Twenties received back:" + twenties);
		System.out.println("Tens received back:" + tens );
		System.out.println("Fives received back:" + fives );
		System.out.println("Ones received back:" + ones );
		System.out.println("Quarters received back:" + quarters);
		System.out.println("Dimes received back:" + dimes );
		System.out.println("Nickels received back:" + nickels );
		System.out.println("Pennies received back:" + pennies );

	}
	
	


}

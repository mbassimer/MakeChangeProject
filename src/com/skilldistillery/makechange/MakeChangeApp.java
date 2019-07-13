package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Hello cashier, what is the cost of your customer's item?");
		double cost = kb.nextDouble();

		System.out.println("How much did the customer pay?");
		double tenderedAmount = kb.nextDouble();

		double remainingTotal, changeOwed;

		if (tenderedAmount == cost) {
			System.out.println("Thank you for the business.");
		}


		else if (tenderedAmount > cost) {

			changeOwed = tenderedAmount - cost ;
			System.out.println("The amount that is owed: " + changeOwed);

		}

		else if (tenderedAmount < cost) {
			System.out.println("Insufficient funds.");
		}
		
		else {
			System.out.println("ERROR");
		}

	}

	// In the cash register we will calculate the amount of change returned to a
	// customer based on the purchase price and the amount tendered. We will also
	// notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1,
	// .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change
	// should be provided using the largest bill and coin denominations as possible.
	// Denominations that are not used should not be displayed.

//Hint: Mod operator




//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.

//public static double changeOwed() {
//	Double totalQuarters;

//	switch {
//	case Quarters: (changeOwed % 25 != 0);
	
	
	
//	}
	
///	double changeOwed = 
	//	System.out.print("Change is owed :" + totalQuarters + " " + totalDimes + " " + totalNickels + " " + totalPennies + " "); 
	//	userChoice = kb.nextInt();

//	if (userChoice == randomComputerInt) {
//		System.out.println("You guessed correctly!");
//	} else if (userChoice < randomComputerInt) {
//		System.out.println("Your guess is lower than the computer's randomly generated number.");
//	} else {
//		System.out.println("Your guess is higher than the computer's randomly generated number.");
	}

//}while(custPay!=tenderedAmount);

//}

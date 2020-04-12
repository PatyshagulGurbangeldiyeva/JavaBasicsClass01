package com.syntax.class06;

import java.util.Scanner;

public class CompareNumberUsingNestedIf03 {

	public static void main(String[] args) {
		/*
		 * WRITE A PROGRAM TO ASK USER IF THERE IS A SALE IF NO SALE----> NOT GOING TO
		 * SHOPPING IF THERE IS SALE----> WE WILL ASK THE PRICE OF THE ITEM BASED ON THE
		 * PRICE WE WILL APPLY DISCOUNT AND CALCULATE THE PRICE
		 * 
		 * IF PRICE LESS THAN 20----> APPLY 10% IF PRICE BTW 20-100------> APPLY 20% iF
		 * PRICE BTW 100-500-----> APPLY 30% IF PRICE MORE THAN 500----> APPLY 50%
		 *
		 * OUT PUT IS:
		 * "After discount _________ the price of the item reduced from ______ to _______"
		 */

		// declare the values that we will use:

		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;

		scan = new Scanner(System.in);

		System.out.println("is there a sale?");
		sale = scan.nextLine();

		if (sale.equalsIgnoreCase("Yes")) {// ignore case ignoring the lower or upper case of letters
			System.out.println("What is the price of the item?");
			price = scan.nextDouble();

			if (price <= 20) {
				discount = price * 0.10;
				finalPrice = price - discount;
			} else if (price > 20 && price <= 100) {
				discount = price * 0.20;
			} else if (price > 100 && price <= 500) {
				discount = price * 0.30;
			} else {
				discount = price * 0.50;
			}
			finalPrice = price - discount;
			System.out.println(
					"After" + discount + " discount the price of the item reduced from " + price + " to " + finalPrice);

			// put this output in if part so you will not to initialize the price discount.
			// it is just belongs to if part!!!!!

		} else {
			System.out.println("We are not going to sale");
		}

	}
}
package com.syntax.class08;

import java.util.Scanner;

public class o2RecapWhile {

	public static void main(String[] args) {
		// WHILE

		/*
		 * Ask a user to pay for candy. As long as the entered price is not two we need
		 * ask we need keep ask for paying one amount is correct----> "Enjoy your candy
		 */

		Scanner input = new Scanner(System.in);
		double price;

		System.out.println("Please pay for a candy");
		price = input.nextDouble();

		while (price != 2) {
			System.out.println("Please pay for a candy");
		}
		System.out.println("Enjoy your candy");// if the user will give except 2 the other numbers the action will infinetely continue!!!!
	                                           // when we do not know how many times we need to repeat the action. So we use while loop.
	}

}

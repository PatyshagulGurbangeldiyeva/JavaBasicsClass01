package com.syntax.class08;

import java.util.Scanner;

public class o1RecapDoWhile {
	
	// DO WHILE RECAP

	public static void main(String[] args) {
		/*Ask a user to pay for candy.
		 * As long as the entered price is not two 
		 * we need ask 
		 * we need keep ask for paying
		 * one amount is correct----> "Enjey your candy
		 */

		Scanner s;
		double price;
		
		s=new Scanner (System.in);
		
		do {
			System.out.println("Please pay for a candy");
			price=s.nextDouble();
		}while (price!=2);
		System.out.println("Enjoy your candy");
	}

}

package com.syntax.class08;

import java.util.Scanner;

public class o8Task04 {

	public static void main(String[] args) {
	
		/*Write a program to ask a user to enter item they want to buy 
		 * and the price of that item.
		 *  Every time user enters money accumulate the amount
		 *   and tell the user how much is left to pay off the amount. 
		 *  If user give more money program should return a change. 
		 *  Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		Scanner input=new Scanner (System.in);
		String item;
		double price;
		double money;
		double amount=0;// total amount that he gave me in shopping. right now intially i dont have money
		double remainingBalance;
		double change;
		
				
		System.out.println("Please enter the item");
		item=input.nextLine();
		
		System.out.println("Please enter the price");
		price=input.nextDouble();
		
		do {
			System.out.println("Please give payment");
			money=input.nextDouble();
			
			amount=amount+money; // as he gives money we are saving in amount
			
			if (amount<price) {
			remainingBalance=price-money;
			System.out.println("Please give more "+remainingBalance);
			}else if (amount>price){
				change=money-price;
				System.out.println("Here is your change "+change);
				break;// icindekiler dogru ise tekrar yukariya gidecek
			}else {
				System.out.println("Correct payment");
			}
		
		}while (price!=money);
		System.out.println("Thank you for shopping");
}
}

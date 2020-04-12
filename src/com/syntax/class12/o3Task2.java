package com.syntax.class12;

import java.util.Scanner;

public class o3Task2 {

	public static void main(String[] args) {
		//Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.

		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter a string please :");
		String text = input.nextLine();
		if (!text.isEmpty()) {
			if (text.length() % 2 == 1 && text.length() >= 3) {
				//System.out.println(text.substring(1, text.length() - 1));
				System.out.println(text.charAt((text.length()-1)/2));
			} else {
				System.out.println("Even number of characters");
			}
		}
	}

}

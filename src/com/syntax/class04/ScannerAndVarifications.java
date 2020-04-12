package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVarifications {

	public static void main(String[] args) {
		/*
		 * in our program we want or goal is : 1. capture 2 numbers from a user 2.
		 * compare numbers 3.identify which is larger
		 */

		Scanner input = new Scanner(System.in); // importing it from java util. bring mouse on it and choose fro yellow
												// box

		System.out.println("Please enter first number");// explain what to do

		int num1 = input.nextInt();

		System.out.println("Please enter second number");
		int num2 = input.nextInt();

		// varifying or cheching

		System.out.println(num1);
		System.out.println(num2);

		// comparing two numbers

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println("Numbers are equal");

		}
	}

}

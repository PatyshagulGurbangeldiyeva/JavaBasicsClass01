package com.syntax.class06;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner scan;
		String country;
		String language;

		System.out.println("Enter your country please");
		scan = new Scanner(System.in);
		country = scan.nextLine();

		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "Turkmenistan":
			language = "Turkmen";
			break;
		case "Russia":
		language="Russian";
		    break;
		case "Usa":
		language="English";
			break;
		default:
			language="Unknown";
			
		}
		System.out.println("You are from "+country+" and you speak "+language);
	}

}

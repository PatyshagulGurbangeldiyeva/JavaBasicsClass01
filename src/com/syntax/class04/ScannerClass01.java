package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass01 {

	public static void main(String[] args) { // to write in a shourtcut main+cntl+space
		/* Scanner class: it takes input from a user
		 * we will provide input value from a console.
		 * That value will be taken and used in the program
		 */

		// the goal of this program is to capture name from a user and print in the format
		// "My name is _____"
		
		//1. Bring Scanner class into a program
		// System.in---> identifies keyboard
		
		Scanner scan=new Scanner(System.in); // put mouse on 'Scanner' word and choose import from the yellow box
		
		// instruct users of what program expects
		System.out.println("Please enter your name");
		
		//capture line .....
		String name=scan.nextLine();
		System.out.println("My name is "+name);// allowing us to write in console to write our name
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		System.out.println("I am "+age);
		
		System.out.println("My name is "+name+" I am "+age);
		
		
		
		
	
	}

}

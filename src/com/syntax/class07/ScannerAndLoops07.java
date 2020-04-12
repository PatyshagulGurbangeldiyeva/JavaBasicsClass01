package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops07 {

	public static void main(String[] args) {
		// we want to ask user's name and print it 5 times: "Good Afternoon_____"

		Scanner input=new Scanner (System.in);
		int num=1;
		
		while (num<=5){
		System.out.println("What is your name?");
		String name=input.nextLine();
		
		System.out.println("Good afternoon "+name);
		num++;
		}
	}

}

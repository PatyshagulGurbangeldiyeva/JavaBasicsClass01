package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your text");
		
		String text=scan.nextLine();

		System.out.println("Please enter the date");
         int date=scan.nextInt();
         
         
         System.out.println(text+" "+date);
         
	}
}

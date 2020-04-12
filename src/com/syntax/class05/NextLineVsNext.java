package com.syntax.class05;

import java.util.Scanner;

public class NextLineVsNext {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter any text"); //hello world lets write
		
		String text1=input.nextLine();// nextLine captures the whole line till the next line  all the spaces taken
		
		System.out.println("Please enter any text");
		
		String text2=input.next(); // differences btw nextLine and next. Next captures the charecters till the space
		
		System.out.println(text1);
		
		System.out.println(text2);
		
	}

}

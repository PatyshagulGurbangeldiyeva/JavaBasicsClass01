package com.syntax.class06;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */

		Scanner input = new Scanner(System.in);
		char grade;
		String explanation;

		System.out.println("Enter your grade please: A, B or C");
		grade = input.next().charAt(0);

		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		default:
			explanation="Not acceptable";

		}
		System.out.println("The grade is "+grade+" and it means "+explanation);

	}

}

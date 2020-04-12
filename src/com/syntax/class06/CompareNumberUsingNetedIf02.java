package com.syntax.class06;

import java.util.Scanner;

public class CompareNumberUsingNetedIf02 {

	public static void main(String[] args) {
		

		/*Write a program to find largest of three double values using if-else..
		 * if and logical operators provided by a user (numbers must be distinct)
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter three double values");
		
		double n1=input.nextDouble();
		double n2=input.nextDouble();
		double n3=input.nextDouble();
		
		
		double largest;
		
		if (n1>n2) {
			if (n1>n3) {
				largest=n1;
			}else {// we already know that n1>n2 but it can be n1<n3 so n3 will be the largest in else
				largest=n3;
			}
		}else {//n2>n1
			if (n2>n3) {
				largest=n2;
			}else {
				largest=n3;
			}
		}
		System.out.println("Largestn number is "+ largest);
		}
	}



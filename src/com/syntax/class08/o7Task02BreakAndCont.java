package com.syntax.class08;

import java.util.Scanner;

public class o7Task02BreakAndCont {

	public static void main(String[] args) {
		
		System.out.println("--------------------TASK 1------------------------");
		System.out.println(" ");
		/*Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range 
		 *  prints the sum of the even and odd integers.
		 */

		Scanner input=new Scanner (System.in);
		int totalEven=0;
		int totalOdd=0;
		System.out.println("Please enter two numbers");
		int min = input.nextInt();// eneter 10
		int max=input.nextInt(); // eneter 20
			
		for (int i=min;i<=max;i++) {
			if (i%2==0) {
				totalEven=totalEven+i;
			}else {
				totalOdd=totalOdd+i;
			}
			
		}System.out.println("The total of even numbers between "+min+"to "+max+" is"+totalEven);
		System.out.println("The total of odd numbers between "+min+"to "+max+" is"+totalOdd);
	
	
		
		
		
		
		
		
	
			
	}
		
		
		
	}


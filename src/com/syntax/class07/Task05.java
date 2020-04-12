package com.syntax.class07;

public class Task05 {

	public static void main(String[] args) {
		//2. how to print odds number from 1-20
		

		// how to print odd numbers 1-20;

		// FIRST WAY:
	int num1 = 1;
	while (num1 <= 20) {
	System.out.print(num1+" ");
	num1++;

		}
	System.out.println(" ");

		System.out.println("*********************");

		// SECOND WAY:
		int num3 = 1;
		while (num3 <= 20) {
			if (num3 % 2 ==1) 
				
				System.out.print(num3+" ");
				num3++;
			
			
		}

	}

}

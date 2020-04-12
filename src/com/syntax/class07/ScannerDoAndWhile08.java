package com.syntax.class07;

import java.util.Scanner;

public class ScannerDoAndWhile08 {

	public static void main(String[] args) {
		// we are playing a lottery and lucky number is 17
		// we want to keep asking user any number from 1-20
		// until he guess the lucky number the output is "Congratulations"
		
		Scanner input=new Scanner (System.in);
		int num;
		int luckyNumber=17;
		
		do {
			System.out.println("Please enter the lucky nuumber from 1-20");
			num=input.nextInt();
			}while (num!=luckyNumber);
		System.out.println("CONGRATULATION");
			
			// do will be executed till the while will be true
		
		
		// we use DO when we do not know how many times we need to repeat the block of codes
		
		
			
	
		}
}


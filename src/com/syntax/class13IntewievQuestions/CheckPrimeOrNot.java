package com.syntax.class13IntewievQuestions;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		// write a java program to check whether a given number is prime or not
		
		// prime number is a number which is divisible by one and itself
		// prime number is greater than 1 prime>1
		// prime numbers are: 2,3,5,7,11,13,17,19,23....
		
		int given=11; // let's check is 7 prime or not
		boolean isPrime=true;
		
		// first you need to check is this number greater than 1
		
		if (given>1) {
			for (int i=2; i<given;i++) { // here we start i with 2 coz every number is divisible by 1
				if (given%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		
		System.out.println("given number "+given+" is prime?"+ isPrime);
		

	}

}

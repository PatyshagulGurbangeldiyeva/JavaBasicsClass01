package com.syntax.class15;

public class o8TaskPrime {
	// Write a method to return whether given number is prime or not?
	
	boolean isPrime (int a) {
		boolean isPrime=true;
		for (int i=2;i<a; i++) {
			
				if (a%2==0) {
					isPrime=false;
					break;
				}else if (a==i){
					isPrime=true;
					
			}
				
		}
		return isPrime;
		
	}

	public static void main(String[] args) {
		
		o8TaskPrime obj=new o8TaskPrime();
		boolean isPrime=obj.isPrime(3);
		System.out.println(isPrime);

	}

}

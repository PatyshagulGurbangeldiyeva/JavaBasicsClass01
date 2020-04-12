package com.syntax.class13IntewievQuestions;

public class PrintFirst10NumbersOfFebonacci {

	public static void main(String[] args) {
		// write Java program to print first 10 fibonnaci numbers 
		// 0 1 1 2 3 5 8 13 21 33
		
		int a,b,c; // here we use three numbers as coding is repeatin---> a+b=c
		a=0; // the start of series is 0 and 1 so we assigned it
		b=1;
		
		for (int i=1; i<=10; i++) {
			System.out.print(a+" ");// we want to start with 0 so we write (a+"") then under it the codes will be printed
			c=a+b;
			a=b;
			b=c;
		}
		
		

	}

}

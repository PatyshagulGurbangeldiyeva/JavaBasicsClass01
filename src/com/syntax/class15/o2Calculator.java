package com.syntax.class15;

public class o2Calculator {
	// define methods to calculate addition, subtraction, multiplication and division
	
	void add(int a, int b) {
		
		System.out.println(a+b);
	}
	void sub(int a, int b) {
		
		System.out.println(a-b);
				
	}
	void mul(int a, int b) {
		
		System.out.println(a*b);
	}
	void div(int a, int b) {
		
		System.out.println(a/b);
	}
	

	public static void main(String[] args) {
		// let's test all the function that we created in class
		
		o2Calculator test=new o2Calculator();
		test.add(100,200); // if you will use this method then you can use many values as you want. 
		test.sub(500,300); // it is not restricted
		test.div(1000,250);
		test.mul(25,4);
		
		

	}

}

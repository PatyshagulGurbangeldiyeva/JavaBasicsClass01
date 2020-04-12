package com.syntax.class21;

public class OverloadingAddition {
	
	// Method overloading by changing number of parameters
	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	void add (int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	void add(int num1, int num2, int num3, int num4) {
		System.out.println(num1+num2+num3+num4);
	}
	// Method overloading by changing type of parameters
	
	void add (double num1, int num2) {
		System.out.println(num1+num2);
	}
	void add (int num1, double num2) {
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		

	}

}

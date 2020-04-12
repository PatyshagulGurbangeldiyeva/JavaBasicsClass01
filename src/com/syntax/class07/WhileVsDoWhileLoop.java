package com.syntax.class07;

public class WhileVsDoWhileLoop {

	public static void main(String[] args) {
		// print helli 11 times
		
		int num=11;  // here is the condition is 11 but while wants to have numbers smaller than 5. so it will not go to while
		while (num<5) {
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("**************DO WHILE LOOP*************");
		
		// print hello 11 times
		
		
		int num1=8;
		do { // inside of these block we write what we want to execute. if it is true it will be executed
			System.out.println("Hello");// even a condition is false the do will execute but while not.
			num1++;
		}while (num1<=11);// outside of this block we execute that is false
		
		//your do will be executing until the while is true. when while gets false then it stops executing
	}

}

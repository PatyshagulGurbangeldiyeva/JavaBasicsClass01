package com.syntax.class18;

public class O4Task1 {
	/* Write a program that will have a constructor:
	 *  one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.
	 */

	String str;
	int num;
	protected O4Task1 (){
		System.out.println("This constructor without parameters");
	}
	
	O4Task1(String strIn, int numIn){
		str=strIn;
		num=numIn;
		
	}
	protected void printAll() {
		System.out.println("this "+str+" has "+num+" sentences");
	}
	
}

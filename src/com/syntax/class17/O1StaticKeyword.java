package com.syntax.class17;

public class O1StaticKeyword {
	
	// create a template for phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	// return type, name and parameters
	
	static void displayGenerealInfor() { // this is method header
		System.out.println("we are building "+brand+" with touch screen= "+touchScreen); // this is method body
	}
	
	void displaySpecification() {
		System.out.println("We are building with "+memory+" GB memory in "+color+" color");
	}

	public static void main (String [] args) {
		
		// how to access static variables:
		brand="iPhone"; // as we are in the same class we can just use the name of the brand
		touchScreen=true;
		
		// how to access instance variables:
		// we need to specify color and memory
		// as they are instance variable we will specify obj
		O1StaticKeyword obj=new O1StaticKeyword();
		obj.color="grey";
		obj.memory=64;
		
		
		// how to access static method:
		displayGenerealInfor();
		
		obj.displayGenerealInfor();// you can also access as instance variable to static but it is not preferable
		
		// how to access instance method:
		obj.displaySpecification();
		
		
	}
	
	
}

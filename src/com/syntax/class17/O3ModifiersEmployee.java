package com.syntax.class17;

public class O3ModifiersEmployee {
	
	// create variables to hold: name, last name, title, ssn and salary;
	// also modify them. what kind of changes they will have
	
	public static String title; // I want to make this variable to visible everybody and it will be the same title for everybody
							// so I added public: visible to everybody, added static: it will have the same features
	
	
	public String name;  // if there is public it means there is no restriction. any other classes can access my variables
	                     // you can access them within the other packages
	
	protected String lastName;// they are accessible with the same package
	double salary; // if there is no access variable written it means it is default!!!. accessible within the same package
	
	private int ssn;// it is accessible within the same class
	
	
	public static void method1() {
		System.out.println("I am public method");
	}
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
		System.out.println("I am default method");
	}
	private void method4() {
		System.out.println("I am private method");
	}
	
	// let's access the methods and variables
	// we are in the same class
	// in order to access them you need to create main class:
	
	public static void main (String []args) {

		// accessing variable
	O3ModifiersEmployee emp=new O3ModifiersEmployee();
	emp.name="John";
	emp.lastName="Smith";
	emp.salary=999440;
	emp.ssn=63820273;
	
	// accessing methods
	
	
	
	}
	
}

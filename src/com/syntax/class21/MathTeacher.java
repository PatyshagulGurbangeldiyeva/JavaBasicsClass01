package com.syntax.class21;

public class MathTeacher extends Teacher {
	// here we created child class
	// this class also have the same variables as name and last name
	
	public MathTeacher(String name, String lastName) {
		// super(); here we have this one even we did not write it
		// so it will automatically call default constructor in parent class
		// if there (parent class) we have default constructor then it will exist
		// compiler can make only default constructor 
		
		super(name, lastName); // here we want to call explicitely
		System.out.println("I am a child class constructor");
	}

}

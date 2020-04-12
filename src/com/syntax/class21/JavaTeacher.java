package com.syntax.class21;

public class JavaTeacher extends Teacher { // here we make relationship with teacher class

	// here you have to create ur own constructer
	// as compiler implicitelly calling 
	// default constructor and by using super();
	// as in parent class there is no default constr it will give CE
	
	String certification;
	JavaTeacher(String name, String lastName, String certification){
		super(name, lastName); // here we are calling parent class constructor
	   this.certification=certification;
	}
	
	// here we cannot have default constructor as parent class did not have it.
	// if parent class have default constructor then we can create in child class
	}

package com.syntax.class21;

public class Teacher { 
	// we created one class and defined variables
	// then we created 2 constructors--> with non argument and argument
	
	String name, lastName;

	
	 public Teacher (){ System.out.println("I am a parent construcotor"); }
	 
	public Teacher (String name, String lastName) {
		this.name=name;
		this.lastName=lastName;
	}

}



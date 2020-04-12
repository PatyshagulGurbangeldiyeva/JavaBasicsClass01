package com.syntax.class21;

public class ProgrammingLanguage {
	String name; // every class take care of their own variables
					// so make constructor!!!
	String variable;
	public ProgrammingLanguage(String name, String variable) {
		this.name=name;
		this.variable=variable;
	}

}

class Java extends ProgrammingLanguage{
	String constructor;
	
	Java(String name, String variable, String constructor){
		super(name, variable); // as we did not want to make hard coding we add name and variable to parameters of Java constructor 
		this.constructor=constructor;
	}
	public  void details() {
		System.out.println(name+" can have variables "+variable+" and constructor "+constructor);
	}
}

package com.syntax.class16;

public class o3InstanceVariables {
	String name= "Ali"; // this variable is called instance variable

	public static void main(String[] args) {
		
		String name="Yunus";
		System.out.println(name);// here you will print Yunus. it is local variable
		
		
		o3InstanceVariables obj=new o3InstanceVariables();
		System.out.println(obj.name);// here we will print Ali. it is called instance variable. 
										// as we are getting from the other method this variable
		

	}

}

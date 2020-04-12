package com.syntax.class01;

public class VariablesDeclaration {

	public static void main(String[] args) {
		// create a variable and store value
		// 1. declaring variable and assigning
		
		boolean b=true;
		
		//2. 1 step: declare variable
		//   2. step: assign value
		
		int i;
		i=1000;
		
		// declare multiple variables and assign value
		
		char x,y,z;
		x='A';
		y='@';
		z= '*';
		
		// we cannot have variables with the same name in one program 
		// double i=12.99; java will complain
		
		z='#';// ressign the value
		i=2000;
		
		System.out.println(i);
		

	}

}

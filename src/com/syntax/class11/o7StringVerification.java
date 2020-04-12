package com.syntax.class11;

public class o7StringVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message="Welcom Admin";
		
		// you have to verify that message contains the user name instead of admin
		// i need to find if it is contains admin and welcome
		
	System.out.println("contains FUNCTION");
			System.out.println(message.contains("Admin"));// if it contains Admin then the result will be T or F
			
			boolean flag=message.contains("Welcome"); // it will give F as before written Welcom
			System.out.println(flag);
			
			System.out.println();
			
			System.out.println("startsWith() FUNCTION");
			// we want to see if welcomE msg start with Welcome
			
		boolean start =message.startsWith("Welcome");
		System.out.println(start); // the output will be fals as started with Welcom. no e at the end
		
		System.out.println();
		
		System.out.println("endsWith() FUNCTION");
		// we want to see that the welcome msg ends with username 
		
		String username="Admin";
		boolean ends=message.endsWith("Admin");
		System.out.println(ends);
		System.out.println(message.endsWith("Wepa"));
		
		
		}
		
	}



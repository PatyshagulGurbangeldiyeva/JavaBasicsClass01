package com.syntax.class11;

public class o6StringValidation {

	public static void main(String[] args) {
	
		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		
		// to compare 2 strings
		System.out.println("equals() equalsIgnoreCase() FUNCTION");// this function will give the answer T or F
		System.out.println(str1.equals(str2)); // as we are comparing them
		System.out.println(str1.equalsIgnoreCase(str2));// burda ignore wt diyor upper lower caslari. o yuzden t cikar

		
		System.out.println();
		
		
		
		String expected="Hello - Syntax Technologies";
		String actual="   Hello - Syntax Technologies  ";
		
		if (actual.equals(expected)) {
			System.out.println("Test case passes. Titeles are matched"); // here the output will be not matched 
		}else {															// as we have spaces.
			System.out.println("Test case fails. Titeles are NOT matched");
		}
		System.out.println();
		System.out.println("First trim and then compare. if you want to cut spaces");
		if (actual.trim().equals(expected)) {  // as out put the same but just we have spaces we can cut spaces
			System.out.println("Test case passes. Titeles are matched"); // by using trim function
		}else {
			System.out.println("Test cas fails. Titeles are NOT matched");
		}
	}

}

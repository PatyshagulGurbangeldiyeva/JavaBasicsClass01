package com.syntax.class17;

import com.syntax.class18.O6Task3;

public class O7Task3 {
	
	/*Create a method that will accept a String as a parameter 
	 * and return a new String that consist only of vowels.
	 *  Method should be available inside the class where it was declared 
	 *  and executed by calling it is name.
	 */

	private static String callVowels(String word) {
		String vowels = null;
		for (int i=word.length()-1; i>=0; i--) {
			vowels=word.replaceAll("[^A,E,I,O,U,a,e,i,o,u]", "");
		}
		
		return vowels;
	}
	public static void main(String[] args) {
		String vowels=(O7Task3.callVowels("hello"));
		System.out.println(O7Task3.callVowels("hello"));
		System.out.println(O7Task3.callVowels("patyshagul"));

		O6Task3 obj=new O6Task3();
		/*
		 * O6Task1 obj1=new O6Task1(6); O6Task1 obj2=new O6Task1(4,6); O6Task1 obj3=new
		 * O6Task1("Hello");
		 */
		
	}

}

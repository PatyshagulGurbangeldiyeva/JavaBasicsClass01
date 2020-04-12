package com.syntax.class12;

public class o8Task5 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special characters.
		// Find out how many alpha characters are there in the String.

		String combination="I was born 12.05.1987 *****";
		
		String alpha=combination.replaceAll("[^A-Za-z]", " ");
		System.out.println(alpha);
		String []word=alpha.split(" ");
		for (int i=0; i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		
	}

}

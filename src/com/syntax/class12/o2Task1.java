package com.syntax.class12;

public class o2Task1 {

	public static void main(String[] args) {
		// Create a String 
		// and print it in reverse order (Sunday → yadnuS).

		String day="Sunday";
		for (int i=5; i>=0;i--) {
			char letter=day.charAt(i);
			System.out.print(letter);
		}
		System.out.println();
		
		String lett=day.substring(3,4);
		System.out.println(lett);
		
	}

}

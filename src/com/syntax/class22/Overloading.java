package com.syntax.class22;

public class Overloading {

	
		public static void main (int []args) {
			System.out.println("method with int array argumetns");
	}
		public static void main (String args) { // access modifiers and static do not affect the overloading
			System.out.println("Method with String argument");
		}
		 static void main (String str, String args1) {
			System.out.println("Method with 2 string argument");
		}
		public static void main(String[] args) { // java will look first to this main method with this signatur
			System.out.println("Method with string array arguments");
		
		
		// if you want to execute other methods you can call by their names as the methods are static
		// if it is not static you need to creat obj
			// you need to put this methods in main methods in order to print them!!!!
		
		main(new int [2]); // here we created array with 2 elements
		// or you can call 
		// int []array= new int[2];
		main("Hello");
		Overloading.main("Hello","world");
		}
}

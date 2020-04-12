package com.syntax.class12;

public class o7Task4 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence.
		// Write a program to get a new String without any spaces.

String name="Hello my name is Paty";
String [] array=name.split(" ");
for (int i=0; i<array.length;i++) {
	System.out.print(array[i]);
}
	}

}

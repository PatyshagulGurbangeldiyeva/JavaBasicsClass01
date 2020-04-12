package com.syntax.class10;

public class o3RegularAndAdvancedForLoopInArray {

	public static void main(String[] args) {

		System.out.println("Getting all elements by using for loop");

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// we will use for loop getting all elements 

		int a=grades.length;
		System.out.println(a);
		System.out.println();
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");

		}

		System.out.println();
		System.out.println("Printing all elements by using advanced for loop");

		for (char point : grades) {
			System.out.print(point + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("create an array of fruit and retrieve all elements");
		// here we will use advanced for loop

		String[] fruits = { "Apple", "Kiwi", "Orange", "Mango" };
		for (String fruitName : fruits) {
			System.out.println(fruitName);
		}

		System.out.println();
		System.out.println();
		System.out.println("Second way using regular for loop");
		for (int i=0; i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
	}

}

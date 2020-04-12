package com.syntax.class10;

public class o4ForIfConditionInArray {

	public static void main(String[] args) {
		// we want to print : this is your favorite fruit
		
		System.out.println("USING FOR LOOP AND IF TO PRINT ALL THE ELEMENTS");

		String[] fruit = { "Kiwi","Apple",  "Orange", "Mango" };
		for (String fruitName : fruit) {
			if (fruitName.equals("Apple")) {
				System.out.println(fruitName+" is my favorite fruit");
			}else {
				System.out.println(fruitName);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("USING REGULAR FOR LOOP");
		
		for(int i=0; i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
			
	}

}

package com.syntax.class05;

public class NotCondition {

	public static void main(String[] args) {
	
		boolean b=true;
		boolean val=false;
		
		System.out.println(b);// the output will be true
		System.out.println(val);// the output will be false

		System.out.println("------------------------------");
		
		System.out.println("USING NOT");
		
		boolean c=true; // it is converted to flase as it has ! before the true
		
		if (!c) { // it is not ture 
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
			
			//example
			
			String day1="Monday";
			String day2="Friday";
			
			// if it is not monday or friday-----> find me at Syntax
			
			if (!(day1.equals("Monday")|| day2.equals("Friday"))) {
				System.out.println("Find me at Syntax");
			}
		}
	}

}

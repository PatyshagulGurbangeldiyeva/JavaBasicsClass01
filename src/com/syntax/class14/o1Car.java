package com.syntax.class14;

public class o1Car { // when we are creating a class in order to create features and actions we do not create main class!!!

	// if you want to make it as a tample 
	// you don't need here main class
		
	
	
	// define feature of the car
		
		String make; // make is a variable (feature)
		String model; 
		int year;
		String color;
	    String drive;
		
		// define behavior (here we are creating methods). they (behavior) usually in words
		void drive () 
		{
			System.out.println(make+" can drive"); // each method will have open parenthesis and close parenthesis
		}
		void accelerate ()
		{
			System.out.println(make+" can accelerate"); // you cannot create in one method another method!!!!
		}
		void makeNoice()
		{
			System.out.println(make+" can make noise");
		}	
		void stop ()
		{
			System.out.println(make+" can stop"); // inside of behavior (stop()) there can be many codes
			System.out.println(make+" stops whe you make break");
		}
		
		
	}



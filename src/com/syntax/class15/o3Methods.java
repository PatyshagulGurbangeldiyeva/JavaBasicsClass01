package com.syntax.class15;

public class o3Methods {
	
	//  create a method that will say "welcome" 10 times
	void sayWelcome() {
		for (int i=1; i<11;i++) {
			System.out.println(i+" Welcome");
		}
		
		// create a method that will say any word #number (we don't know the word and haw many times)
			
			
		}
	void sayAnything (String word, int times) {
		for (int i=1; i<=times;i++) {
			System.out.println(i+" "+word);
		}
	}
	
	// create a method isItRaining
	// that will accept boolean values as a parameter
	// and based on the value it will print message accordingly
	
	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go for a walk");
		}
	}

	
	
	public static void main(String[] args) {
		System.out.println("create a method that will say \"welcome\" 10 times");
		o3Methods test=new o3Methods();
		test.sayWelcome();
		
		System.out.println();
		System.out.println("reate a method that will say any word #number (we don't know the word and haw many times)");
		System.out.println("printing second method");// here we are adding the word and how many times we want to print 
		o3Methods sayAny=new o3Methods();
		sayAny.sayAnything("Hello", 2);
		
		
		
		System.out.println();
		System.out.println("Is it raining method");
		
		o3Methods answer=new o3Methods();
		answer.isItRaining(true);// depends what you want to use true or false
		answer.isItRaining(false);

	}

}

package com.syntax.class15;

public class o4Task {
// 1. create a method that will take 2 parameters as a number and prints which number is larger
	
	void largest (int a, int b){
		
		if (a>b) {
			System.out.println("the largest number is "+a);
		}else {
			System.out.println("the largest number is "+b);
		}
	}
	
	// 2. Create a method that will take a number and prints whether the number is even or odd.
	void oddEven(int a) {
		if (a%2==0) {
			System.out.println(a+ " is an even number");
		}else if (a%2!=0) {
			System.out.println(a+" is an odd number");
		}
	}
	
	// 3. Create a method that will print whether given String is palindrome or not.
	
	void polindrome(String word) {
		String reverse="";
		for (int i=word.length()-1;i>=0; i--) {
			reverse=reverse+word.charAt(i);
		}
		if (reverse.equals(word)) {
			System.out.println("It is polindrome");
		}else {
			System.out.println("It is not a polindrome");
		}
	}
	
	//4. Create a method that will say Hello in different language
	// based on the country that will passed when method is executed. 
	
	void greeting(String word) {
		
		if (word.equalsIgnoreCase("hello")) {
			System.out.println(" USA, UK");
			
		}else if (word.equalsIgnoreCase("Salam")) {
			System.out.println("Turkmenistan");
		}else if (word.equalsIgnoreCase("Merhaba")) {
			System.out.println("Turkey");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("task1");
		o4Task biggest=new o4Task();
		biggest.largest(10, 6);
		biggest.largest(3, 11);
		
		System.out.println();
		System.out.println("Task 2");
		o4Task number=new o4Task ();
		number.oddEven(10);
		number.oddEven(11);
		
		System.out.println();
		System.out.println("task3");
		o4Task poli=new o4Task ();
		poli.polindrome("car"); 
		poli.polindrome("bob");
		
		System.out.println();
		System.out.println("task4");
		o4Task greet=new o4Task ();
		greet.greeting("hello");
		greet.greeting("salam");
	}

}

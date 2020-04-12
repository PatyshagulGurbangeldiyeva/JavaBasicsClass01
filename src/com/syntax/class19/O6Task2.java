package com.syntax.class19;

public class O6Task2 {
	
	/*Write program as a Book class  
	 *  that will have 2 Constructors.
	 *   While creating an object make sure:
	 *   Instance variables are being initialized
	 *   Both Constructors are being executed
	 */
		
	String book;
	int x;
	
	O6Task2(String book){
		this (5); // this every time comes in first line!!!
		this.book=book;
		System.out.println("I am a constructor of string "+book);
	}
	O6Task2 (int x){
		this.x=x;
		System.out.println("This book has "+ x+ " pages");
	}
		

	public static void main(String[] args) {
		
		O6Task2 obj=new O6Task2("book");
		

	}

}

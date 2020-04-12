package com.syntax.class18;

public class O6Task3 {
	/* Write a program  that will have 4 different access levels of constructors
	 *  and create 3 objects of this class: 
	 *  1 - inside same class; 
	 *  2 - from outside the class; 
	 *  3 - from different class inside different package 
	 *   and observe result.
	 */
	
	/* USING STATIC
	 * static O6Task1() {
	 *  CE give invalid modifier }
	 */
	
	public O6Task3() {
		System.out.println("public constroctor");
	}
	O6Task3(int num){
		System.out.println("default constructor");
	}
	protected O6Task3( int num1, int num2) {
		System.out.println("protected constructor");
	}
	private O6Task3(String str) {
		System.out.println("private ocnstructor");
	}
	
	public static void main (String []args) {
		O6Task3 obj=new O6Task3(); //public: you can see it different packages and classes
		O6Task3 obj1=new O6Task3(6); // default: you can see it same package and different classes
		O6Task3 obj2=new O6Task3(4,6);// protected: you can see it same package and different classes
		O6Task3 obj3=new O6Task3("Hello");// you can see it different packages and classes
		
	}
   
}

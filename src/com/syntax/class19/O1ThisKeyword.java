package com.syntax.class19;

public class O1ThisKeyword {
	
	int a;
	int b;
	public O1ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	
	public O1ThisKeyword(int a, int b) {
		this.a=a; // here we used this. keyword as we did not change the name of variable that we declared as instance variable
		this.b=b;
	}
	public void sum(int a, int b) {
		//System.out.println("sum of local variables: "+(a+b));// variables that are in  method
		System.out.println("sum of instance variables: "+(this.a+this.b));// accessing to instance variables
	}

	public static void main(String[] args) {
		O1ThisKeyword obj=new O1ThisKeyword(10,20); // the first will be printed obj sum=>300
		obj.sum(100,200); // in the first line we initialize the instance variables then go to botttom. printed as method wants
		
		System.out.println("====================");
		O1ThisKeyword obj2=new O1ThisKeyword();// here initializing and calling the constructor
		obj2.sum(30, 20); // here we are entering to the method and executing them 
		
	}

}

package com.syntax.class19;

public class O3ConstructorCall {
	
	public O3ConstructorCall() {
		System.out.println("I am not argument constructor");
	}
	public O3ConstructorCall(String str) {
		this();
	}
	public O3ConstructorCall(String str, String str1) {
		this("Hello");// calling constructor that have one parameter
	}

	public static void main(String[] args) {
		O3ConstructorCall obj=new O3ConstructorCall("Java", "love");

	}

}

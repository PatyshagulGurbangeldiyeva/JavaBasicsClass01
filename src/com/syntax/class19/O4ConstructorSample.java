package com.syntax.class19;

public class O4ConstructorSample {
	
	O4ConstructorSample(){
		this (1);
		System.out.println("Hi");
	}
	O4ConstructorSample(int x){
		this (1,2);
			System.out.println("Hello");
		}
	O4ConstructorSample (int x, int y){
		System.out.println("How are you");
	}
	
	public static void main(String[] args) {
		
		O4ConstructorSample obj=new O4ConstructorSample();
		// first constructor will look to the this() codes then if there is still things print in constructor it will go one by one
		// from bottom to top. step by step goes to the top

		
	}

}

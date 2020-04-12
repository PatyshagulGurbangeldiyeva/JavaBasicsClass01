package com.syntax.class03;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y= "Bye";
		
		System.out.println(a+b+x+y);// when to numeric come together the system will add them
		System.out.println(a+x+b+y); // when there is string and numeric sign they will just concantenate
		System.out.println(x+y+(a+b)); // use paranthesis after string if you want to add two numeric
		System.out.println(a+""+b+x+y);// if you just want to write numerics without opereation use "" btw them

	}

}

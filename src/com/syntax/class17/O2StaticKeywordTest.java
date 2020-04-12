package com.syntax.class17;

public class O2StaticKeywordTest {

	public static void main(String[] args) {
		// let's access the features from O1StaticKeyword class
		
		// access variable from different class
		
		O1StaticKeyword.brand="Android";
		O1StaticKeyword.touchScreen=true;
		O1StaticKeyword.displayGenerealInfor();
		
		// access instance variables from different class
		
		O1StaticKeyword obj1=new O1StaticKeyword();
		obj1.color="red";
		obj1.memory=128;
		
		obj1.displaySpecification();

	}

}

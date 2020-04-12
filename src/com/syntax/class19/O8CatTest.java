package com.syntax.class19;

public class O8CatTest {

	public static void main(String[] args) {
		
		// first let's take features and behaviors from big class
		O8CatClass cat=new O8CatClass(); // here you need to call catClass. as it extenden with Animal class
		cat.color="white";
		cat.fur="medium";
		cat.size="small";
		cat.beWild();
		cat.eat();
		
		// access features and behaviors from own class
		
		
		cat.mustach="it has mustach";
		cat.miyaw();
		
		

	}

}

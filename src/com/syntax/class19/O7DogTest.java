package com.syntax.class19;

public class O7DogTest { 

	public static void main(String[] args) {
		// lets create dog
		
		O7DogExtend dog=new O7DogExtend();
		// access variables from own class
		dog.breed="Husky";
		
		// access variables from parent class
		dog.fur="Too much";
		dog.size="big";
		dog.color="grey";
		
		// access methods from own class
		dog.bark();
		
		// access methods from parent class
		dog.sleep();
		dog.eat();
		dog.beWild();
		
		
		

	}

}

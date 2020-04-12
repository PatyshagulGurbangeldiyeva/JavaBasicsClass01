package com.syntax.class18;

public class O2ConstructorCreating {
	
	// create your own constructor:
	//  1. name must be same as class name
	//  2. no return type
	
	O2ConstructorCreating(){ // IT IS NON ARGUMENT CONSTRUCTOR AS THERE IS NO PARAMETER
		System.out.println("I am a constructor");
	}
	O2ConstructorCreating (String str){
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	O2ConstructorCreating (int num){
		System.out.println("I am a constructor with 1 integer value "+num);
	}
	O2ConstructorCreating (String str, int num){   //in order to concatenate two constructors
		System.out.println("Constructor with two parameters: "+str+" and "+num);
	}
	void O2ConstructorCreating() {
		System.out.println("I do not know who I am");
	}
	

	public static void main(String[] args) {
		
		O2ConstructorCreating obj=new O2ConstructorCreating(); // first you will execute the constructor
		
		System.out.println("code after constructor"); // then it will execute what you wrote

		O2ConstructorCreating obj1=new O2ConstructorCreating("Today is Java");
		
		O2ConstructorCreating obj2=new O2ConstructorCreating(4);
		
		// let's Concatenate two or more constructors:
		
		O2ConstructorCreating obj3=new O2ConstructorCreating("Hello",6);
		obj.O2ConstructorCreating(); // here we print our method.
		
		
		
	}

}

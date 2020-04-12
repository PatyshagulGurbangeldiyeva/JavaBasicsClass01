package com.syntax.class16;

public class o4DogExampleStaticVariable {
	// instance variables
	String name, size;
	int age;
	
	//static variables
	static String breed=" Husky"; // all the static are the common features of all dogs
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	
	void displayDog() {
		System.out.println("Dog name is "+name+" and it is "+size+", it is "+age+" years old");
		System.out.println("dogs breed is "+breed+" and it has "+tail+" tail and "+eyes+" eyes");
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		
		// how to access instance variables??? ---> by creating an object and using reference variable
		o4DogExampleStaticVariable dog1=new o4DogExampleStaticVariable();
		
		dog1.name="Lucy";
		dog1.size="big";
		dog1.age=5;
		dog1.age=6; // here I changed the age of the dog1. so it is 6 right now not 5
		dog1.age=7;
		dog1.displayDog(); // it is a code. so you need to create in in class!! you can change it by creating this code
		
		
		
		// how to access static variables???--->static variables belong to the class--> accessed by className
		System.out.println(o4DogExampleStaticVariable.breed);// you can use this access if you are not in the same class or in the same class
		System.out.println(o4DogExampleStaticVariable.tail);// it will give the result of tail that we declared in class!!
		System.out.println(breed);// you can access in that way because both of them in the same class
		
		o4DogExampleStaticVariable dog2=new o4DogExampleStaticVariable();
		dog2.name="Sharik";
		dog2.size="small";
		dog2.age=2; // lets change the age
		dog2.age=5;
		dog2.displayDog();
		
		
		

	}

}

package com.syntax.class14;

public class o3Dog {
	String size;
	String breed;
	String color;
	int age;
	String name;
	
	// you can write it anywhere instead of inside the MAIN METHOD. as it is outside of main method it is ok being here
	void eat() {
		System.out.println(name+" can eat");
	}
	void sleep () {
		System.out.println(name+" can sleep");
	}
	void run() {
		System.out.println(name+" can run");
	}
	void bark () {
		System.out.println(name+" can bark");
	}

	public static void main (String [] args) { // everything in this method will be executed!!!!
		
		o3Dog dog1=new o3Dog();
		dog1.size="small";
		dog1.breed="Shih tzu";
		dog1.color="brown";
		dog1.age=2;
		dog1.name="Lucy";
		
		dog1.eat(); // this will be the output
		dog1.sleep();
		dog1.run();
		dog1.bark();
		
		
		System.out.println();
				
		o3Dog dog2=new o3Dog();
		dog2.size="big";
		dog2.breed="buuldog";
		dog2.color="black";
		dog2.age=1;
		dog2.name="Dock";
		
		dog2.eat();
		dog2.sleep();
		dog2.run();
		dog2.bark();
		
		
		
		
		
		
	}
	

	
	

}

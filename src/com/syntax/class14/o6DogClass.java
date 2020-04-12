package com.syntax.class14;

public class o6DogClass {
	// Create a Dog Class 
	// and create 3 different objects of it: Husky, Bulldog, Labrador
	// with specific attributes and behaviors
	
	String breed;
	String color;
	String size;
	int age;
	
	void bark()
	{System.out.println(breed+" can bark"); }
	
	void run() 
	{System.out.println(breed+" can run"); }
	
	void eat()
	{System.out.println(breed+ " can eat"); }
	
	public static void main (String []args) {
		
		o6DogClass husky=new o6DogClass();
		
		husky.breed="Husky";
		husky.color="white";
		husky.size="small";
		husky.age=1;
		
		System.out.println("This dog is "+husky.breed+" and it has "+husky.color+" color. it is "+husky.size+" and it is "+husky.age+" year old");
	husky.bark();
	husky.run();
	husky.eat();
	
	System.out.println();
	
	o6DogClass bulldog=new o6DogClass();
	bulldog.breed="Bulldog";
	bulldog.color="black";
	bulldog.size="big";
	bulldog.age=4;
	System.out.println("This dog is "+bulldog.breed+" and it has "+bulldog.color+" color. it is "+bulldog.size+" and it is "+bulldog.age+" years old");
	
	bulldog.bark();
	bulldog.run();
	bulldog.eat();
	
	System.out.println();
	
	o6DogClass labrador=new o6DogClass();
	
	labrador.breed="Labrador";
	labrador.color="Brown";
	labrador.size="medium";
	labrador.age=3;
	System.out.println("This dog is "+labrador.breed+" and it has "+labrador.color+" color. it is "+labrador.size+" and it is "+labrador.age+" years old");

	labrador.eat();
	labrador.run();
	labrador.bark();
	
	}

}

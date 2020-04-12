package com.syntax.class23;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=new Bird();
		animal.sleep();
		animal.whoAmI();//---> it did not override!!
						// here executed: "I am an animal"
	// in both classes we had static methods and just parent class printed
		// so, this method is called HEADEN
		// SO IF YOU WANT TO ACCESS STATIC METHOD USE IN STATIC WAY WHICH CLASS YOU WANT TO ACCESS!!
		System.out.println();
		Animal.whoAmI();//--> accessing static method in parent class
		Bird.whoAmI();// --> accessing static method in child class

	}

}

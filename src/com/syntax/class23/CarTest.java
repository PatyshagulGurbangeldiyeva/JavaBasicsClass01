package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		
		// we will create upcasting
		
		Car bmw=new BMW ("BMW");
		bmw.display();
		bmw.start();
//		bmw.navigate();---> will not be available as we don't have in car class
		Car tesla=new Tesla("Tesla");
		Car mercedes=new Mercedes ("Mercedes");
		Car honda=new Honda ("Honda");
		
		// how to store multiple objects in one obj
		// we will use array for that
		
	// 	Car [] cars={bmw, tesla, mercedes,honda};
	
		// we can create in this way too
		Car []cars={new BMW ("BMW"),new Tesla("Tesla"),new Mercedes ("Mercedes"),new Honda ("Honda")};

		System.out.println("---Accessing elemnts through for enhaced loop---");
		for (Car c:cars) {
			c.start(); // if you have in child class these methods  then they will execute if not in parent class will execute
			c.display();// you have in parent class, parent class will be executed
		System.out.println();
		}
		
		System.out.println("---Accessing elements through for loop---");
	
		for (int i=0; i<cars.length;i++) {
		cars[i].start();
		cars[i].display();
		System.out.println();
	}
	}
	
	

}

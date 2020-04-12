package com.syntax.class22;

public class AnimalClassPolymorphisim {

	public static void main(String[] args) {
		
		AnimalPolimorphisim	obj=new Tiger(); // Accessing method from child class,based on obj class
			         // here we are doing casting (changing)
					// we do narrowing, as from Tiger class we went to parent class
		obj.sleep();// this method calls parent class
		obj.eat(); // this method from child class
//		obj.run();---> we cannot access it, because method should be based on reference type 
						// here the reference type is parent class 
						// these methods must be in parent class then they will execute sirasi ile
		
		
		System.out.println("----------");
		// this process is called runtime polymorphim. 
		// java decides which method to run. it depends on obj type here it is Tiger

		AnimalPolimorphisim animal=new AnimalPolimorphisim();// accessing methods using parent class
		//methods only of parent class will be available
		animal.eat();
		animal.sleep();
		 
		System.out.println("----------");
		
		Tiger tiger=new Tiger ();// accessing methods from child class
		tiger.sleep(); 
		tiger.eat(); 
		tiger.run(); 
		
		
		
		
	
	}

}

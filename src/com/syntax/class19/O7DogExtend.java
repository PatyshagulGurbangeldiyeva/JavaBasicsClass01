package com.syntax.class19;

public class O7DogExtend extends O7AnimalsExtend { // here we add "extends" and class name
													// that we will use as mumclass
	
	// here we want to extend our child class. add some features and behaviors to our dog
	// that other animal doesn't have and cannot do
	
	String breed; // new feature we added
	public void bark() { // new behavior we added as just dogs can do it
	System.out.println("All dogs can bark");
}


}

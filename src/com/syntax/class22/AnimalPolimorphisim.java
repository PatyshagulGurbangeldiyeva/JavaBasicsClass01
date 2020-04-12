package com.syntax.class22;

public class AnimalPolimorphisim {
	public void eat() {
		System.out.println("Animals eat");
	}
	public void sleep () {
		System.out.println("Animals sleep");
	}

}

class Tiger extends AnimalPolimorphisim{
	// if the methods in parent class are not suitable we can change inside of it
	// and it is called overriding
	
	public void eat() {
		System.out.println("Tigers eat a lot");
	}

public void run () {
	System.out.println("Tigers run very fast");
	
}


}
package com.syntax.class21;

public class Parent {
	String name="Farid";
	String lastName="Smith";
	
	void hello() {
		System.out.println("I am a parent class method");
	}

}
class Child extends Parent{
	
	String name="Ahmet";
	String lastName="Su";
	
	public void display() {
		System.out.println(name);// here it will print own class name
		System.out.println(lastName);
		System.out.println(super.name);// here it will print parent variable
		System.out.println(super.lastName);
	}
	void sayHello() {
		this.display();
		hello(); // here as we don't have in the same class this method, complier will call from parent
	    super.hello();
	}
}

package com.syntax.class23;

public class Car {
	String make;
	
	public Car (String make) {
		this.make=make;
	}
	public void display() {
		System.out.println("I have "+make);
	}
	public void start() {
		System.out.println(make+" starts by turnig key");
	}

}

class BMW extends Car{
	public 	BMW (String make) { // here you need to write same constructor as in parent class
		super(make);
	}
	public void start() {  // here we changed it is overriding
		System.out.println(make+" starts by pushing bottom");
	}
	// adding own behavior
	public void navigat() {
		System.out.println(make+" has navigation system");
	}
}
class Mercedes extends Car {
	public Mercedes (String make) {
		super(make);
	}
	public void start () {
		System.out.println(make+" starts remotly");
	}
	// adding own behavior
	public void prettyLight() {
		System.out.println(make+" has pretty interior lights");
	}
}
class Tesla extends Car {
	public Tesla (String make) {
		super (make);
	}
	public void start () {
		System.out.println(make+" starts with voice command");
	}
}
class Honda extends Car{
	public Honda (String make) {
		super (make);
	}
	
}
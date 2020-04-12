package com.syntax.class20;

public class O3Car {
	String make, model;
	
	public O3Car() { // here we created constructor of O3Car class
					
		System.out.println("I am class constructor");
	}
	public O3Car(String make, String model) {
		this.make=make;
		this.model=model;
	}

}
	class Mercedes extends O3Car{ // here we create child class 
	String sportModel;
	public Mercedes() {
		System.out.println("I am a child class constructor");
	}
	public Mercedes(String make,String model, String sportModel) {
	//	super("Mercedes","S");-->// here we used super call in order to call parent class
								// and we initialized make and model
								// this is hard coding and it is not good useful
		super (make, model);
		this.sportModel=sportModel;
	}
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel);
	}
}

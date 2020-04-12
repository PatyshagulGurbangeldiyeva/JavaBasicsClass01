package com.syntax.class24;

public abstract class Vehicle {
	// lets have some instance variables
	
	String color;
	static int totalVehicles; // we can have static variables in abstract class
	Vehicle (String color){ //---> we can have constructor in abstract class.
	this.color=color;	   //      the goal of constructor is to initialize the instance variables
	
	// how we can calculate when we everytime creating vehicle to calculate the vehicle?
	totalVehicles++;
	
	}
	static public void total() {
		System.out.println("we build "+totalVehicles);// --> we can have static implemented methods
												// but we cannot have static abstract method!! as in static we need implementation 
												// but abstract doesnot have a body
	}
	public void drive() {
		System.out.println("Vehicle drives");
	}
	public void stop() {
		System.out.println("Vehicle stops");
	}
	public abstract void start();
	public abstract void brake ();
	
}
abstract class Car extends Vehicle {
	String carType;
	
	Car (String color, String carType){ // even you create constructor you will still have error. because you need to overlad abstract methods
						// or just make the class abstract!!!
		super(color);
		this.carType=carType; // we can initialize our own variable like carType
	}
	public void brake() {
		System.out.println(carType+" have brakes");
	}
}

class Tesla extends Car{
	String make;
	
	Tesla(String color, String carType, String make){
		super(color,carType);
		this.make=make;
	}
	@Override
	public void start() {  // the class that is 100% completed it called concreat class. there is no abstract methods means!!!
		System.out.println(make+" starts remotely");
	}
	public void display() {
		System.out.println("We have "+color+" "+make);
	}
}
class Toyota extends Car{
	String make;
	Toyota (String color, String carType, String make){
		super(color,carType);
		this.make=make;
	}
	public void start() {  // the class that is 100% completed it called concreat class. there is no abstract methods means!!!
		System.out.println(make+" starts efficiantly");
	}

}


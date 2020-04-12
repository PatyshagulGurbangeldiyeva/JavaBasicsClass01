package com.syntax.class25;

public interface Drivable {
	
	// INTERFACE COLLECTION OF: 1. PUBLIC, STATIC, FINAL VARIABLES
	// 							2. PUBLIC ABSTRACT METHODS but after java 8 you can have also STATIC AND DEFAULT FULL METHODS
	
	public static final boolean MOVE_FAST= true; //--> FINAL (CONSTANT) VARIABLES MUST BE INITIALIZED
	
	// even when we are not specifying the public static final part compiler by default adds them!!!
	
	
	public abstract void drive ();//--> even we did not specify method as public abstract comp will add it

	static void driveFast() {
		System.out.println("can drive fast");//---> in interface you can have static method but full since java 8
	}
	default void easyUse() { // ---> in interface you can have default methods since java 8
		System.out.println("can be used easyly");
	}
}
abstract class Vehicle{
	// in abstract class we can have define or undefine methods. But in interface we can have just abstract methods!!
	
	abstract void stop();
	
		
}
// with help of interface we are achieving multiple inheritance
class Car extends Vehicle implements Drivable{// now my car class is a type of vehicle and at the same time my car is drivable
	// my car class has two parents: vehicle and drivable
	
	// when we want to achive in from parent class we use extends, when we want to achieve from interface we use implements!!
	@Override
	void stop() {
		System.out.println("Car stops");
	}
	
	@Override 
	public void drive () {//---> even in interface we did not write public but here we need to write it!!
		System.out.println("Car drives");
	}
}

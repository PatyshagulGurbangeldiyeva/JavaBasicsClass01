package com.syntax.class14;
public class o2Garage {

	public static void main(String[] args) {
		// if we are creating features and behaviors 
		// by using teample we start with main method!!!!
		
		// in a tample there musnt be a main class
		
		// build individual objects
		
		o1Car car1=new o1Car(); // here I want to build the object of a car class
		o1Car car2=new o1Car(); // when we want to build new thig we use NEW!!!
		
		car1.make= "BMW";
		car1.model="M5";
		car1.year=1999;
		car1.color="blue";
		
		car2.make="Toyota";
		car2.model="Camry";
		car2.year=2014;
		car2.color="black";
		
		// print model of BMW
		System.out.println(car1.make);
		
		
		// accessing behavior/ methods of car with 
		car1.drive();
		car1.accelerate();
		car1.makeNoice(); 
		car1.stop();
		
		
		System.out.println();
		System.out.println(car2.make);
		car2.drive();
		car2.accelerate();
		car2.makeNoice();
		car2.stop();
	//	car2.fast(); // it will not execute as we didn't define it before
		
		System.out.println();
		// I drive a car .... the model is ....
		System.out.println("I drive a car "+car1.make+" the model is "+car1.model);
		
		System.out.println();
		
		o4Car2 anotherCar=new o4Car2();
		anotherCar.make="Walswagen";
		anotherCar.speed=90;
		anotherCar.drive();

	}

}

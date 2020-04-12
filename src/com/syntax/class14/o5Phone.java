package com.syntax.class14;

public class o5Phone {

	// Create a Class “Phone”. 
	// Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String brand;
	String color;
	int year;
	String model;
	
		
	void call() { System.out.println(brand+" can call"); }
	
	void music() { System.out.println(brand+" can play music"); }
	
	void takePictures() { System.out.println(brand+ " can take pictures clearly"); }
	
	void text() { System.out.println(brand+" can text messages"); }
	
	
	
	public static void main (String [] args) {
		
		o5Phone iphone=new o5Phone();
		iphone.brand="Iphone";
		iphone.color="black";
		iphone.year=2020;
		iphone.model="X Max";
		
		System.out.println("This phone is "+iphone.brand+" it is "+iphone.color+", it was produced in "+iphone.year+" and its model is "+iphone.model);
		iphone.call();
		iphone.music();
		iphone.takePictures();
		iphone.text();
		
		
		System.out.println();
		
		o5Phone android=new o5Phone ();
		android.brand="Android";
		android.color="white";
		android.year=2019;
		android.model="Note 10";
		
		System.out.println("This phone is "+android.brand+" it is "+android.color+", it was produced in "+android.year+" and its model is "+android.model);
		
		android.call();
		android.music();
		android.takePictures();
		android.text();
		
		System.out.println();
		
		o5Phone nokia=new o5Phone();
		nokia.brand="Nokia";
		nokia.color="grey";
		nokia.year=1999;
		nokia.model="1100";
		System.out.println("This phone is "+nokia.brand+" it is "+nokia.color+", it was produced in "+nokia.year+" and its model is "+nokia.model);
		
		nokia.call();
		nokia.text();
	}
}

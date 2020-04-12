package com.syntax.class23;

public class Computer {
	/* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
	 * Define common behavior within and some fields in parent class 
	 * and override some of the methods in child classes
	 * Define some methods specific to child classes
	 * Create objects of child classes and store them into array.
	 * Loop through each object and execute available methods.
	 */
String brand;
public Computer (String brand){
	this.brand=brand;
}
	public void run() {
		System.out.println(brand+" can run the system");
	}
	public void save() {
		System.out.println(brand+" can save input");
	}
	public void transfer() {
		System.out.println(brand+" can transfer information");
	}
	public void storage() {
		System.out.println(brand+" can store input");
	}
	
}

class Apple extends Computer{
	public Apple (String brand){
		super (brand);
	}
	 public void run() {
		System.out.println(brand+" can run the system faster");
	 }
	 public void save() {
		 System.out.println(brand+" saves input in different way");
	 }
	 public void transfer() {
			super.transfer();
		}
	 public void safe() {
		 System.out.println(brand+" is safer");
	 }
}


class Lenovo extends Computer{
	public Lenovo (String brand) {
		super(brand);
	}
	public void run() {
		super.run();
		
}
}

class HP extends Computer{
	public HP (String brand) {
		super(brand);
	}
	// public void run() {--> here I don't need to create methods as they are same with parent class
	//	super.run();			it aoutomatically will be printed
//}
	// public void transfer() {
	//	super.transfer();
	// }
	}
	

class Dell extends Computer{
	Dell (String brand){
		super(brand);
	}
	//public void run() {---> you don't need to call as the method the same
	//super.run();
//	}
}

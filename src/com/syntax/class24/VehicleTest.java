package com.syntax.class24;

public class VehicleTest {

	public static void main(String[] args) {
		
	// 	Vehicle vehicle =new Vehicle("yellow"); we cannot create an obj from VEHICLE CLASS because it is ABSTRACT CLASS!!
		
		Vehicle tesla=new Tesla("yellow", "sedan", "Tesla");
		tesla.drive();
		tesla.stop();
		tesla.brake();
		tesla.start();
//		tesla.dislpay();--> it will CE because method is not defined in Vehicle
		
		
		System.out.println();
new Toyota("red", "sedan","toyota");
new Toyota ("blue", "sedan", "toyota");
Toyota.total();
	}

}

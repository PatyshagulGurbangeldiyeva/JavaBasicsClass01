package com.syntax.class25;

public class DrivableTest {
	public static void main (String [] args) {
// Drivable obj=new Drivable(); we cannot directly create onj from interface
		
		Drivable obj=new Car();
		obj.drive();
		
		// lets print variable from interface--> they are always public static and final
		
//		Drivable.MOVE_FAST=False;---> we cannot change final variable
		System.out.println(Drivable.MOVE_FAST);
		
		// lets access stop()--> this method belongs in car class, so create obj of car class
		
		Car car=new Car();
		car.stop();
		
		
	}

}

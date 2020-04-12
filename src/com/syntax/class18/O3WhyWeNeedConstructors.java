package com.syntax.class18;

public class O3WhyWeNeedConstructors {

	String make, model, color;
	int year, door, wheels;

	public void printDetails() {

		System.out.println("I have " + year + " " + make + " " + model + " car and it is color is " + color);
		System.out.println(make + " has " + door + " doors and " + wheels + " wheels");
	}

	O3WhyWeNeedConstructors(String carMark, String carModel, String carColor, int carYear, int carDoor, int carWheels) {
		make = carMark;
		model = carModel;
		color = carColor;
		year = carYear;
		door = carDoor;
		wheels = carWheels;
	}
	O3WhyWeNeedConstructors(){
		
	}

	public static void main(String[] args) {

		O3WhyWeNeedConstructors car = new O3WhyWeNeedConstructors();
		
		  car.make="BMW"; 
		  car.model="m5";
		  car.year=2020; 
		  car.color="white";
		  car.printDetails();
		 
		  System.out.println("-------------------------");
		// here we did not assign the color, so output will be null for color
		// with the help of constructor we can enhance/improve our output

		O3WhyWeNeedConstructors bestCar = new O3WhyWeNeedConstructors("BMW", "m5", "white", 2020, 4, 4);
	    bestCar.printDetails();

	}

}

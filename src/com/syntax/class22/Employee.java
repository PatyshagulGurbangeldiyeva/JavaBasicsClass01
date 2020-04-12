package com.syntax.class22;

public class Employee { // here we are working with overriding
	
	double salary;
	void getPaid() {
		System.out.println("Empoyee gets paid: "+salary);
	}
	void work() {
		System.out.println("Employee works");
	}

}

class FullTimeEmployee extends Employee{

	
	
}
class PartTimeEmployee extends Employee{
	
}
class Contractor extends Employee { // here we don't satisfy with behavior from parent class
	// so we declare out variable and change behavior
	
	double hourlyRate;
	void getPaid() { // this is called overriding as we used the same method name but changed print
		System.out.println("Contractor gets paid "+hourlyRate);
	}
	
}

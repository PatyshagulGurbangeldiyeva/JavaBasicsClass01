package com.syntax.class20;

public class O1Employee {
	static String company;
	int empNumber;
	double salary;
	
	public void info() {
		System.out.println("Employee works in "+company+" empnumber is "+empNumber);
	}
	public void getPaid() {
		System.out.println("Employee has the salary "+salary);
	}
	static void work() {
		System.out.println("Employee works in "+company);
	}

}

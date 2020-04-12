package com.syntax.class20;

public class O2Employee {
	public static String company;
	protected int empNumber;
	double salary;
	private int ssn;
	
	void getPaid() {
		System.out.println("Employee get "+salary);
	}
	static void work() {
		System.out.println("Employee work at "+company);
	}

}

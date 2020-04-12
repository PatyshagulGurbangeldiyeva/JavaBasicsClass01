package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Pease enter your height");

		double height=input.nextDouble();
		
		if (height<60) {
		System.out.println("short");
		}else if (height>=60 && height<=72) {
			System.out.println("medium");
		}else {
			System.out.println("tall");
		}
	}

}

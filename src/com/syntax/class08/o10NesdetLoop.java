package com.syntax.class08;

public class o10NesdetLoop {

	public static void main(String[] args) {
		// Nested loop is a loop inside the loop
		// if the initial loop (for) is false inner will not execute!!!
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello");
		for (int y=1; y<=3; y++) {
			System.out.println("Bye"); 
			// inside the for loop will be finished then we will go to the first loop!!!
			// after you finished with this loop we go back and this loop initialized. 
			// when the first loop will be done then all the system done
			}
		}
		}

	}



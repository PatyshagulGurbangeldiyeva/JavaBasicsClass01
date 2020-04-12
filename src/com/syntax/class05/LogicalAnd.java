package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

/* 1.if declared number is
 * 2. btw 1 to 10: "This number is small"
 * 3. btw 11-100: "This is big number"
 * 4. btw 101-1000:"this is large number"
 */

		//1.
		
		int num=5; // if you will change the input here the answer will be changed too
		
		//2,3,4 is used here:
		
		if (num>=1 && num<=10) {
			System.out.println("This number is small"); // we are using && condition so both of the answers must be true according to the declared number
			
			// if (num>=1 || num<=10) we use the answer will be ture or false. even one condition is true the console will show the first one
		}else if(num>10 && num<=100){
			System.out.println("This is big number");
		}else {
			System.out.println("The is large number");
		}
		
		
	}

}

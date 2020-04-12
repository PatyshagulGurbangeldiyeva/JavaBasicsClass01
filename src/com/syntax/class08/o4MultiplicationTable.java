package com.syntax.class08;

public class o4MultiplicationTable {

	public static void main(String[] args) {
		/*
		 *we want to create multiplication table 
		 * 
		 * 1x1=1
		 * 1x2=2
		 * 1x3=3.....		 * 
		 */

		// CREATE A TABLE FOR NUMBER ONE:
		
		int num=1;
		for(int i=1;i<=10; i++) {
			System.out.println(num+"*"+i+"="+i*num);
		}
		
		// CREATE A TABLE FOR NUMBER TWO:
		
		int num1=2;
		for (int z=1; z<=10; z++) {
			System.out.println(num1+"*"+z+"="+z*num1);
		}
				
	}

}

package com.syntax.class09;

public class oo13ArrayIntro1 {

	public static void main(String[] args) {
		/*1. Datatypes:
		 *2.  conditional statements: if, switch case
		 *3.  loop statements: for, while, do while, advanced for
		 * 
		 * we will learn:
		 * arrays
		 * string manipulation
		 * object orientated program concepts (OOPs)
		 */

		//                   ARRAYS IN JAVA
		
		            // array is a bigger box that has sections. where we can store different assignments
		            // in program indexes start with zero (0)
		            // the values stored according to indexes
		           // ELEMENTS: the value that we stored---> int[]num1=10,20,30,40---> these are element
		           // num1[0]=10. num1[1]=20, num1[2]=30,num1[3]=40 inside [] we write index of the variable
		          // values that are stored must be similar!!!! if int then use all of them int!!!!
		// DECLARING THE VALUE
		int num=10;// 1ST WAY
		int num1; //OR LIKE THIS
		num1=2;
		
		// DECLARING IN ARRAY ALSO CAN BE DONE IN TWO WAYS
		
		// DECLARE AN ARRAY AND INITIALIZE IT AND STORE VALUES
	
		// 1ST WAY:
		int []array=new int[4];// here in [] i wrote 4 because we will use 4 different elements for assigning
		array [0]=10;// [0] index of the element. it starts alsways with ZERO!!!
		array [1]=20;
		array [2]=30;
		array [3]=40;
		
		// ACCESS ELEMENTS FROM ARRAY
		System.out.println(array[1]);// the execution will be 20 index is [1]one!!!!
		
		// 2ND WAY:
		String []carArray;// or we can write like this----> String carArray [];
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		
		// we want to execute "I am driving Toyota"
		
		System.out.println("I am driving "+carArray[2]);
		
		// we want to change the value
		int []numbers=new int[3];
		numbers [0]=100;
		numbers [1]=200;
		numbers [2]=300;
		// lets change the value:
		numbers[1]=2000;
		
		System.out.println(numbers[1]);//2000
		System.out.println(numbers[1]+numbers[0]);//2100
		
		
		
	}

}

package com.syntax.class10;

public class o6Task02SumOfElements {

	public static void main(String[] args) {
		/*Create an array on integers 
		 * and calculate the sum of all integer elements in an array.
		 */

		System.out.println(" we use it when there is limitation of numbers. not so many numbers");
		int []numbers= {1,2,3,4,5};
		int add=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		System.out.println(add);
		
		
		System.out.println();
		System.out.println("First way. when we have many elements");
		int []num1= {26,55,754,34,0,23,56,78,98,12};
		int sum=0;
		for (int i=0; i<num1.length;i++) {
			sum=sum+num1[i];
		}
		System.out.println("The sum of the numbers in this array is: "+sum);
		System.out.println();
		System.out.println();
		System.out.println("Second way");
	}

}

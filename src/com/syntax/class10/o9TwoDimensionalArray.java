package com.syntax.class10;

public class o9TwoDimensionalArray {

	public static void main(String[] args) {
		// look to the notebook there is a table

		int[][] num = new int[3][4];
		// FIRST ROW:
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[0][3] = 40;

		// SECOND ROW:
		num[1][0] = 5;
		num[1][1] = 10;
		num[1][2] = 15;
		num[1][3] = 20;
		
		//THIRD ROW:
		num[2][0]=1;
		num[2][1]=2;
		num[2][2]=3;
		num[2][3]=4;
		
		// print value 15
		System.out.println(num[1][2]);
		
		System.out.println();
		System.out.println("array of 3 single dimensional arrays");
		
		int [][]nums= {{10,20,30,40},{5,10,15,20},{1,2,3,4}};
		
		// print number 3
		System.out.println(nums[2][2]);

	}

}

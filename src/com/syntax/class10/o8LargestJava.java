package com.syntax.class10;

public class o8LargestJava {

	public static void main(String[] args) {
		//we want to find the largest element in array
		
		int []nums= {200,30,-1,900,56,787, 3000};
		
		// we will take each element and compare it with other elements
		
		int largest=nums[0];// first we will assume that the first element is the largest
		
		for (int i=1; i<nums.length; i++) {// as [0] we took the largest number we don't need to compare it to itself
			if (nums[i]>largest) { // nums[1]>200----> 30>200 false
				largest=nums[i];
			}
		}
		System.out.println(largest);

	}

}

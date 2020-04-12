package com.syntax.class13IntewievQuestions;

public class WriteSecondLargestMaxAndMIn {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
	   // Maximum and minimum number in the array?
		
		
		int []n= {2,4,8,98,34,976,455,975};
		
		int largest=n[0];
		int smallest=n[0];
		int secondLargest=n[0];
		int element;
		
for (int i=1; i<n.length;i++) {
	element=n[i];
	if (element>largest) {
		secondLargest=largest;
		largest=element;
	}else if (element>secondLargest) {
		secondLargest=element;
	}
	if (element<smallest) {
		smallest=element;
	}
}
System.out.println("largest "+largest);
System.out.println("secondLargest "+secondLargest);
System.out.println("smallest "+smallest);
	}

}

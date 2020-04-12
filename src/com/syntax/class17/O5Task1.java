package com.syntax.class17;

public class O5Task1 {
	
	/*Create a method that will accept an array as parameters 
	 * and will return a sum of all elements from that array. 
	 * Method should be visibly only within same package
	 *  and accessible by the creating an instance of the class.*/
	
	protected int sumOfAll(int [] array) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
		
	}
	
		
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6};
		O5Task1 obj=new O5Task1();
		
		System.out.println(obj.sumOfAll(arr));

	}

}

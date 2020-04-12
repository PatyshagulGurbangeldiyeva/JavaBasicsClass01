package com.syntax.class11;

public class o3TaskOneArray {

	public static void main(String[] args) {
		/* Create an array of cars : american, german, korean, italian.
		 *  Then retrieve all values from that array using 2 different loops
		 */

		String [] cars= {"American","German","Korean","Italian"};
		
		System.out.println("First way");
		
		for (int i=0;i<cars.length;i++) {
			
				System.out.print(cars[i]+" ");
			
			
		}
		System.out.println();
		System.out.println("Second way");
		
		for (String name:cars) {
			System.out.print(name+" ");
		}
	}

}

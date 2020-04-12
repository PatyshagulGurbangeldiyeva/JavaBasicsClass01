package com.syntax.class10;

public class o2LengthOfArray {

	public static void main(String[] args) {
		// find how many elements in array

		String [] cities= {"Washington DC","New York","Paris","Miami", "Los Angeles","Dallas","Utah"};
		
		
		// how many elements stored inside the array
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		
		
		// how can I access last element from an array
		System.out.println(cities[arraySize-1]);
		
		System.out.println();
		
		System.out.println("PRINT ALL THE ELEMENTS");
		System.out.println();
		
		// if we want to know how many elements use FOR LOOP
		for(int i=0; i<arraySize;i++) { // if we write i<=arraySize then the answer will be out of bon. index<elements!!!
			System.out.println(cities[i]);
		}
		
	}

}

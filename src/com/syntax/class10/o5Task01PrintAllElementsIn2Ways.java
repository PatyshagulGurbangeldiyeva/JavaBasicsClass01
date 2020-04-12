package com.syntax.class10;

public class o5Task01PrintAllElementsIn2Ways {

	public static void main(String[] args) {
		/*Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
System.out.println("FIRST WAY USING FOR LOOP");
		String [] animals= {"Tiger","Lion","Giraffe","Seal","Bear","Chita"};
		
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("SECOND WAY USINF ADVANCED LOOP");
		
		for (String animal:animals) {
			System.out.print(animal+", ");
		}
		
	}

}

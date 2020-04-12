package com.syntax.class08;

public class o3RecapForLoop {

	public static void main(String[] args) {
		// write the program to calculate sum of odds and sum of even numbers 1-99
		
		int evenSum=2;
		int oddSum=1;
		
		for (int i=1; i>=99; i++ ) {
			if (i%2==0) {
				evenSum=evenSum+i;
			}else{
				oddSum=oddSum+i;
			}
		
					}
		System.out.println(evenSum);
		System.out.println(oddSum);

		System.out.println("---------------------Second way--------------------");
		
		// with while
		
		int z=1;
		while (z<=99) {
			if (z%2!=2);
			System.out.print(z+" ");
			z++;
		}
	}

}

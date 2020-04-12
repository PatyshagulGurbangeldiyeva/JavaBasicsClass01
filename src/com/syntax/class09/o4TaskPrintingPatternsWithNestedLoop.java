package com.syntax.class09;

public class o4TaskPrintingPatternsWithNestedLoop {

	public static void main(String[] args) {
		//out put must be like this
		// ****
		// ****
		// ****
		// ****
		// ****
		System.out.println("PRINTING COLUMS FOR NESTED LOOP");
		System.out.println(" ");
		
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

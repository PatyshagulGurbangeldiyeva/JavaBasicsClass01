package com.syntax.class09;

public class oo10TrianglePattern {

	public static void main(String[] args) {
		//  *
		//  **
		//  ***
		//  ****
		
		// rows:4 and columns:4
		// the number of columns depend on numbers of rows
		
		for (int x=1;x<5;x++) {
			for (int y=1;y<=x;y++) { // if i will write y<x then output will be 3 raws and three colums
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

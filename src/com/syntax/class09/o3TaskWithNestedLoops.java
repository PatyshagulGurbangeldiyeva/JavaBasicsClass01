package com.syntax.class09;

public class o3TaskWithNestedLoops {

	public static void main(String[] args) {
		// we need to write number 9999
		
		for (int a=0;a<10;a++) {
			
			for(int b=0;b<10;b++) {
				
				for (int c=0;c<10;c++) {
					
					for(int d=0;d<10;d++) {
						System.out.println(a+""+b+""+c+""+d);
							
					}
				}
			}
		}

	}

}

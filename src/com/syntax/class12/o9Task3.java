package com.syntax.class12;

public class o9Task3 {

	public static void main(String[] args) {
		// You have a String a=“Is it Saturday? Is it raining? Do we have a Java Class today?” 
		// How would you find out how many sentences are in that String?

//		char charecters[]= {',','.','?'};
//		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
//		String []array=a.split("\\?"); // as ? is charecter we must use \\. we used it before . , and ?
//		
//		System.out.println(array.length);
//		
//		for (int i=0; i<array.length;i++) {
//			System.out.println(array[i]+" ");
//		}
		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
		
	}	
	}
	


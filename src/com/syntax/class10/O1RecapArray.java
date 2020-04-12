package com.syntax.class10;

public class O1RecapArray {

	public static void main(String[] args) {
		// write grades for 4 ss
		// find averages
		
		System.out.println("long way of storing array");
		int [] grades=new int [4];
		grades [0]=90;
		grades [1]=60;
		grades [2]=78;
		grades [3]= 80;
		
		int average=((grades[0]+grades[1]+grades[2]+grades[3])/4);
		
		System.out.println(average);
		
		System.out.println();
		System.out.println("short way of storing arrays");
		
		String [] cities= {"Washington DC","New York","Paris","Miami"};
		
		// I live in Paris
		
		System.out.println("I livi in "+cities[2]);
		
		System.out.println();
		int x=1; // what will be executed?
		System.out.println(cities[x]);// NY will be executed as x=1 and in cities index 1 is NY
		
		System.out.println();
		System.out.println();
		
		x+=3; // what will be output?
		System.out.println(cities[x]); // there is no index 4 so the result will be ArrayIndexOutOfBoundsException
		
	}

}

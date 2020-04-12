package com.syntax.class07;

public class ForLoopTask10 {

	public static void main(String[] args) {
		// print numbers from 1-10

		for (int num=1;num<=10; num++) {
			System.out.println(num);
		}
		
		System.out.println("*******************************");
		// print numbers from 10-1
		
		for (int a=10;a>=1;a--) {
			System.out.println(a);
		}
		
		System.out.println("*******************************");
		
		// what will be the output?
		// for (int i=0; i<=50; i+=5)
		//the output will be 5,10,15,20....50
		
		for (int i=0; i<=50; i+=5) {
			System.out.print(i+" ");
		}
		System.out.println("**********************");
		//what is the output?
		int sum=0;
		for (int i=1;i<5;i++) {
			sum=sum+i;
			// i=1----> sum=0+1   sum=1
			// i=2----> sum=1+2   sum=3
			// i=3----> sum=3+3   sum=6
			// i=4----> sum=6+4   sum=10
		}
		System.out.println(sum);
	}

}

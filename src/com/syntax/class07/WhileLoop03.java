package com.syntax.class07;

public class WhileLoop03 {

	public static void main(String[] args) {
		
		int time=10;
		if (time<12) {
			System.out.println("Good morniing");// here we will have just one output
			
		}

		System.out.println("-------While Loop-----------");
		
		//while (time<12);{
		//System.out.println("Good morning");//code will be execute infinetely as in time=10 (less than 12)
		//}
	

		while (time<12){
		System.out.println("Good morning");// in order not repeat infinetely we are using increment and decrement operators
		time++;
		}
		
		// HOW TO PRINT NUMBERSFROM 1-50?
		/*System.out.println(1);
		*System.out.println(2);
		*System.out.println(3);
		*.....
		*/
		
		// in order to not repeat the same code we use increment or dicrement
		
		int num=1;
		while (num<=50) {
			System.out.println(num);
			num++;
		}
		
		// how to print numbers 20-30
		
		int num1=20;
		while (num1<=30) {
			System.out.println(num1);
			num1++;
		}
		
		System.out.println("**************2***************");
		
		// how to print numbers from 5-15 in 1 line with space
		
		int num2=5;
		while (num2<=15){
		num2++;
		System.out.print(num2+" ");
		}
		System.out.println("");
		System.out.println("***************************");
		//how to print values from 10-1
		
		int num3=10;
		while (num3>=1) {
			num3--;
			System.out.println(num3);
		}
		System.out.println("**********Example*****************************");
		
		
		
}
}

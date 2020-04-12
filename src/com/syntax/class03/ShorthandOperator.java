package com.syntax.class03;

public class ShorthandOperator {

	public static void main (String[]args) {
		
		int num=200;
		num=num+300;
		
		System.out.println(num);//500 (we look to the last formula)
		
		num=num-100;
		System.out.println(num);//400 coz the last formula works from the previous line8
		
			
			
		//compound shorthand assignment operator
		
		num-=100; //400-x=100 x=300; num=num-100
				
		System.out.println(num);//300
		
		num+=50;
		
		System.out.println(num);//350(num=300+50)
		
		num/=7;// num=num/7
		
		System.out.println(num);//50
		
		num*=10;
		System.out.println(num);//500
		
		num%=5;
		System.out.println(num);//0
		
	}
}

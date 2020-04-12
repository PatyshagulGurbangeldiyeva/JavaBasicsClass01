package com.syntax.class02;

public class ClassTask01 {
	public static void main (String[]args) {
		
		double num1=25.22;
		double num2=50.22;
		
		double sum=num1+num2;
		double sub=num2-num1;
		double mul=num1*num2;
		double div=num2/num1;
		
		System.out.println("The sum of the 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The substraction of the 2 numbers "+num2+" and "+num1+" is equal to "+sub);
		System.out.println("The multipication of the 2 numbers "+num1+" and "+num2+" is equal to "+mul);
		System.out.println("The devision of the 2 numbers "+num2+" and "+num1+" is equal to "+div);
		
		
		// another way of using sum
		
		System.out.println("The sum of the two numbers "+num1+" and "+num2+" is " + (num1+num2));
		
		
		

}}

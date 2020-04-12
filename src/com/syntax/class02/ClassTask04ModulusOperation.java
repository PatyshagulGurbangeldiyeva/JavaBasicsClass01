package com.syntax.class02; 

// modulus operation

public class ClassTask04ModulusOperation {
	
	public static void main (String []args) {
		
		float f=12.50f;
		float f2=2.7f;
		
		float result=f/f2;
		
		System.out.println(result);
		
		int i=12;
		int y=7;
		
		int result1=i/y;
		
		System.out.println(result1);
		
		//modulus
		
		int v=16;
		int w=5;
		
		// now we want to see the remainder, so we use modulus
		
		int mod=v%w;
		
		/* here the result will be remainder. in console you will see remainder*/
		
		System.out.println(mod);
		
		
		
		//integers can be inn double (dcimals). we can store int in double (decimals)
		
		// but double cannot be stored in int
		
		double num2=12;
		double num3=7;
		System.out.println(num2/num3);
		// you can see that result is decimal. so the result of the int can be store in decimals
		
				
		
		
	}

}

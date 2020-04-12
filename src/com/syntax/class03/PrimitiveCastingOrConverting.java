package com.syntax.class03;

public class PrimitiveCastingOrConverting {
	
	public static void main (String[]args) {
		
		double d=10;// int 10 converted to the double
		System.out.println(d);//10.0
		
		// if we write 
		
		//int i=10.99 ----> the computer will not accept it because you use integer but the assign is double!!!
		// it is a compile time error 
		
		//double cannot be converted to integer but integer can convert to to double
		
		//CASTING MEANS changing a value of one type into another type. For ex: int to double
		 
		// there are primitive and non primitive casting.
		/*primitive : boolean and numeric datas (charecter (char),int(byte, short,int,long),
		 * floating point (float and double)*/
		 
		
				
		/* there are two types of casting:
		 * 1. widening (impilict casting means automatically)
		 * byte->short->int->long->double
		 * we go from small to big
		 * 
		 * 
		 * 2. narrowing (explicit casting means manually
		 * double->long->int->short->byte
		 */
	
		// in a first we print widening. we used int and print double
		
		/* so right now we will narrowing. in narrowing we write manually. 
		 * the comp doesnot take responsibility. coz u r trying to fix smth big into the small
		 */
		
		int i=(int)10.99;
		System.out.println(i);
		
		//byte -128 to 127
		
		byte b= (byte)1284;
		System.out.println(b); /* the result is given 4 as we did manually. 
		so thats what happens when we use narrowing*/
		
	}

}

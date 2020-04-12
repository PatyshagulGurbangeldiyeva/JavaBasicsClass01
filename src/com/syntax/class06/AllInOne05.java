package com.syntax.class06;

import java.util.Scanner;

public class AllInOne05 {

	public static void main(String[] args) {
		
		/*logical opperators cannot work in switch case like  &&, ||,!
		 * no relational <,>.... cannot be used
		 * we cannot use in switch boolean, double, float. It works only with byte, short, char int, string.
		 * we cannot have duplicates
		 * we must use break
		 */

		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("Enter your gender");
		gender=scan.next().charAt(0);
		
		switch (gender) {
		
		case 'M':
			genderType="Male";
			break;
		case'F':
			genderType="Female";
			break;
		default:
			genderType="Invalid";
				
		}
		System.out.println("your gender is "+genderType);
	}

}

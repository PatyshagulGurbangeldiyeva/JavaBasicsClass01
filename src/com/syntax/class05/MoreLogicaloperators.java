package com.syntax.class05;

public class MoreLogicaloperators {

	public static void main(String[] args) {
		
		/* We have 7 days
		 * if days are 2 or 3-----> SDLC class
		 * if days are 6,7 -------> Java class
		 * If days 1,5------------> Off day
		 * if day 4---------------> Review class
		 */
		
		int day=6;
		if (day==2 && day==3) {
			System.out.println("today is sdlc class"); // day is not 2 and 3. false and false
		}else if (day==6 && day==7) {
			System.out.println("today is Java class"); // true and false-----> false
		}else if (day==1 && day==5) {
			System.out.println("today is day off");// false and false -----> false
		}else if (day==4) {
			System.out.println("today is review class");/// false
		}else {
			System.out.println("invalid day");// this will be our output
		}
		
		// lets change to OR
		
		int day1=5;
		if (day==2 || day1==3) {
			System.out.println("today is sdlc class"); // false or false------>false
		}else if (day1==6 || day1==7) {
			System.out.println("today is Java class"); // false || false-----> false
		}else if (day1==1 || day1==5) {
			System.out.println("today is day off");// false or true---->true
		}else if (day1==4) {
			System.out.println("today is review class");// false
		}else {
			System.out.println("invalid day");
		}
		
		
		// using strings
		
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println(" USING STRINGS");
		
		String day2="Saturday";
		
		if (day2.equals("Tuesday")|| day2.equals("Wednesday")) {
			System.out.println("today is sdlc class");	
		}else if (day2.equals("Saturday") || day2. equals("Sunday")){
			System.out.println("today is Java class");
			
		}
	}

}

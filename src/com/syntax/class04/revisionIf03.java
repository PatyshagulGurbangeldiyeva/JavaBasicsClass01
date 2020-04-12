package com.syntax.class04;

public class revisionIf03 {

	public static void main(String[] args) {
		// declare date and day
		// if day is friday and date is 13th then i am going to watch a scary movie
		// if day is friday and date is not 13th then i am going to watch comedy
		
		boolean Friday=true;
		int date=14;
		
		if (Friday) {
			System.out.println("I am goingt to watch the movie");
			
			if (date==13) {
				System.out.println("I am going to watch a scary movie");// this line belongs to line13
			}else {
				System.out.println("I am going to watch a comedy");// this line belong to 16
			}
			}// if the 13 line is true then program will go to lines 16 and 18. 
		// if it is false the line 13 then it will directly go to the line 25
		
		
		else {
				System.out.println("Today is not Friday I am staying at home");// this line belong to 13
		}
		
	}
}

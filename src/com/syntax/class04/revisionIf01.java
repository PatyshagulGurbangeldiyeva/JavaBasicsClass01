package com.syntax.class04;

public class revisionIf01 {

	public static void main(String[] args) {
		// revision of if condition
		
		// if every time means true in boolean. if true print it. 
		
		boolean flag=false;
		boolean classToday=true;
		
		if (flag) {
			System.out.println("Hello");
			
		if (classToday) {
			System.out.println("Hello friends");
		}	
		
		
		}else {
			System.out.println("Bye"); // as flag is false java skipped it and just executed Bye
		}
	}

}

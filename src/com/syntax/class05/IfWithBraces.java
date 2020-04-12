package com.syntax.class05;

public class IfWithBraces {

	public static void main(String[] args) {
		
		boolean isSaturday=true;
		
		/*if (isSaturday) {
			System.out.println("If block code");
			System.out.println("We Java class");
			
			else 
			System.out.println("else block code");
			System.out.println("No java class");*/  
		
		// it will not work becouse in if or else case we have two lines so we should put brackers. 
		// if we have one line it will work
		
		if (isSaturday)
			System.out.println("Tomorrow is Sunday");
		else 
			System.out.println("No holiday");
	}

}

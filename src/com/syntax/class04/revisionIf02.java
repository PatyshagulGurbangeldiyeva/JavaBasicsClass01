package com.syntax.class04;

public class revisionIf02 {

	public static void main(String[] args) {
		
		boolean flag=true;
		boolean classToday=false;
		
		if (flag) {
			System.out.println("Hello");// this will be printed as it is true
			
		if (classToday) {
			System.out.println("Hello friends");// it will not be printed as it is false
		}	else {
			System.out.println("Hello family"); // this else belongs to line 13. this will be printed as line 13 was not printed
		}
	}else {
		System.out.println("Bye");// this else belongs to line 10. it will not be printed as line 10 is true.
	}

		System.out.println("I am outside of condition");
}


	}



package com.syntax.class03;

public class MultipleConditions {

	public static void main(String[] args) {
		
		double num1=10;
		double num2=10;
		
		if (num1>num2) {
			System.out.println("Double value "+num1+" is larger than "+num2);
		} else if (num1<num2){
			System.out.println("Double value "+num1+" is smaller than "+num2);
		}else {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("___________________________________");
		
		// declare variable for a day and then based on the value we will 
		//output
		
		int day=12;
		
		if(day==1) {
			System.out.println("It's Monday");
		}else if(day==2) {
			System.out.println("It's Tuesday");
		}else if (day==3) {
			System.out.println("It's Wednesday");
		}else if (day==4) {
			System.out.println("It's Thursday");
		}else if (day==5) {
			System.out.println("It's Friday");
		}else if (day==6) {
			System.out.println("It's Saturday");
			
			// the last condition without if---> just else. this is the ladder statement.  
			// but you can write else if in the last line.
		}else if (day==7){
			System.out.println("It's Sunday");
		}else {
			System.out.println("Invalid day");
			
			//debug means step by step the program will check your coding.
			// we use it when there are many information
		}
		
		
		
	}

}

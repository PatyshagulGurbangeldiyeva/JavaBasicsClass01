package com.syntax.class06;

public class SwitchCase04 {

	public static void main(String[] args) {

		// Swtich case is the other conditional statement/way of using if else case

		// first we will use if statement:

		int day = 5;
		
		String dayName;

		if (day== 1) {               
			dayName = "Monday";
		} else if (day == 2) {
			dayName = "Tuesday";
		} else if (day == 3) {
			dayName = "Wednesday";
		} else if (day == 4) {
			dayName = "Thursday";
		} else if (day == 5) {
			dayName = "Friday";
		} else if (day == 6) {
			dayName = "Saturday";
		} else if (day == 7) {
			dayName = "Sunday";
		} else {
			dayName = "Invalid";
		}
		System.out.println("Today is " + dayName);

		System.out.println("------------------USING SWITCH--------------------");

		int day1=7;
		String today;
		switch (day1) {
		case 1: // if the day will be equal to one
			today = "Monday";
			break;// break gives to stop the searching. if the system found the matching case break makes him stop.
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
			
		default:// similar to else
			today= "Invalid";
		}
		System.out.println("Today is "+today);
		
		
		
		
		
		System.out.println("_______________________________");
		
		int d = 7;

		switch(d)
		{
		case 1:
		System.out.println("Monday");
		case 2:
		System.out.println("Tuesday");
		case 3:
		System.out.println("Wednesday");
		case 4:
		System.out.println("Thursday");
		case 5:
		System.out.println("Friday");
		}

	}

}

// in else if case we can provide duplicate cases not in switch we cannot have

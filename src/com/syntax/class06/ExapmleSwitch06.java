package com.syntax.class06;

import java.util.Scanner;

public class ExapmleSwitch06 {

	public static void main(String[] args) {
		/*ask user where he or she is from
		 * based on the country we will define favorite food
		 * "Your favourite food is_________"
		 */

		Scanner scan;
		String country;
		String favouriteFood;
		
		scan=new Scanner (System.in);
		System.out.println("Where are you from?");
		country=scan.nextLine();
		
		switch (country){ // if you want to change (country.toLowerCase) then all the country names in cases must start with lower case!!!!!
			case "Morocco":// or you can convert to uppercase. then all the variables must be in uppercase MOROCCO!!!!
				favouriteFood="couscous";
				break;
			case "Turkmenistan":
				favouriteFood="Manty";
				break;
			case "Turkey":
				favouriteFood="Iskender";
				break;
			case "Kazakhstan":
				favouriteFood="Bashparmak";
				break;
				default:
					favouriteFood="Unknown";
		}
		System.out.println("You are from "+country+ " and your favourite food is "+favouriteFood);
	}

}

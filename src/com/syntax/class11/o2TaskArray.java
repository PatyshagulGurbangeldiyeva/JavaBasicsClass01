package com.syntax.class11;

public class o2TaskArray {

	public static void main(String[] args) {
		// create 2d array
		// in which we store professions
		
		String [][]proffecians={
				{"QA Tester", "Developers","Product Owner","Scrum Master"},
				{"Math Teacher","English Teacher","Science Teacher"},
				{"Dentist", "Surgeon"},				
		};

		// get elements using advanced for loop
		
		for (String[] occupations:proffecians) {
			for (String title:occupations) {
				System.out.print(title+" ");
			}System.out.println();
		}
	}

}

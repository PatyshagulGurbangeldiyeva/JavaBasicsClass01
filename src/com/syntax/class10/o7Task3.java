package com.syntax.class10;

public class o7Task3 {

	public static void main(String[] args) {
		/*Create an array of countries. 
		 * While retrieving all values from an array print capital for each country.
		 *  (use 2 different loops).
		 */

		String [] countries= {"USA", "Turkmenistan","Russia","Turkey","France"};
		
		System.out.println();
		System.out.println("FIRST WAY");
		for (String capital:countries) {
			if (capital.equals("USA")) {
				System.out.println("USA: Washington DC");
			}else if (capital.equals("Turkmenistan")){
				System.out.println("Turkmenistan: Ashgabat");
			}else if (capital.equals("Russia")) {
				System.out.println("Russia: Moscow");
			}else if (capital.equals("Turkey")) {
				System.out.println("Turkey: Ankara");
			}else if (capital.equals("France")) {
				System.out.println("France: Paris");
			}else {
				System.out.println("Incorrect input");
			}
				
			}
		
		System.out.println();
		System.out.println("SECOND WAY");
		
		for (int i=0; i<countries.length; i++) {
			if (i==0) {
				System.out.println("USA: Washington DC");
			}else if (i==1) {
				System.out.println("Turkmenistan: Ashgabat");
			}else if (i==2) {
				System.out.println("Russia: Moscow");
			}else if (i==3) {
				System.out.println("Turkey: Ankara");
			}else if (i==4) {
				System.out.println("France: Paris");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Third way with SWITCH");
		
		for (int y=0;y<countries.length;y++) {
			switch (countries[y]) {
			case "USA":
				System.out.println("USA: Washington DC");
				break;
			case "Turkmenistan":
				System.out.println("Turkmenistan: Ashgabat");
				break;
			case "Russia":
				System.out.println("Russia: Moscow");
				break;
			case "Turkey":
				System.out.println("Turkey: Ankara");
				break;
			case "France":
				System.out.println("France: Paris");
				break;
			}
		}
		}
	}



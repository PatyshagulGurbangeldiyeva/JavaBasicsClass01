package com.syntax.class11;

public class o4TaskArray2dArray {

	public static void main(String[] args) {
		/*Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		 */
		
		String [][]countries= {
				{"United States","Canada","Mexico","Cuba"},
				{"Brazil","Argentina", "Colombia","Peru","chile","Ecuador"},
				{"France","Italy","Spain","Germany","Greece","Sweetherland","England"},
				{"Turkmenistan","Turkey","Ozbekistan","Azerbayjan","China","Kyrgyzstan","Mongolia"},
				{"Nigeria","Kenya","Ethiopia","Tanzania","Congo"}
		};
		int total=0;
		System.out.println("First way");
		for (int i=0; i<countries.length;i++) {
			for (int j=0;j<countries[i].length;j++) {
				System.out.print(countries[i][j]+" ");
				total++;
			}
			System.out.println();
		}
		System.out.println("Total:"+ total);
		System.out.println();
		System.out.println("Second way");
		
		int count=0;
		for (String[]name:countries) {
			for (String title:name) {
				System.out.print(title+" ");
				count++;
				
			}System.out.println();
		}
		System.out.println("Total: "+count);
		System.out.println();
		
		
		System.out.println("Third way");
	 int sum=0;
		for (String[]world:countries) {
			for (String c:world) {
				System.out.println(c+" ");
				sum++;
			}
			System.out.println();
		}
		System.out.println("total="+ sum);
	}

}

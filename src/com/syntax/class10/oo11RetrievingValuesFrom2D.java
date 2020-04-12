package com.syntax.class10;

public class oo11RetrievingValuesFrom2D {

	public static void main(String[] args) {
		String [][]month= {{"January","February","December","Hi","Hello"},
							{"March","April","May"},
							{"June","July","August","Monkey"},
							{"September","October",} };
		
		int rows=month.length; // here we check how many arrays in month { {1} {2} {3} {4} }
		int firstArray=month[1].length;// here we check how many rows in second bracket {{2}} [1]={2}
		System.out.println(firstArray);// the answer will be 3 rows as index 1=march April and May
		
		for (int i=0; i<month.length;i++) { // here we work row
			for (int j=0; j<month[i].length;j++) { // here we work with column
				System.out.print(month[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

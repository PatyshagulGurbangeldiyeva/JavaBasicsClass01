package com.syntax.class11;

public class o1Recap {

	public static void main(String[] args) {
		// get all the values from 2D array
		
		String [][] groceries= {{"cucember", "potato","carrot"},
								{"mango","apple","banana","kiwi"},
								{"milk","cheese","yogurt"}				
		};
		
		System.out.println(groceries [1][2]); // print banana
		System.out.println();
		// get all values from array
		
		for (int i=0; i<groceries.length;i++) {
			for (int j=0; j<groceries[i].length;j++) { // groceries[0].length means: in 0 row there are 3 elements so the column must be smaller than 3
				System.out.print(groceries[i][j]+" ");
			}
			System.out.println(); // if we add this here it means first print all the values accourding to the second loop then make space and continue
		}
		System.out.println();
	  System.out.println("using enhanced for loop");
	  System.out.println();
		for (String [] array:groceries) { // this for loop works with rows because of that we use just one []
			for (String items:array) { // here we worked with columns
				System.out.print(items+" ");
			}
			System.out.println();
		}
	}

}

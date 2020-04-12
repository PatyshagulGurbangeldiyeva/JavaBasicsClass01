package com.syntax.class16;

public class o1Recap {
// create a method that will accept array of int and return max element from that array
	int getLargestNumber(int []array) {
		int largest=array[0]; // we are assuming that the largest number is the first element
		
		for (int i=1; i< array.length;i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
			
		}
		return largest;
		
	}
	
	// create a method that will accept a String and return each word from a given String
	
		String [] getWordsFromString(String str) {
			String [] array=str.split(" ");
			return array; // after splitting our words stored in array, so we are returning array
		}

	
	
	
	public static void main(String[] args) {
		 o1Recap obj=new o1Recap();
		 int []arr= {10,20,30,40};
		 System.out.println(obj.getLargestNumber(arr));
		
		String myString=" It is a beautiful world ";
		String[] words=obj.getWordsFromString(myString);
		
		for (String word:words) {
			System.out.println(word);
		}
		

	}
	
	
}

package com.syntax.class13IntewievQuestions;

public class HowManyAlphaCharactersPresentAndHowManyNumOfWordsInString {

	public static void main(String[] args) {
		// find out how many alpha characters are present in a String?
		// Find number of words in String
		
		String str= "Hilsj9290(&*kdd-(& )&9n)(*^sjkdd";
		str=str.replaceAll("[^A-Za-z]", ""); // the answer after this coding will be: Hilsjkddnsjkdd
		
		int number=str.length();
		System.out.println("Number of alpha charecter= "+number); // how many characters
		
		String str1="Today is Wednesday";
		String [] array=str1.split(" ");
		int words=array.length;
		System.out.println("total words in string are: "+words);
		
	}

}

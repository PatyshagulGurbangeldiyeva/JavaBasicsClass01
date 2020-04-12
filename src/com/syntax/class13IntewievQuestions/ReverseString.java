package com.syntax.class13IntewievQuestions;

public class ReverseString {

	public static void main(String[] args) {
		//reverse string:
		// charecter  by charecter
		// word by word
		
		String given="I love Java";
		String reversed="";
		for (int i=given.length()-1; i>=0; i--) {
			reversed=reversed+given.charAt(i);// we start take the last character and concatinate with the previous one
		}
		System.out.println("reversed string is: "+reversed);
		
		System.out.println();
		System.out.println("word by word");
		
		String reversWords="";
		String []array=given.split(" ");
		for (int i=array.length-1; i>=0; i--) {
		 reversWords=reversWords+array[i]+" ";
			
		}
System.out.println("reversed String word by words: "+reversWords);
	}

}

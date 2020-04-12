package com.syntax.class11;

public class o5StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String school="Syntax";
		String str=new String (" HELLO ");
		String str1="This is as String 7676,&^&^";
		
		// how many characters String has:
		
		System.out.println(school.length()); // finding in school the number of characters
		
		int size=str.length();
		System.out.println("the length is "+size);// str how many characters. it is 7 coz of the spaces
		
		System.out.println();
		// another method is: converting to lower case or upper case
		
		System.out.println(school.toUpperCase()); // converting to upper case
		
		System.out.println(str.toLowerCase()); // CONVERTNG TO THE LOWER CASE
		
		str=str.toLowerCase(); // convert to the lower case and reassign to str
		
		
		System.out.println(str);
		System.out.println();
		// Concatenate 2 String ---> we want to join in one sentence two words
		
		// 1 way we did by using "+"
		
		String newString=str +school;
		System.out.println(newString);
		
		System.out.println();
		
		// 2 way of concatenating strings
		String day="Saturday";
		String date="14";
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		System.out.println();
		
		System.out.println("isEmpty FUNCTION");
		String str3="";
		boolean empty=str3.isEmpty(); // we use this function in order find true or false. 
		System.out.println(empty);   // if the string empty we have answer true otherwise false
		
		System.out.println();
		
		System.out.println(" trim() FUNCTION");
		String str4="  Welcome to Syntax  ";
		
		System.out.println("Hello"+str4);
		
		str4=str4.trim(); // lets use with trim()
		System.out.println(str4);// it will remove the space
		
		System.out.println("Hello"+str4);
	}

}

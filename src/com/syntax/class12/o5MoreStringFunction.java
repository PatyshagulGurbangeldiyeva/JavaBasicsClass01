package com.syntax.class12;

public class o5MoreStringFunction {

	public static void main(String[] args) {
		
		String me="I am a good tester";
		
		System.out.println("------- replace() FUNCTION-----------");
		System.out.println("THIS FUNCTION WE USE WHEN WE WANT TO REPLACE SINGLE CHARECTERS, OR WORD");
		
		System.out.println();
		
		String newString=me.replace("a", "c"); // instead of a we will see c 
		System.out.println(newString);
		
		System.out.println(); // replacing the word
		
		me=me.replace("good", "great");
		System.out.println(me);
		
		me= me.replace("Great", "Awsome"); // the old character must match the original one, or it will not replace
		System.out.println(me); //in previous we had great, but in replace fun we wrote Great. it must start with lower case!!!

		
		String car="I have a Toyota";
		car=car.replace("Toyota", "Audi");
		System.out.println(car);
		
		
		System.out.println();
		
		System.out.println("----replaceAll() FUNCTION-----");
		String str="Phone number is 1234456";
		System.out.println(str);
		
		str=str.replaceAll("[A-Z]","");// find all characters from A to Z that are capital and replace it with nothing
		System.out.println(str); // the out put will be hone.... we replaced capital P with null
		
		str=str.replaceAll("[a-z]", ""); // here we replace just lower case to empty
		System.out.println(str); // just number will stay
		
		str=str.replaceAll("[A-Za-z]", ""); // here we removing all upper and lower alfa characters
		System.out.println(str);
		
		System.out.println();
		
		String str1="Hello1234*&^&  !!!89";
		str1=str1.replaceAll("[0-9]", ""); // here we are replacing all numbers into nothing (null)
		System.out.println(str1);
		
		System.out.println();
		
		str1=str1.replaceAll("[^a-zA-Z]",""); // replacing all characters except alfa upper and lower cases
		System.out.println(str1);
		
		System.out.println();
		System.out.println("-----replace the space");
		
		String str3="Hello all students";
		str3=str3.replace(" ", "");
		System.out.println(str3);
		
	}

}

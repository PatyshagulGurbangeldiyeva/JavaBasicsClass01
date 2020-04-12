package com.syntax.class12;

public class o1StringManupulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Good Mornings Students!";
		
		char letter1=str.charAt(0); // here we are getting one charecter from the string
		System.out.println(letter1); // (0) means the index of the string
		
		char letter5=str.charAt(4); // the out put will be space
		System.out.println(letter5);
		
		System.out.println("Letter at index 4 is "+letter5+". ");
		System.out.println();
		System.out.println();
		
		System.out.println("GET ALL CHARECTERS 1 BY 1 FROM STRING");
		char letters;
		for (int i=0; i<str.length();i++) {
			letters=str.charAt(i);
			System.out.print(letters+" ");
		}
		
		System.out.println();
		System.out.println("====indexOf() function======"); // we use it in order to know which index is the letter stays
		
		String name="Syntax Technologies";
		int index=name.indexOf("y");
		System.out.println(index);
		
		
		System.out.println();
		System.out.println();
		
		
	 index=name.indexOf(" "); // trying to find the index of space
	 System.out.println(index);
	 
	 index=name.indexOf("Syntax"); // the out put will be 0 as we look to the syntax whole
	 System.out.println(index);
	 
	 index= name.indexOf("!");
	 System.out.println(index); // if there is no charecter the index output will be -1
	 
//	 char someLetter=str.charAt(55);
//	 System.out.println(someLetter); // you will get string index out of bounds exception. 
	 									//we called them run time exception
	 
	 System.out.println();
	 index=name.indexOf("o");
	 System.out.println("The index of o is "+index);
	 
	 System.out.println();
	 index=name.lastIndexOf("o");
	 System.out.println("The last index of o is "+index);
	 
	 System.out.println();
	 
	 System.out.println("-----substring() FUNCTION-----");
	 String str1="Today is a rainy day";
	 
	 String partialString=str1.substring(6);
	 System.out.println(partialString); // the output will start from index 6
	 
	 System.out.println();
	 // rainy day
	 partialString=str1.substring(10);
	 System.out.println(partialString);// if you will start with 10you will get a space 
	 partialString=str1.substring(11);
	 System.out.println(partialString);//but 11 there will not be space
	 
	 System.out.println();
	 //Today--> just print this word. 
	 // in order to print just one word you need to have beginning and ending index
	 
	
	 partialString=str1.substring(0,5);
	 System.out.println(partialString);
	 
	 // rainy
	 partialString=str1.substring(11,16);
	 System.out.println(partialString);
	 
	 
		
	}

}

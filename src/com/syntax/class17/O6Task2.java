package com.syntax.class17;

public class O6Task2 {
	/*Create a method that will take a String as a parameter 
	 * and returns reverse String. 
	 * Method should be available to all classes within your projects 
	 * and accessible by class name.
	 */
	
	public static String getReverse(String word) {
		String reverse="";
		for (int i=word.length()-1; i>=0;i--) {
			
			reverse+=word.charAt(i);
		}
		return reverse;
	}
	

	public static void main(String[] args) {
		
		//O6Task2 obj=new O6Task2 (); 
		//System.out.println(obj.getReverse("hello"));
		
		String str= O6Task2.getReverse("hello");
		System.out.println(str);
		System.out.println(getReverse("good"));

	}

}

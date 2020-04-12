package com.syntax.class11;

public class o9Task {

	public static void main(String[] args) {
		/* create three Students
		 * compare them
		 */

		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello";
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		System.out.println();
		System.out.println("comparing with ==  leteral and new keyword");
		
		if (str1==str2) { // when we are comparing strings with (literal and new keyword) it will not work
			System.out.println("Strings are equal"); // we comparing the letters the shape when we use it
		}else {
			System.out.println("Strings are not equal");
		}
		
		System.out.println();
		System.out.println("comparing with ==  leterals");
		if (str1==str3) {
			System.out.println("Strings are equal");// literals can be compared with sign ==
		}else {										// we comparing memory when we use ==
			System.out.println("Strings are not equal");
		}
		}
	}



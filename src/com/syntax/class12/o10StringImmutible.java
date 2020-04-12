package com.syntax.class12;

public class o10StringImmutible {

	public static void main(String[] args) {
		
		String str="Hello";
		String str2="World";
	
		// attach strings:
		str.concat(str2);
		System.out.println(str); // you cannot change str assign. 
								// so because of that we declaring it
		String str_Sample = "RockStar";
		System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

	}

}

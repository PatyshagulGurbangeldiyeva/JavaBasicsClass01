package com.syntax.class23;

public final class FinalKeyWord {
	public static String str="Hello";
	public static final String str1="Bye"; // final variable = constant variable
	
//	final String applicationURL;--> we cannot declare it like this as we have final keyword, we need to initialize it
	
	public static final String APPLICATION_URL="https://syntaxtechs.com";// the goal of this variable is to make access to everybody but no changes can be done
										// Usually we named it by uppercase and instead of space we have "_"!!
	
	
	public static void main (String []args) {
		str="Hi";
//		str1="Good Bye";--> here you will get CE as it has FINAL KEYWORD.it means you cannot change it even it is static
	System.out.println(str);
	
	

	}
	
	public final void hello() {
		System.out.println("I am a final method");
	}
	public final void hello (String str) {
		System.out.println("I am overloading "+str);
	}
}

// class SubClass extends FinalKeyWord {--> As FinalKeyword is final we cannot extend it!! 
	//public void hello() {}--> we cannot override method with final keyword
	// }

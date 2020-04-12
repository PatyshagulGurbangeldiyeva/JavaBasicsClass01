package com.syntax.class14;

public class o7MethodExamples {
	
	void greet() {
		System.out.println("Hello Paty");
	}
	void greet1 (String name) {
		System.out.println("Hello "+name);// so here we want to write in main class names of the ppl
										// in order to do in in brackets in greet (String names)
	}

	public static void main(String[] args) {
		// how do I call method greet----> first we need to create an OBJECT of the class
		// where that method belongs
		
		o7MethodExamples object=new o7MethodExamples();// without parameters. we don't need to pass any parametrs to print name
		object.greet();
		
		System.out.println();
		System.out.println();
		
		
		o7MethodExamples object1=new o7MethodExamples(); // this method accepts parameters. here we need to give name
		
		object1.greet1("Patyshagul");
		object1.greet1("Wepa");
		

	}

}

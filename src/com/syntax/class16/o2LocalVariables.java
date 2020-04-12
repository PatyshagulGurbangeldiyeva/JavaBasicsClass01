package com.syntax.class16;

public class o2LocalVariables {
	
	void nameInside() {
		String name="John"; // name is a local variable that visible only within method it was declared
	}
	
	
	
	
	

	public static void main(String[] args) {
		
	// 	System.out.println(name); --> if we want to print as this this code it will not work and it will give CE.
						//			  name won't be visible to another method
						// 			  since its scope only within nameInside method
		

	}

}

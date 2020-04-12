package com.syntax.class18;

public class O7Task4 {
	// create variables to hold state and capital of the state
	
	String state, stateCapital;
	
	// create method to display state and its capital
	// here we cannot use static for method as variables are non static
	public  void display() {
		System.out.println("the capital of "+state+" is "+stateCapital);
	}

	// create a constructor that will initialize instance variables
	
	O7Task4(String state, String stateCapital){ // if you write the same name as instance you will get null variable
		this.state=state;						// but if you add this. keyword it will be print
		this.stateCapital=stateCapital;
		
	}
	public static void main(String[] args) {
		
		O7Task4 usa=new O7Task4("Texas", "Dallas");
		usa.display();
		
		O7Task4 usa1=new O7Task4("Virginia","Richmond");
		usa1.display();
	}
 
}

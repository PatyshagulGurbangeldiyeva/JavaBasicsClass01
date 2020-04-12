package com.syntax.class19;

public class O2USACallingMethodInMethod {
	String state, capital;
	
 public	O2USACallingMethodInMethod (String state, String capital) {
	 this.state=state;
	 this.capital=capital;
	 
 }
 public void displayState() {
	 System.out.println(state);
 }
 public void displayCapital() {
	 System.out.println(capital);
 }
 // can I call a method inside another method?---->yes
 public void displayInfo() {
	 displayState();
	 displayCapital();
 }
 

	public static void main(String[] args) {
		
		O2USACallingMethodInMethod state1=new O2USACallingMethodInMethod("Texas", "Austin");
		state1.displayInfo(); // first we create obj and initi the instance variables.
								// then we called the code and printed in it these two codes

		state1=new O2USACallingMethodInMethod("Georgia", "Atlanta");// here we reassigned
		state1.displayInfo();
		
	}

}

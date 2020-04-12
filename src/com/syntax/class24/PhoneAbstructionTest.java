package com.syntax.class24;

public class PhoneAbstructionTest {
	// new PhoneAbstruction()--> cannot be created the class of object class
	// BECAUSE IT IS ABSTRACT
	
	//so we will create obj of a child class
	public static void main (String [] args) {
	
	PhoneAbstruction iphone=new iPhone();
	iphone.call();
	iphone.text();
	iphone.takePicture();
	iphone.playMusic();
	
	System.out.println();
	System.out.println();
	
	PhoneAbstruction samsung=new Samsung();
	samsung.call();
	samsung.text();
	samsung.takePicture();
	 samsung.playMusic();
	
}
}

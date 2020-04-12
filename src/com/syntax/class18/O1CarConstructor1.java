package com.syntax.class18;

public class O1CarConstructor1 {
	
	String make, model, color;
	int year;
	
	public void display() {   // if you want to make static method you need to have static variables
		            // as your variables are not static, so method cannot be static
		System.out.println("I have "+year+" "+make+" "+model+" car and it is color is "+color);
	}

	public static void main(String[] args) {
		O1CarConstructor1 car1=new O1CarConstructor1();
		car1.display(); // as here the method is instance the constructor initialized them as default!!!
		
		System.out.println(car1.year);
		
		// but if you create local variable and print without initializing you will get CE
		
		// int doors; ----> local variable
		//System.out.println(doors);----> so you need to initialize it

	}

}

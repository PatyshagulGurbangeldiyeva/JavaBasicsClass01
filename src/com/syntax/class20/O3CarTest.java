package com.syntax.class20;

public class O3CarTest {
	public static void main (String []args) {
		//O3Car car=new O3Car(); // we call class constructor grandclass
		System.out.println("----------");
		
		
		Mercedes merc=new Mercedes(); // here we are calling constructor of 
			System.out.println("-----");							// child class
	merc.display(); // here you will have null
					// because we did not initialize them
	
	System.out.println("--------------");
	Mercedes merc1=new Mercedes ("Mercedes", "S","AMG");
	merc1.display(); // here we are calling method
					// method called first paret class then initialize sportmodel
	
	}

}

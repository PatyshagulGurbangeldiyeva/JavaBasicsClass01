package com.syntax.class21;

public class OverloadingAdditionTest {

	public static void main(String[] args) {
		
		OverloadingAddition obj=new OverloadingAddition();
		obj.add(34,6.7); // here java will find automatically
						 //which add method choose
						 // according to your input(parameters)
		
	}

}

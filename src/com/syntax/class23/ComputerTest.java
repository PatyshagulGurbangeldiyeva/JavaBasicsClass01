package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer [] computers= {new Apple ("Apple"), new Lenovo ("Lenovo"), new HP ("HP")};
		for (Computer comp:computers) {
			comp.run();
			comp.transfer(); // even in subclass there is no this method, parent class will be printed
//			comp.safe(); CE as we don't have in parent class
			comp.save();
			System.out.println();
			
		}
		
	}

}

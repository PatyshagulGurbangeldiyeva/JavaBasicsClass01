package com.syntax.class25;

public class BOATest {

	public static void main(String[] args) {
		BOA bank=new BOA();

		bank.deposit();
		bank.deposit();
		bank.financing();
		bank.withdraw();
		bank.giveCredit();
		
		System.out.println();
		
		Bank b=new BOA(); // here we can use three methods
						 // as Bank extends with Trustable and total methods there 3
		b.trust();
		b.deposit();
		b.withdraw();
	}

}

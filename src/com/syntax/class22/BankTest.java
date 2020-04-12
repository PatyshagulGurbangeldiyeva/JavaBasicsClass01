package com.syntax.class22;

public class BankTest {
	
	
	public static void main (String [] args) {
	
		Bank bank=new Bank(570.6);
		double fee= bank.chargeFee();
		System.out.println(fee);

	
	BOA boa=new BOA(5000);
	System.out.println(boa.chargeFee());
	
	PNC pnc=new PNC (970);
    fee= pnc.chargeFee();
	System.out.println(fee);
	
	TD td=new TD(467.8);
	fee=td.chargeFee();
	System.out.println(fee);
	}
	
	
	
}

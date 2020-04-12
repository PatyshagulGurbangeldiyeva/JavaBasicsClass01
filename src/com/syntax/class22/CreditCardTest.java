package com.syntax.class22;

public class CreditCardTest {
public static void main (String[] args) {
	
	CreditCard cc1=new CreditCard();
	System.out.println(cc1.calculate(45, 15));

	Visa cc2=new Visa();
	double interest=cc2.calculate(45,15);
	System.out.println(interest);


	AX cc3=new AX();
	interest=cc3.calculate(45,15);
	System.out.println(interest);

}
}

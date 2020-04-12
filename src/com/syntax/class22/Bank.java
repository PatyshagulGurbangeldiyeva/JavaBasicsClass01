package com.syntax.class22;

public class Bank {
	double money, fee; // instance variables
	
	Bank(double money){
		this.money=money;
	}
	double chargeFee() {
		if (money<1000) { // as this method changed in PNC class we can call this method as
			fee=money*0.1; // Overridden method!!!!
		}else {
			fee=0;
		}
	return fee;	
}
}

class BOA extends Bank{ // if you will not call constructor CE will be
	public BOA(double money){
		super(money);
	}
	
}
class PNC extends Bank{ // as this bank we are not satisfied with fee we want to charge more
	public PNC(double money) {// so we are using overriding, as using the same method name but changing inside
		super(money);
	}
	double chargeFee() {
		if (money<1000) {
			fee=money*0.2; // here we provided our own logic
		}else {
			fee=0;
		}
	return fee;
}
}
	
class TD extends Bank{
	TD(double money){
		super (money);
	}
	double chargeFee() {
		if (money<1000) {
			fee=money*0.3;
		}else {
			fee=0;
		}
		return fee;
	}
}



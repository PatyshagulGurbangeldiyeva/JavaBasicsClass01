package com.syntax.class25;

public interface Trustable {
	// by default compiler will make method to be public and abstract
	void trust();
	

}
interface CreditUnion{
	void giveCredit();
}
class Finance{
	public void financing () {
		System.out.println("gives financing");
	}
} 

interface Bank extends Trustable{
	void deposit();
	void withdraw();
}
class BOA extends Finance implements Bank,CreditUnion{ // we can use "," as both of them same type interface and we are implementing
	public void trust() {
		System.out.println("BOS is trustable");
	}
	public void deposit() {
		System.out.println("You can make a deposit at BOA");
	}
	public void withdraw () {
		System.out.println("You can withdraw your money at BOA");
	}
	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit");
		
	}
	
}


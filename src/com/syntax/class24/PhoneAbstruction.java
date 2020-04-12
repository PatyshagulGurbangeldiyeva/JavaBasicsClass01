package com.syntax.class24;

public abstract class PhoneAbstruction {

	public void call() { //---> here we know what exactly all phones can do. So, we implement the method
		System.out.println("Phone can make a call");
	}
	public void text() {
		System.out.println("Phone can send text");
	}
	
	// unimplemented methods= undefined methods=abstract methods
	public abstract void takePicture(); // {} --> here I don't know what details I will have implementations details. so we have to use "abstract" modifier
										//	THERE IS NO BODY!!! {}
										// AS WE HAVE ABSTRACT METHOD WE NEED TO HAVE ABSTRACT keyword before CLASS!!!
										// abstract keyword can be used with class and methods
	
	
	public abstract void playMusic();
}

class iPhone extends PhoneAbstruction{ // when we are inheriting with parent class and taking abstract methods we have to take all of them!!
	@Override
	public void takePicture() {
		System.out.println("iPhone takes pictures");
	}
	@Override
	public void playMusic() {
		System.out.println("iPhones play music by using apple store");
	}
}
class Samsung extends PhoneAbstruction{
	@Override
	public void takePicture() {
		System.out.println("Samsung can take pictures");
	}
	@Override
	public void playMusic() {
		System.out.println("Samsung plays music using google store");
	}
}

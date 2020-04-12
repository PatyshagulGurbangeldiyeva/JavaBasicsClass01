package com.syntax.class23;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}

}
class Bird extends Animal{
// 	@Overriding---> we checked and it did not overriding as static methods cannot be override!!!
	public static void whoAmI() { // ---> here it looks like overriding check it with @Overriding
		System.out.println("I am a bird");
	}
	public void sleep() {
		System.out.println("Birds sleep");
	}
}

package com.syntax.class22;

public class Recap {
	public void hello() {
		System.out.println("hello");
	}
	public void hello (String str) {
		System.out.println("Hello");
	}
	private void hello (String str, int x) { // it is not overloading as access modifiers are not same
		System.out.println("Hello "+ x);
	}
	// private void hello (String str) { it cannot be overloaded as method parametrs same!!
	//	System.out.println("I");
	}
	



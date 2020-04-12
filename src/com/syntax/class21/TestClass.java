package com.syntax.class21;

public class TestClass {

	public static void main(String[] args) {
		
		MathTeacher mt=new MathTeacher("Judy", "Smith");
		// here we called child class constructor
		// but child class also called parent class constructor that has non
		// argument constructor.
		// so because of that we have : I am a parent constructor, I am a child construcotr

		System.out.println(mt.name);
		System.out.println(mt.lastName);
		
		
		JavaTeacher jt=new JavaTeacher("Briell", "Ngu", "JavaCertificate");
		String n1=jt.lastName;
		System.out.println(n1);
	}

}

package com.syntax.class18;

public class O5Task2 {
	/*
	 * Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name. 
	 * NOTE: please use different names for instance and local variables.
	 */
	String name;
	int grade1, grade2, grade3;
	int average;
	
	public int getAverage( ) {
		average=(grade1+grade2+grade3)/3;
		// System.out.println(name+" has an average of grades: "+average);
		return average;
		
	}
	
	O5Task2(String name01, int grade01, int grade02, int grade03){
		name=name01;
		grade1=grade01;
		grade2=grade02;
		grade3=grade03;
	//	System.out.println(name+" has an average of grades: "+(grade01+grade02+grade03)/3);
		
		
	}
	
	

	public static void main(String[] args) {
		
		O5Task2 s1=new O5Task2("Paty",80,90,55);
		System.out.println("Student: "+s1.name+" average grade is "+s1.getAverage());
		
		System.out.println();
		
		O5Task2 s2=new O5Task2("Vepa", 89,49,90);
		System.out.println("Student: "+s2.name+" average grade is "+s2.getAverage());
		
		System.out.println();
		
		O5Task2 s3=new O5Task2("Yusup", 78,86,98);
		System.out.println("Student: "+s3.name+" average grade is "+s3.getAverage());
		

	}

}

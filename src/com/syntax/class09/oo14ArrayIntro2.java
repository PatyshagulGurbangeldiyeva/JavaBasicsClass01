package com.syntax.class09;

public class oo14ArrayIntro2 {

	public static void main(String[] args) {
		// we want to store 3 elements
		// arrays are fixed in size!!!
		// if we add more values then we declared ---> java.lang.ArrayIndexOutOfBoundsException
		String students[]=new String [3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";// so we want to add extra element number 4 element
	// students [3]="Aaron";// during run time the java machine will give:
	//	System.out.println(students[3]);// the output will be exception will be: 
		                                // array index of bounds exception!!!
		
		
		// if we store less elements than we declared
		 // we will get NULL (NOTHING)
        // Because we did not assign it!!!
        // we got NULL  because it was String
        // in INT you will get 0
		// compiler will add default values
		
	
		
		String [] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		inClassStudents[3]="Jemal";
		inClassStudents[4]="Vepa";
		//inClassStudents[5]="Paty"; it is a six element so you will get the answer-->array index of bounds exception!!!
		
		System.out.println(inClassStudents[0]); // here you will get the answer NULL. as we did not
												// declare the first[0] element
		
		
		
	}

}

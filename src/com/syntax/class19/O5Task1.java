package com.syntax.class19;

public class O5Task1 {
	/*Write program as a Student class   
	 * that has instance variables name and address. 
	 * Create a constructor that will initialize those variables. 
	 * Print name & address of given  student using displayInfo method.
	 */
	
	public String name, address;
	
	O5Task1(String name, String address){
		this.name=name;
		this.address=address;
		
	}
	public void displayName() {
			System.out.println("student name is "+name);	
	}
	public void displayAddress() {
		System.out.println("student's address is "+address);
	}
	public void displayInfo() {
		displayName();
		displayAddress();
		System.out.println();
	}
	

	public static void main(String[] args) {
		O5Task1 obj=new O5Task1("Alparslan","6102 North Shiloh");
		obj.displayName();
		obj.displayAddress();			
		obj.displayInfo(); // here we put both methods in one method

	}

}

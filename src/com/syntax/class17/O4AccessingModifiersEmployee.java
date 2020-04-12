package com.syntax.class17;

public class O4AccessingModifiersEmployee {

	public static void main(String[] args) {
		// we are in different class but in the same package. 
		// we are trying to access from different class "O3ModifiersEmployee"
		
		O3ModifiersEmployee obj=new O3ModifiersEmployee();
		
		obj.name="Paty";
		obj.lastName="Gurban";
		obj.title="tester";
		obj.salary=27251;
	//	obj.ssn=236282;  you will get CE because first you assign it as private variable.
		
		O3ModifiersEmployee.method1(); // I can access static method by class name

		//		O3ModifiersEmployee.method2();  it will not accept as it was not declared as static.
		
		obj.method2();
		obj.method3();
//		obj.method4();--> you cannot access as it is private. you can access it in the same class
		
		
		
		
		

	}

}

package com.syntax.class22;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee ();
		emp.salary=8000;
		emp.getPaid();
		
		FullTimeEmployee ft=new FullTimeEmployee();
		ft.salary=8700;
		ft.getPaid();
		
		Contractor cnt=new Contractor();
		cnt.hourlyRate=50;
		cnt.getPaid();
		
		
	}

}

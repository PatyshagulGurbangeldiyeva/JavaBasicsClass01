package com.syntax.class20_1;

import com.syntax.class20.O2Employee;

public class O2WaterFallTeam extends O2Employee{

	// lets see what we can access from class O2Employee
	// we are in different class but this class is child class of O2Employee class
	public static void main (String []args) {
	O2WaterFallTeam wteam=new O2WaterFallTeam();
	O2WaterFallTeam.company="Syntax"; // company is static so we called it by name
	wteam.empNumber=124;
//	wteam.salary=36220;--> i cannot get this info as it was declared as default
	
	
}
}

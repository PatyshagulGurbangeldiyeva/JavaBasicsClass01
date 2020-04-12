package com.syntax.class20;

public class O1TestClass {
	void test() {
		System.out.println("tester is testing");
	}

	public static void main(String[] args) {
		// so here we are creating product owner
		
		O1ScrumTeam employee=new O1ScrumTeam();
		O1ScrumTeam scrumTeam=new O1ScrumTeam();
		O1ScrumTeam tester=new O1ScrumTeam();
		
			
		 tester.ceremonies="Sprint Demo";// access variables from own class
		 
		 tester.company="Syntax";			// access variables from parent class
		 tester.empNumber=2342;
		 tester.salary=6000;
		 
		 tester.attendMeetings(); 			// access method from own class
		 
		 tester.getPaid();					// access method from parent class
		 tester.work();
		 
		 O1TestClass tester1=new O1TestClass();
		 tester1.test();
		 tester1.info();

	}

	private void info() {
		// TODO Auto-generated method stub
		
	}

}

package com.syntax.class15;

public class o6MethodReturn {
	//create a method that will accept marks
	// base on the marks it will return grades (A,B,C...)
	// if grade>90---> A, if 90<grade>80---> B  if 80<grade>70--->C
	
	
	
	
	char grade(int num) {
		char grade;
		if (num>=90) {
			grade='A';
		}else if(90<num || num>=80) {
			grade='B';
			
		}else if (80<num || num>=70) {
			grade='C';
		}else if (70<num || num>=60) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
	}

	public static void main(String[] args) {
	 o6MethodReturn obj=new o6MethodReturn();
	 char last=obj.grade(67);
	 
	 System.out.println(last);
	 
	// if grade is A or B ---> good job , otherwise ---> study more
	 
	 if (last=='A'||last=='B') {
		 System.out.println("Good Job");
	 }else {
		 System.out.println("Study more");
	 }
	}

}

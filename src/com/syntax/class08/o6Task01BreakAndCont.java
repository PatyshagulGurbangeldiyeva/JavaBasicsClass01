package com.syntax.class08;

import java.util.Scanner;

public class o6Task01BreakAndCont {

	public static void main(String[] args) {
		/*write a program that print numbers 1 to 20
		* i do not want to print 5,6,7
		 */
System.out.println("----------------TASK 1----------------------");
System.out.println(" ");
		for (int b=1; b<=20; b++) {
			if (b==5 || b==6 || b==7) { // if inside of if there is one code as "continue" so we dont need braces
				continue;
			}
			System.out.print(b+" ");
		}
		
		System.out.println(" ");
		System.out.println("--------------------TASK 2 --------------------------");
		System.out.println(" ");
		
		// Print numbers from 1 to 50 except those that are divisible by 3
		
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
		System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println("------------------------TASK 3--------------------");
		/*Create a program that will be asking user to apply for a credit card 10 times.
		 * As soon you get an “yes” from a user program should stop asking. 
		 */
		
				
		Scanner input=new Scanner (System.in);
		boolean answer;
		
		 
		for (int x=1; x<=10;x++) {
			System.out.println("Please apply for credit card");
			 answer=input.nextBoolean();
			 if (answer==true) {
				System.out.println("We glad to help you");
		    break;
			 }
		}
			
		
		System.out.println(" ");
		//System.out.println("-------------------Second Way----------------");
		// SECOND WAY
	//	String reply;
		//for (int i=1; i<=10; i++) {
		//	System.out.println("Please apply for credit card");
		//	 reply=input.nextLine();
		//	 if (reply.equals("yes")) {
		//		 System.out.println("We glad to help you");
		//		    break;
			// }
		//}
	}

}

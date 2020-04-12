package com.syntax.class09;

public class o1RecapLoops {

	public static void main(String[] args) {
		/*we have 4 types of loops:
		 * while, do while, for, advanced for
		 * we use WHILE or DO WHILE when we don't know number of ITERATIONS
		 * we use FOR or FOR ADVANCED when we know the number of ITERATION ahead of time
		 * 
		 * BREAK--> to stop the loop
		 * CONTINUE----> to skip current iteration (to move to the next iteration)
		 * 
		 * NESTED LOOP----> loop inside the loop. it is applicable for all of the loops
		 * 
		 */
		
		//ex for nested loop
		
 	for (int i=1; i<=3;i++) {
			System.out.println("I am outer loop");// will be executed 3 times but before inner loop will be executed
		for (int j=1;j<3;j++) {
			System.out.println("I am inner loop");// three times but after outer loop will executed then again it will execute
		
		}
				
		}
 	System.out.println("-----------------------------------------------------");
	System.out.println(" ");
	}

}

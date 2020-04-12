package com.syntax.class08;

public class o5BreakAndContinue {

	public static void main(String[] args) {
		// sometimes we want to stop our loop
		// so then we use break keyword

		// for ex:

		// for (int i=1; i<=10; i++) {
		// System.out.print(i+" ");// here i printed till 10

		// so right now I want to stop the loop on number 4

		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I am stopping loop"); // IF IT IS THE NOT THE SAME NUMBER IT WILL NOT PRINT INSIDE JUST 
				break;                                    // KEEP GOING TO DOWN. BUT IF THE SAME ANSWER THEN IT WILL GET INSIDE AND STOP 
			}
			System.out.println(i);
			System.out.println("I am inside the loop");
			System.out.println("I am outside of the loop");
			

		}
		System.out.println(" ");
		System.out.println("---------CONTINUE-----------");
		for (int y = 1; y <= 10; y++) {

			if (y == 3) {
				System.out.println("I am skipping iteration");// when we come number 3 then we will enter to this part
																// number 3 will not be printed
				continue;
			}

			System.out.println(y);

		}

		System.out.println("------EXAMPLE--------");
		
		// write a program that print numbers 1 to 20
		// i do not want to print 5,6,7
   for (int d=1;d<=20;d++) {
	   if (d==5 || d==6 || d==7) {// IF THE NUMBERS TRUE THEY WILL IGNORE THE NEXT PART AND GO UP TO THE BEGINNING
		   continue;
	   }
	   System.out.print(d+" ");
	   // THERE WOULD NOT BE OUTPUT 5,6,7 NUMBERS. WE USED || BECAUSE AT THE SAME TAME Y CANNOT BE 5,6 AND 7!!!!!
   }
   
   System.out.println(" ");
   System.out.println("------------------EXAMPLE-------------------");
         // write a program that print numbers 1 to 100
		// i do not want to print 35-55
   
   for (int f=1; f<=100; f++) {
	   if (f>=35 && f<=55) {
		   continue;    // when you got 35-55 numbers you are just continuing to go up not to down!!!!
	   }
	   System.out.print(f+" ");
   }
	}
}

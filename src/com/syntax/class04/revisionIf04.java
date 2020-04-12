package com.syntax.class04;

public class revisionIf04 {

	public static void main(String[] args) {
	// the task is:
	// check if a patient has any allergies
		// if no allergies---> you are healthy
		// otherwise check if patient has:
		     // orange allergie----> do not eat oranges
		     // apple allergy------> do not eat apples
		     // kiwi allergy ------> do not eat kiwi
	
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=true;
		
		if (allergy) {
			System.out.println("Please answer to the questions below");
			
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
			} 
			if (appleAllergy) {
				System.out.println("Do not eat apples");
			}
			if(kiwiAllergy) {
				System.out.println("Do not eat kiwis");
			}
						
		}else {
			System.out.println("You are healthy");
		}


	}

}

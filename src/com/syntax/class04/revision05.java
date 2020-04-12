package com.syntax.class04;

public class revision05 {

	public static void main(String[] args) {
		
		/* we will be checking if the student completed the quiz write "let's check your score"
		 * if score>=90----> great job
		 * if score>=80-----> well done
		 * if score >=70-----> you could do it better
		 * 
		 * if the student did not complete the quiz----> not good, please do homework on time
		 * */ 
		
		// ypu also must be carefull in ordering. the coding will be top on button
		
		// if we use to varify:
		// we can have sipmle if
		//esle if condition
		/* and nested if: it means the second if is in the first if
		* for ex: if(name){
		*  if (name2)
		*  System.out.println("Happy");}*/

		boolean quizCompleted=true;
		int score=88;
		
		if (quizCompleted) {
			System.out.println("Let's check your score");
			if(score>=90) {
				System.out.println("great Job");
			}else if (score>=80) {
				System.out.println("Well done"); // we used "else if" because we are looking from the same variable. 
			}else if(score>=70) {
				System.out.println("You could do it better");// we are providing multiple conditions for the same variable
			}else {
				System.out.println("Failed");
			}
		}else {
			System.out.println("Please do homework on time");
		} 
	}

}

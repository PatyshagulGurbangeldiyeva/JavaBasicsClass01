package com.syntax.class04;

import java.util.Scanner;

public class TaskScanner01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please write amount of loan needed");
		
		int loan=input.nextInt();
		
				
		if (loan<=200000) {
			System.out.println("the money will be given");
			
			/* or you can write like this
			* if (loan<200000){
		    *System.out.println("You can get money);
		    *}else if (loan=20000){
		    *System.out.println("You can get money);}
		    */
		
		}else {
			System.out.println("rejected");
		}
			
		}

	}



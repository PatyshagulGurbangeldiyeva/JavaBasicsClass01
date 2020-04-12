package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/* you are a salesman
		 * ask a user for how much his sales are
		 * based on amount of sales we need to calculate commission
		 * if sales is btw 1-100$----> commission should be 10%
		 * if sales is btw 100-200$--->commission should be 20%
		 * if sales is btw 200-500$--->commission should be 30%
		 * if sales is more 500$--->commission should be 50%
		 */

		// 1. declare all variables that I will need 
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amaunt");
		
		sales=scan.nextDouble();
		
		if (sales>=1 && sales<=100) {
			// we will give 10%
			commission=sales*0.10;
			
		}else if (sales>100 && sales <=200) {
			//give user 20%
			commission=sales*0.20;
			
		}else if (sales>200 && sales<=500) {
			// give user 30%
			commission=sales*0.3;
			
		}else {
			commission=sales*0.50;
		}
		System.out.println("Based on your sales your commission is= "+commission);
		
		if (commission>0.30) {
			System.out.println("Your commission is 10%");
		}
	}

}

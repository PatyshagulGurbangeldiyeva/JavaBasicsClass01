package com.syntax.class04;

public class Task02 {

	public static void main(String[] args) {
		
		double mortageRate=3.6;
		double mortagePrice=350000;
		
		if (mortageRate<4.5) {
			System.out.println("You can buy a house ");
			if (mortagePrice>200000) {
				System.out.println("You can take a loan");
			}else {
				System.out.println("You can pay cash");
			}
		}else {
			System.out.println("You cannot buy a house");
		}
		

	}

}

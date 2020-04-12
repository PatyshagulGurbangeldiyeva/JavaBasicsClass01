package com.syntax.class09;

public class o2TaskWithHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int h=0;h<24;h++) {
			
			for (int m=0;m<60;m++) {
				
				if (m<10 || h<10) {
					System.out.println("0"+h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}

	}

}

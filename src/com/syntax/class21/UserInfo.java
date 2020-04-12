package com.syntax.class21;

public class UserInfo extends UserClass{

	String address;
	protected UserInfo(String name, long mobNo, String address){
		super(name, mobNo);
		this.address=address;
	}
	void display () {
		System.out.println(name+"'s mobile no is: "+mobNo+". And the address is: "+address);
	}
}

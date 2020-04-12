package com.syntax.class15;
   
public class o7Task {
	/*Create a method createEmail(). 
	    * Based on provided users name, lastName and email type, 
		*your method should return complete email Address.
		*Example: johnsnow@gmail.com or johnsnow@yahoo.com
		*/
	
	String createEmail(String usersName, String LastName, String emailType) {
		return emailType;
	}
	
	public static void main(String[] args) {
		
		o7Task obj=new o7Task ();
		String  email=obj.createEmail(" Patyhsagul", "Gurbangeldiyeva", "patyshagulg@gmail.com");
		System.out.println(email);
		

	}

}

package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
	// declare a  number and compare if number larger than 100
    
		//if number is larger than 100-----> my number is large
		
		// equal to                 ==
		// greater than              >
		// less than                 <
		// greater than/ equal to    >=
		// smaller than/equal to     <=
		// not equal to              !=
		// or                        ||
		// and                       &&
		
		System.out.println("starting coding");
		
		int num=178;
		if (num>100) {
			System.out.println("my number is large");
		}

		System.out.println("end of the program");
		
		if (num<100) {
			
			System.out.println("my number is small");
			// there is no result in console coz the number is not smaller than 100
		}
		System.out.println("the final end");
		
		System.out.println("___________________________");
		
		int expectedHours=15;
		int actualHours=4;
		//if actual is more than expected----> you will love java
		
		if (actualHours>=expectedHours) {
			System.out.println("You will love JAVA");
			// there will be no answer coz 4 is smaller than 15
			
		} else {
			// else means ---> if false--->if(actualHours<expectedhours)
		System.out.println("you will not like JAVA");
		
	}
		System.out.println("-----------------------------------");
		
		double boudget=10000;
		double carPrice=12000;
		
		if (boudget<carPrice) {
			System.out.println("I wont buy a car");
		}else {
			System.out.println("I will buy this car");
		}
		System.out.println("I am code after if condition");
		
		System.out.println("------------------------------------");
		
	// How to use boolean expression. the result will be true or false			
	
boolean w=(2==2);

System.out.println(w);

boolean z=(2>3);
System.out.println(z);

boolean n=(2!=1);
System.out.println(n);

// we created true false statements. 

// so right now we will use boolean with if condition

boolean j=(5%2==1);

System.out.println(j);

System.out.println("-------------------");

boolean a= ((10-1==8) && (false)) || ((false) && (false));

System.out.println(a);
}

}

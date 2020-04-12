package com.syntax.class15;

public class o5MethodsReturningValue {
	
int largest (int a, int b){ // here we did not use void as this method doesnt return value. we changed it to in
	   						// as we need largest number and it is int
		int largest;
		if (a>b) {
			largest=a;
		}else {
			largest=b;
		}
		return largest; // here we trying to get largest number as we will work on it
	}
boolean isOdd(int num) { //in order to return what we need, we must to change void to returning method
	boolean isOdd=true;

	if (num%2==0) {
		isOdd=false;
	}else if (num%2!=0) {
		isOdd=true;
	}
	return isOdd; // here we are trying to get odd number
	}





	public static void main(String[] args) {
		// create a String and based on the length of the String
		// we define whether String is short or long
		
		String str="Hello my friend";
  	int	length=str.length();
		if (length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}

		System.out.println("compare two numbers big or small and then identify whether largest number is even or odd"); 
		
		o5MethodsReturningValue newObj=new o5MethodsReturningValue();
		
		int num1=newObj.largest(10, 20); // as we are returning we need to save it
		
		boolean num2=newObj.isOdd(num1);
		
		System.out.println("the largest number is "+num1+" and it is "+num2);
		
	}

}

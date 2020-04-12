package com.syntax.class23;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver(); // upcasting
		driver.open(); // --> if this code we have in both class parent and child
					// then in child class will be printed
					// but if don't have in child class but have in parent class then in parent class will be printed
					// if don't have in parent class but have in childclass it will not be printed CE
					// this is example of runtime--> reading through method overriding!!

	}

}

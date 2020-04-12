package com.syntax.class25;

public class WebdriverTest {

	public static void main(String[] args) {
		
		Webdriver chrome=new ChromeDriver();
		chrome.closeBrowser();
		chrome.openBrowser();
		chrome.maximizeWindow();
		chrome.findElement();
		
		System.out.println();
		
		Webdriver fire=new FirefoxDriver();
		fire.closeBrowser();
		fire.openBrowser();
		fire.maximizeWindow();
		fire.findElement();
		

	}

}

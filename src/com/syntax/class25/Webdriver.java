package com.syntax.class25;

public interface Webdriver {
	/*Create a WebDriver Interface that will have the following unimplemented behaviour: 
	 * openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	 *  Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	 */

	// even here we did not mention the methods are public static!!
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}
class ChromeDriver implements Webdriver {
	public void openBrowser() {
		System.out.println("opens browser in chrome");
	}
	public void closeBrowser() {
		System.out.println("you can close this browser");
	}
	public void maximizeWindow() {
		System.out.println("maximize window");
	}
   public void findElement() {
    	System.out.println("finds elements");
    }

}
class FirefoxDriver implements Webdriver{
	public void openBrowser() {
		System.out.println("opens ");
	}
	public void closeBrowser() {
		System.out.println("closes");
	}
	public void maximizeWindow() {
		System.out.println("maximizes ");
	}
	public void findElement() {
		System.out.println("finds ");
	}
}

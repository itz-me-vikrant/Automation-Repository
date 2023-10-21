package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		// To launch Firefox browser we need to create EdgeDriver()
		
		new FirefoxDriver();
		
		System.out.println("Firefox is open"); 
	}

}

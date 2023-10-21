package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openclosebrowser {

	public static void main(String[] args) throws InterruptedException {
		// To launch web browser we need to create object
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("Chrome browser is open");
	Thread.sleep(2000);
	driver.close();
	System.out.println("Chrome browser is close");
	

	}

}

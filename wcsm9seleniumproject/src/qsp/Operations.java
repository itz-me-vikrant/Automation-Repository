package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Operations {

	public static void main(String[] args) throws InterruptedException {
	// To launch Firefox browser we need to create EdgeDriver()

	WebDriver driver = new FirefoxDriver();
	System.out.println("Firefox browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Firefox browser is maximize");
	
	Thread.sleep(2000);
	System.out.println("Firefox browser is open only for 2 second");
	
	driver.close();
	System.out.println("Firefox browser is closed.");
	
	
	

	}

}

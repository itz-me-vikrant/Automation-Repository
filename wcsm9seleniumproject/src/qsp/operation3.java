package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class operation3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		System.out.println("firefox is open");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		System.out.println("firefox is closed");

		
		
	}

}

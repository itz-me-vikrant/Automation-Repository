package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Shrikant/Desktop/html_Basics/FB%20application.html");
		Thread.sleep(2000);
		
		//identify usernameTB and passed input as "admin"
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		//identify passswordTB and passed input as "manager"
		driver.findElement(By.tagName("input")).sendKeys("manager");
		Thread.sleep(2000);
	}

}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInstaByUsingContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@class,'_aa4b _add6 _ac4d')]")).sendKeys("1111");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();
	Thread.sleep(2000);
	driver.quit();
	}
}

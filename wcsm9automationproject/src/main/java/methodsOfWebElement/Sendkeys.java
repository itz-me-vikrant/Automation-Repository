package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys("55555555");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("77777775");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).clear();

	//input[@name='password']
	}

}

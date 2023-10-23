package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class OmayoExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(61));
		driver.get("https://shoppersstack.com");
		
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 '")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		  WebElement checkbutton = driver.findElement(By.id("Check"));
	}
	
	public abstract WebElement explicitWait (WebDriver driver,long sec,WebElement ele);
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
	}
	

}

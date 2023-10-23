package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraEndToEnd {
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit
		
		driver.get("https://www.myntra.com/");
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shose");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		
		WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(30));//explicit
		
		String ParentAddress = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//picture[@class='img-responsive'])[1]")).click();
		Set<String> AllAddress = driver.getWindowHandles();
		
		for(String wh:AllAddress)
		{
			if(!ParentAddress.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		driver.findElement(By.xpath("//img[@class='colors-image' and (@style='background-color: rgb(54, 69, 79);')]")).click();
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and (text()='9')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411039");
		driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG' ]")).click();
		driver.findElement(By.xpath("//span[text()='GO TO BAG' ]")).click();
		
		driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkRemove']")).click();
		//button[@class='inlinebuttonV2-base-actionButton'] 
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='inlinebuttonV2-base-actionButton '] "))).click();
	
	}

}

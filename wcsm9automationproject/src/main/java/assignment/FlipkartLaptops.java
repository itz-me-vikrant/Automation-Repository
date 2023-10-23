package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptops {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("laptops");
		//click on search icon
	    driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
//	    //click on brand and select HP
        driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao']")).click();
        driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	    Thread.sleep(3000);
	    
	    //identify the name of laptops
//	    =driver.findElements(By.xpath(null))
	}

}

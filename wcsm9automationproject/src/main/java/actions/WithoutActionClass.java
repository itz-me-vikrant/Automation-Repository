package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//handle popup
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		 WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		if(driver.findElement(By.xpath("//h1[text()=' Lakshmigoldccoins ']")).isDisplayed());

		

	}

}

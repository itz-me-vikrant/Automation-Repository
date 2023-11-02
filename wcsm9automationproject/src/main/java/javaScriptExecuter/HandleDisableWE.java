package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com");
		//find disable mode 
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		//explicit typecasting into JSexecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//handle disable name TB
		jse.executeScript("document.getElementById('name').value='vikrant'");
		//handle disable email TB
		jse.executeScript("document.getElementById('email').value='vikrant555'");
		//handle disable password TB
		jse.executeScript("document.getElementById('password').value='vikrant456'");
		//click on disable register button
		WebElement disableRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
		if(disableRegisterButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",disableRegisterButton);
			Thread.sleep(3000);
			driver.findElement(By.xpath(""));
			System.out.println("Click");
		}
	}

}

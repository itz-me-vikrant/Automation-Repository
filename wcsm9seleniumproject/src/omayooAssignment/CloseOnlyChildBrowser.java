
//how to close only child browser

package omayooAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		
		String parentAddr = driver.getWindowHandle();
		driver.findElement(By.xpath("*//a[text()='Open a popup window']")).click();
		Thread.sleep(2000);
		
		 Set<String> allHandles = driver.getWindowHandles();
		 
		 for (String wh : allHandles )
		 {
			 if (!parentAddr.equals(wh)) 
			 {
			TargetLocator switchTo =driver.switchTo();
			Thread.sleep(2000);
			switchTo.window(wh).close();
			 }
		 }
	}
}	
			
			
		 
	



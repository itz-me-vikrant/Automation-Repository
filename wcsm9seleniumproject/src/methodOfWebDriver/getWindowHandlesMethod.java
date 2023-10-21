package methodOfWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
	   Thread.sleep(2000);
	   String parentHandle = driver.getWindowHandle();
	   System.out.println("Address of parent browser or window"+ parentHandle);
	   Thread.sleep(2000);
	   driver.findElement(By.partialLinkText("Open a popup window")).click();
	   Set<String> allHandles = driver.getWindowHandles();
	   for (String wh :allHandles)
	   {
		   if (parentHandle.equals(wh))
		   {
			   System.out.println("address of child window : "+wh);
		   }
		   else 
		   {
			  System.out.println("address of parent window : "+wh); 
		   }
	   }	
   }

}

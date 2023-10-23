package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect_ {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com");
		//Identify email text box
		WebElement emailTB = driver.findElement(By.cssSelector("input#email"));
		Point loc = emailTB.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("Location of email textBox : "+xaxis+" : "+yaxis);
		//Get the size of email text Box
		Dimension size = emailTB.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(emailTB.getCssValue("height")+" "+emailTB.getCssValue("width"));
		Rectangle rect = emailTB.getRect();
		System.out.println(rect.getX()+" : "+rect.getY());
		System.out.println(rect.getHeight()+" : "+rect.getWidth());
	}

}

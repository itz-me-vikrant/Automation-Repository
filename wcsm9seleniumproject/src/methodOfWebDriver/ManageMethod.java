package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//============== maximize the browser ====================
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//===============fullscreen of the browser=================
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		//=============== minimize the browser ====================
		//driver.manage().window().minimize();
		//=============== setSize  of the browser ===================
		Dimension targetSize = new Dimension(350,450);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);
		//============== set position of the browser  =================
		Point targetPosition = new Point(450,250);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}

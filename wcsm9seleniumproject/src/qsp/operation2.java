package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class operation2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		System.out.println("Edge browser is open");
		
		driver.manage().window().maximize();
		System.out.println("edge browser is maximize");
		
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Edge browser is close");

	}

}

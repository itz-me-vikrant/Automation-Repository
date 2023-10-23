package assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Browser value");
		String browserName= sc.next();
		System.out.println(sc);
		driver.get("https://www.amazon.in");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();	
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else {
			System.out.println("Enter Valid browser name");
		}
	}

}

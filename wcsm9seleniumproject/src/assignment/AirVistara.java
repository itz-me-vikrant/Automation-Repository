package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {

	public static void main(String[] args) throws InterruptedException {
		
		
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("flightSearchFrom")).sendKeys("PNQ");
		Thread.sleep(2000);

		driver.findElement(By.name("flightSearchTo")).sendKeys("BOM");
		Thread.sleep(2000);

		driver.findElement(By.id("departCalendar")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[data-date='22']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[data-date='25']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("passangers")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[value*='business']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("book-flight-widget")).click();

	}

}

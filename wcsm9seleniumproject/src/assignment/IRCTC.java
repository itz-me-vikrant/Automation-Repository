package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
	// to close/to handle the popup notification
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
		
	WebDriver driver=new ChromeDriver(co);//launch chrome 
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(1000);
	
	//from
	driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("PUNE");
	Thread.sleep(1000);
	
	//to
	driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("ET");
	Thread.sleep(1000);
	
	//date box
	driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
	Thread.sleep(1000);
	
	//date 25/09/23 
	driver.findElement(By.xpath("//a[text()='27']")).click();
	Thread.sleep(1000);
	
	//all classes
	driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
	Thread.sleep(1000);
	
	//ac 1st class
	driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
	Thread.sleep(1000);
	
	//category
	driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text()='LOWER BERTH/SR.CITIZEN']")).click();//sr.citizen
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text()='OK']")).click();//click ok
	Thread.sleep(1000);
	
	//search
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
}

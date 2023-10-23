package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com");
	
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	 WebElement phoneDropdown = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
	
	//get all the option present inside phone no dropdown
	 Select sel1 = new Select(phoneDropdown);
	 List<WebElement> allops = sel1.getOptions();
	 
	 //we read list by using for loop 
	 for(int i=0;i<=allops.size();i++)
	 {
		 String opt = allops.get(i).getText();
		 Thread.sleep(3000);
		 System.out.println(opt);
	 } 
	 //we read list by using for Each loop
	 for(WebElement op:allops)
	 {
		 String opt1 = op.getText();
		 Thread.sleep(3000);
		 System.out.println(opt1);
	 }	
	}
}

package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shrikant/Desktop/html_Basics/Multiple%20Dropdown.html");
		//multiselect dropdown
		 WebElement menuDropdown = driver.findElement(By.id("iddd"));
		 Select sel = new Select(menuDropdown);		 
		 for(int i=0;i<4;i++)
		 {
			 Thread.sleep(3000);
			 sel.selectByIndex(i);
		 }
		 //read the selected options from menu
		  List<WebElement> allopts = sel.getAllSelectedOptions();	 
		 //Read the list by using for loop
		 for(int i=0;i<allopts.size();i++)
		 {
			 String op = allopts.get(i).getText();
			 Thread.sleep(3000);
			 System.out.println(op);
		 }	 
		 //Read the list by using for each loop
//		 for(WebElement opts:allopts)
//		 {
//		    String op = opts.getText();
//		    Thread.sleep(3000);
//			 System.out.println(op);
//		 }
	}
}

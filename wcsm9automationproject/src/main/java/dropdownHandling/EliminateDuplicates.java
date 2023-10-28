package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shrikant/Desktop/html_Basics/Single%20select%20Dropdown.html");
		//identify dropdown and find element
		WebElement menuDropdown = driver.findElement(By.id("iddd"));
		//get all option of menuDropdown
		Select sel = new Select(menuDropdown);
		List<WebElement> allops = sel.getAllSelectedOptions();
		//to eliminate duplicate we use hashset
		HashSet<String> hs = new HashSet<String>();
		
		//read the list by using for ;loop
		for(int i=0;i<allops.size();i++)
		{
			WebElement op = allops.get(i);
			String dropdownOption = op.getText();
			hs.add(dropdownOption);
		}
		Thread.sleep(3000);
		for(String opt:hs)
		{
			System.out.println(opt);
		}	
	}
}

package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shrikant/Desktop/html_Basics/Single%20select%20Dropdown.html");
		
		//singleselect dropdown
		 WebElement dropdown1 = driver.findElement(By.id("iddd"));
		 
		 //handle dropdown
		 Select sel = new Select(dropdown1);
		 Thread.sleep(3000);
		 sel.selectByValue("v5");
		 Thread.sleep(3000);
		 
		 //get the option which is selected first
		  WebElement firstoption = sel.getFirstSelectedOption();
		  System.out.println(firstoption.getText());
		  
		  driver.navigate().to("file:///C:/Users/Shrikant/Desktop/html_Basics/Multiple%20Dropdown.html");
		  WebElement dropdown2 = driver.findElement(By.id("iddd"));
		  
		  // handle multiselect dropdown 
		  Select sel2 = new Select(dropdown2);
		  //select multiple option from multi select dropdown
		  for(int i=5;i<6;i++)
		  {
			  Thread.sleep(3000);
				 sel2.selectByIndex(i);
		  }
		  //getoption which is selected first
		  Thread.sleep(3000);
		  System.out.println(sel2.getFirstSelectedOption().getText());
	
	}

}

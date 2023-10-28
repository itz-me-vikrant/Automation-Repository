package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shrikant/Desktop/html_Basics/Multiple%20Dropdown.html");
		
		//single select dropdown
		WebElement dropdown1 = driver.findElement(By.id("iddd"));
		
		//Handle Dropdown
		Select sel = new Select(dropdown1);
		
		//get all option by using GetWrapped element
		 WebElement allOpts = sel.getWrappedElement();
		 System.out.println(allOpts.getText());
		 
		// Get all option by using Get options
		  List<WebElement> Options = sel.getOptions();
		 
		// Get all option by using without selection 
		  for(WebElement opt:Options)
		  {
			  Thread.sleep(3000);
			  if(opt.getText().equals("Vadapav"))
			  {
				  opt.click();
				  break;
			  }
		  }
			  
	}

}

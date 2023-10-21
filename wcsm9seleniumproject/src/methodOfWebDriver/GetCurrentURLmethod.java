package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://lenovo/login.do;jsessionid=1die48hc4mbst");
		
	  String urlOfLoginPage= driver.getCurrentUrl();
	  System.out.println(urlOfLoginPage);
	  Thread.sleep(2000);
	  
	  
		
	}

}

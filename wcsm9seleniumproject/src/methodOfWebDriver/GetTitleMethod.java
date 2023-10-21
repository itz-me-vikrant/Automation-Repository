package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://lenovo/login.do;jsessionid=s2av0g3vbrj");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());		//actiTIME - Login
		driver.close();
	}

}

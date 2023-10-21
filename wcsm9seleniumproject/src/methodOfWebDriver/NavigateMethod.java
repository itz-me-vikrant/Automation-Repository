package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	//To launch web application with the help of navigate method
	Navigation nav = driver.navigate();
	nav.to("https://www.selenium.dev");
	
	//to perform backward operation
	nav.back();
	
	Thread.sleep(2000);
	
	//to perform forward operation
	nav.forward();
	
	Thread.sleep(2000);
	
	////to perform refresh operation
	nav.refresh();
	
	Thread.sleep(2000);
	
	driver.quit();

	}

}

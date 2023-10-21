package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://lenovo/login.do;jsessionid=1die48hc4mbst");
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
		Thread.sleep(2000);
		driver.quit();
	}

}

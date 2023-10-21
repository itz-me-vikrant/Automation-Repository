package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayoo.blogspot.com");
		Thread.sleep(2000);
		String parentHandle =driver.getWindowHandle();
		System.out.println(parentHandle);		//C3864F54D1A08E641B1A64F911837CFA
		driver.quit();
	}

}

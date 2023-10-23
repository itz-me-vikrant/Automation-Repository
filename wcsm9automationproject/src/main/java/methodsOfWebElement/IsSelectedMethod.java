package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://lenovo/login.do");
		//identify checkbox for verify
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(3000);
		boolean status = checkBox.isSelected();
		System.out.println("is checkbox is selected ? : "+status);
    	checkBox.click();
		Thread.sleep(3000);
		System.out.println("is checkbox is selected ? : "+status);
		

	}

}

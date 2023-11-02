package popupPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoAlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("alert1")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		String textOfAlert = al.getText();
		Thread.sleep(3000);
		System.out.println(textOfAlert);
		Thread.sleep(3000);
		al.accept();
		
	}

}

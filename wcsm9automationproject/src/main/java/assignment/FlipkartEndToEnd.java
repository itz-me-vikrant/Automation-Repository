package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartEndToEnd {

public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit

driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//span[@role='button']")).click();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone");
driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

WebDriverWait Wait= new WebDriverWait(driver,Duration.ofSeconds(30));//explicit

String ParentAddress = driver.getWindowHandle();

driver.findElement(By.xpath("(//img[@class='_396cs4'])[2]")).click();
Set<String> AllAddress = driver.getWindowHandles();

for(String wh:AllAddress)
{
if(!ParentAddress.equals(wh))
{
driver.switchTo().window(wh);
}
}

driver.findElement(By.xpath("//li[@class='_3V2wfe' and (@id='swatch-0-color')]")).click();

driver.findElement(By.xpath("//input[@id='pincodeInputId']")).clear();
driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411039");
driver.findElement(By.xpath("//span[text()='Check']")).click();

driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

driver.findElement(By.xpath("//div[@class='_3dsJAO' and (text()='Remove')]")).click();
//driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']"))).click();
}

} 
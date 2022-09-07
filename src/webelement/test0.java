package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("admin");
		
		WebElement ele1=driver.findElement(By.id("password"));
		ele.sendKeys("manager123");
		
		driver.findElement(By.xpath("//button[@type='submit'][2]")).submit();
		Thread.sleep(3000);
		ele.clear();
		ele1.clear();

	}

}

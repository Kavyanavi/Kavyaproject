package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("admin");
		user.clear();
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.close();
		
	}
}

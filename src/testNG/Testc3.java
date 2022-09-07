package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testc3 {

	WebDriver driver;

	@BeforeMethod
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mail.agarwalpackers.in/Login.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testc3()
	{
		driver.findElement(By.xpath("//a[text()='mobile interface']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}


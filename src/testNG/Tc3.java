package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc3 {
		
		public WebDriver driver;
		
		@BeforeMethod
		public void openApp()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://app.collegeboxes.com/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		}

		@Test
		public void tc3()
		{
			driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
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

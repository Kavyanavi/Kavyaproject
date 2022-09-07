package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {

	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		SoftAssert a=new SoftAssert();
		a.assertEquals(title, "Google");
		a.assertEquals(url, "https://www.google.com/");
		a.assertAll();
		
		Reporter.log(title,true);
		System.out.println(url);
		
		driver.close();
		
	}
}

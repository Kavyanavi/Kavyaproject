package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//got output
public class HousingLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.collegeboxes.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("passwordOne")).sendKeys("hi54522");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Summer Storage, Summer Shipping - Collegeboxes"))
		{
			System.out.println("Pass:-Login page should be displayed");
		}
		else
		{
			System.out.println("Fail:-Login page should not be displayes");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}

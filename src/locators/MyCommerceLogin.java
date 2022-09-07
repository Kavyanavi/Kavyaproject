package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//got output
public class MyCommerceLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://account.mycommerce.com/cp/Login");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("57554");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("MyCommerce - Login")) //recomended to use compulsory have to write in interview
		{
			System.out.println("Pass :- LOgin page should be displayed");
		}
		else
		{
			System.out.println("Fail :- Login page should not be displayed");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}

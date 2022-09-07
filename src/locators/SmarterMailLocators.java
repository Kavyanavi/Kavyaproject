package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//got output
public class SmarterMailLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://mail.agarwalpackers.in/Login.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("ctl00$MPH$txtUserName")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager12");
		driver.findElement(By.id("btnLogin")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("SmarterMail"))
		{
			System.out.println("PASS :-Login page");
		}
		else
		{
			System.out.println("FAIL:-blank page");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}

}

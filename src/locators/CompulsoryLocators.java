package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  //output is fail bcs I entered wrong name and pwd


//100% question in interview

//got output
public class CompulsoryLocators {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("srikavya431@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("kavyasrinkavya@5775");
		
		driver.findElement(By.name("login")).click();
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals("Facebook � log in or sign up"))
		{
			System.out.println("pass:home page");
		}
		else
		{
			System.out.println("fail:not home page");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}

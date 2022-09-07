package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//it is giving error bcs its not show any exception
//example for implicit wait
public class FlipkartSync {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //if we get exception for that only we have to apply this line
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}

	}

}

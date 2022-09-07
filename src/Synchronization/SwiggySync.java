package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//example for implicit wait
//it shows error bcs its not showing error of exception
public class SwiggySync {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("mobile")).sendKeys("9743332440");
		driver.findElement(By.id("name")).sendKeys("Kavya");
		driver.findElement(By.id("email")).sendKeys("kaviaf@5775");
		driver.findElement(By.id("password")).sendKeys("admin123");
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Order food online from India's best food delivery service. Order from restaurants near you"))
		{
			System.out.println("PASS:Login page");
		}
		else
		{
			System.out.println("FAIL:No Login Page");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		

	}




	}

}

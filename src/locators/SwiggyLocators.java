package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//got output
public class SwiggyLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("mobile")).sendKeys("9786543210");
		driver.findElement(By.id("name")).sendKeys("Kavya");
		driver.findElement(By.id("email")).sendKeys("kaviaf@5775");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		
		
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

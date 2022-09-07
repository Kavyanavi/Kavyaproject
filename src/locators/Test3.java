package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//css selector usage
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kavaf");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
		
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}

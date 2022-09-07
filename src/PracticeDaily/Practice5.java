package PracticeDaily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Srikavya431@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("kavyasrinkavya@5775");
		driver.findElement(By.name("login")).click();
	}
}

package PracticeDaily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //copy paste the url from website
		
		driver.findElement(By.name("email")).sendKeys("Kavya S"); //right click on the facebook username and select inspect
		
		driver.findElement(By.name("pass")).sendKeys("kavyasrinkavya@5775"); //right click on password of facebook and select inspect
		
		driver.findElement(By.name("loging")).click(); //just click on login of facebook

	}

}

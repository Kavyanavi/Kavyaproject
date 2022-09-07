package PracticeDaily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://compiler.skillrary.com/");
		Thread.sleep(3000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().to("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
}

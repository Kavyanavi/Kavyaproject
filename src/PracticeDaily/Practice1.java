package PracticeDaily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");
		driver.navigate().to("https://translate.google.com/"); //used to open the other application
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		driver.close();
	}

}

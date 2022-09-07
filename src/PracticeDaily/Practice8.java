package PracticeDaily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice8 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//how to use css selector
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kavkdfj");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("kdfdk2164");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}

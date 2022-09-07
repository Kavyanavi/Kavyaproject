package PracticeDaily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.linkText("Forgot your password?")).click(); //how to use linktext
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Return")).click(); //this is how to use partial linktext
	}

}

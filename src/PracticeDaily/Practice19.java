package PracticeDaily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice19 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(sign).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("userName")).sendKeys("9743332440");
		driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@style='color: #cdcece;']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("keyword")).sendKeys("Phone");
		
	}

}

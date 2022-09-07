package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		 WebElement book = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
		 WebElement rightclick = driver.findElement(By.xpath("//a[text()='Sell']"));
		 
		 Actions a=new Actions(driver);
		 a.moveToElement(book).perform(); //mousehover
		 a.contextClick(rightclick).perform(); //rightclick
		 a.doubleClick(book).perform();
		 
		
		 driver.close();
		 
		 
	}
}

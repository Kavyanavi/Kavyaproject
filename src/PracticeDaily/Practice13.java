package PracticeDaily;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice13 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(search);
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("search-alias=stripbooks-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Computers");
		Thread.sleep(3000);
		
		List<WebElement> alloption = s.getOptions();
		
		System.out.println(alloption.size());
		
		for(WebElement b:alloption)
		{
			System.out.println(b.getText());
		}
		
		driver.close();

	}

}

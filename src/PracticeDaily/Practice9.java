package PracticeDaily;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//autosuggestion
public class Practice9 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 WebElement search = driver.findElement(By.name("q"));
				search.sendKeys("selenium");
		
		List<WebElement> alloptions = driver.findElements(By.xpath("(//li[@class='sbct'])"));
		System.out.println(alloptions.size());
		
		for(WebElement b:alloptions)
		{
			System.out.println(b.getText());
		}
		driver.close();

	}

}

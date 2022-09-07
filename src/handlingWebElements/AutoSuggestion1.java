package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//not getting output
public class AutoSuggestion1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("seleni");
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(autosuggestion.size());
		
		for(WebElement b:autosuggestion)
		{
			System.out.println(b.getText());
		}
		driver.close();
		
	}

}

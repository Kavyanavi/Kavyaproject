package chapter2practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("seleni");
		
		List<WebElement> auto = driver.findElements(By.xpath("//li[@class='sbct213456']"));
		System.out.println(auto.size());
		
		for(WebElement b:auto) {
			System.out.println(b.getText());
		}
		driver.close();
		
		
	}

}

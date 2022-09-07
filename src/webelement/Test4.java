package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox=driver.findElement(By.name("q"));
		Dimension s = searchbox.getSize();
		int h=s.getHeight();
		System.out.println("height=" + h);
		
		int w=s.getWidth();
		System.out.println("wight=" + w);
		
		driver.close();
		
		

	}

}

package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox=driver.findElement(By.name("q"));
		Point loc=searchbox.getLocation();
		int x=loc.getX();
		System.out.println(x + "x coordinates");
		
		int y=loc.getY();
		System.out.println(y + "y cordinates");
		
		driver.close();
				
		

	}

}

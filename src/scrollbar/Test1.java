package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement drug = driver.findElement(By.xpath("//img[@alt='Amazon Basics 2 Ply Paper Towel - Flex-Sheets - 12 Value Rolls (Previously Solimo)']"));
		
		Point loc=drug.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");//used to concatinating the values
		
		Thread.sleep(5000);
		drug.click();
	}

}

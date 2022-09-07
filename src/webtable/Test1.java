package webtable;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		List<WebElement> eles = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(WebElement b:eles) {
			System.out.println(b.getText());
		}
		driver.close();
		
	}
}

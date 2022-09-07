package dropdownpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotestMultiple {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dd);
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby-products-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Computers");
		Thread.sleep(3000);
		
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("not a multiple");
		}
		driver.close();
	}

}

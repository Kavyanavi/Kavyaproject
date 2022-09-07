package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("cars"));
		
		Select s=new Select(dd);
		s.selectByIndex(2);
		s.selectByValue("category.php?category=testing");
		s.selectByVisibleText("Select category");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not a multiple select dropdown");
		}
		
		driver.close();
	}

}

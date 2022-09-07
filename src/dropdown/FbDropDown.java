		package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//got the ouput
public class FbDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		dropdown.click();
		
		WebElement dd = driver.findElement(By.id("month"));
		
		Select s=new Select(dd);
		
		Thread.sleep(3000);
		s.selectByIndex(6);
		Thread.sleep(3000);
		s.selectByValue("1");
		Thread.sleep(3000);
		s.selectByVisibleText("Aug");
		Thread.sleep(3000);
		
		List<WebElement> alloptions = s.getOptions();
		
		System.out.println(alloptions.size());
		
		for(WebElement b:alloptions)
		{
			System.out.println(b.getText());
		}
		
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectAll(); //if the options are deselect then it is a multiple select dropdown
		}
		else
		{
			System.out.println("it is not a multiselect dropdown");
		}
		
	}

}

package PracticeDaily;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//got the output
public class Practice14 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		search.click();
		
		WebElement mon = driver.findElement(By.id("month"));
		Select s=new Select(mon);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("Aug");
		
		List<WebElement> alloption = s.getOptions();
		System.out.println(alloption.size());
		
		for(WebElement b:alloption)
		{
			System.out.println(b.getText());
		}
		
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("false:not a multiple select");
		}
		driver.close();
	}

}

package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//got the ouput
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.name("addresstype"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("category.php?category=testing");
		Thread.sleep(3000);
		s.selectByVisibleText("Select category");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByValue("category.php?category=testing");
		Thread.sleep(3000);
		s.deselectByVisibleText("Select category");
		
		driver.close();
		
		
	}

}

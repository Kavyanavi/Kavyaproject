package dropdownpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//got the output
public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.name("addresstype"));
		
		Select s=new Select(dd);
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("category.php?category=testing");
		Thread.sleep(3000);
		s.selectByVisibleText("Select category");
	}

}

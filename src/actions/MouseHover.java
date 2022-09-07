package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//got the output
public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement women = driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]")); //right click on women and inspect
		
		Actions a=new Actions(driver);
		a.moveToElement(women).perform(); //used to move the cursor to women and click on it
		
		
		
	}

}

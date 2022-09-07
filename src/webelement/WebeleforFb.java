package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Example for Web Element Actions
public class WebeleforFb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicitly wait
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("Kavya"); //using sendKeys actions
		
		WebElement ele1=driver.findElement(By.id("pass"));
		ele1.sendKeys("manager");
		
		Thread.sleep(3000);
		ele.clear(); //using clear actions and used to clear the entered field
		
		//we can use click in general if interviewer asks for submit then first u should check whether the submit is present or not
		
		WebElement ele3 = driver.findElement(By.xpath("//button[@type='submit']"));
		ele3.submit(); //using submit action
		
		//WebElement ele2 = driver.findElement(By.name("login")); 
		//ele2.click(); //using click action
		
		
		
	}

}

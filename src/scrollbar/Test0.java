

package scrollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Typecasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll from top to bottom
		js.executeScript("window.scrollBy(0,5000)"); //window means browser
		
		Thread.sleep(3000);
		
		//scroll from bottom to top
		js.executeScript("window.scrollBy(0,-5000)");
		

	}

}

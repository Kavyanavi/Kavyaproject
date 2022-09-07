package frame;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Test2 {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://skillrary.com/core-java-for-selenium-training");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
			
			driver.switchTo().frame(0);
			
	 driver.findElement(By.xpath("//div[@class='play-icon']")).click();
	 Thread.sleep(3000);
	 driver.close();
		}

	}


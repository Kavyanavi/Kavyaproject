package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//got the output
public class Test1 {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File RAM=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./photo/flipkart.png");
		
		FileUtils.copyFile(RAM, dest);
		
		driver.close();
		

	}

}

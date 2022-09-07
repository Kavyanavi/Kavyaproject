package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		
	}

}

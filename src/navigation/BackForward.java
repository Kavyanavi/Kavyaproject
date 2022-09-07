package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForward 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox"); //used to move from youtube to mail application
		 Thread.sleep(3000);  //used to wait for 3 seconds
		 
		 //go back
		 driver.navigate().back();
		 Thread.sleep(3000);//used to wait for 3 seconds bcs it is very fast for that reason 
		 
		 driver.navigate().forward(); //go forward
		 Thread.sleep(3000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(3000);
	}
}

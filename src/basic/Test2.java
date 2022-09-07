package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();  //upcasting
		driver.get("https://mail.google.com/mail/u/0/#inbox"); //used to enter the url
		System.out.println(driver.getTitle()); //used to get the title from the application
		System.out.println(driver.getCurrentUrl()); //used to get the url from the application
		//Thread.sleep(-3000); Illegal argument exception
		driver.close(); //used to close the application automatically
	}

}

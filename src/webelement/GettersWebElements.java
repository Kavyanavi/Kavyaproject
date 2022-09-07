package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Example for getters text(),size()
public class GettersWebElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//getText()
		WebElement connect = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		System.out.println(connect.getText());
		
		//getAttribute()
		WebElement search = driver.findElement(By.id("email"));
		String str = search.getAttribute("type");
		System.out.println(str);
		
		//getSize()
		Dimension s = connect.getSize();  //TO display size of the text
		int height = s.getHeight();  //height of the text
		System.out.println("height=" + height);
		int width=s.getWidth();  //width of the text
		System.out.println("width=" + width);
		
		//getLocation()
		
		
		
		driver.close();
	}

}

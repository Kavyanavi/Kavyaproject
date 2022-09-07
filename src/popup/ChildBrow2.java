package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrow2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		
	
		
		
	}

}

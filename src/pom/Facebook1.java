package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//object is created for Facebook1 in main method
//got the output
public class Facebook1 
{
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement pwdtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public  Facebook1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void email(String e)
	{
		emailtb.sendKeys(e);
	}
	public void pwd(String p)
	{
		pwdtb.sendKeys(p);
	}
	public void login()
	{
		loginbtn.click();
	}
	
}

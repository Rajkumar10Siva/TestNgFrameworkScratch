package POMframework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	//username, password, login btn
	
	
//	@FindBy(how=How.NAME,using="username") or 
	
	@FindBy(name="email")
	public static WebElement username;
	
	
	@FindBy(name="password")
	public static WebElement password;
	
	
	@FindBy(xpath="//*[@type='submit']")
	public static WebElement login;

	
	
	
/*	static public WebElement username(WebDriver d)
	{
		return d.findElement(By.name("email"));	
	}
	
	
	static public WebElement password(WebDriver d)
	{
		return d.findElement(By.name("password"));
		
	}
	
	
	static public WebElement login(WebDriver d)
	{
		
		return d.findElement(By.xpath("//*[@type='submit']"));
		
	}*/
	
	

	
	

}

package POMframework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfilePageObjects {
	
	
	
	
	
	@FindBy(xpath="//*[@id='fadein']/div[4]/div/div[3]/ul/li[4]/a")
	public static WebElement profile;
	
	
	@FindBy(name="firstname")
	public	 static WebElement fname;
	
	@FindBy(name="lastname")
	public static WebElement lname;

	
	//username,password,login,profile,fname,lname
	
/*	 public static WebElement username(WebDriver d)
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
	}
	
	 static public WebElement profile(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[3]/ul/li[4]/a"));
	}
	
	 static public WebElement fname(WebDriver d)
	{
		return d.findElement(By.name("firstname"));
	}
	
	 static public WebElement lname(WebDriver d)
	{
		return d.findElement(By.name("lastname"));
	}  */

}

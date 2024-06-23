package POMletcode2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.remote.RemoteWebElement;


public class PomframeworkloginObjects {
	
	
	
	/*public static WebElement login1(WebDriver driver)
	{
		return driver.findElement(By.linkText("Log in"));
	}
	
	
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("email"));
		
	}
	
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
		
	}
	
	
	
	public static WebElement login2(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[@class='button is-primary']"));	
	}
	
	
	public static WebElement workspace(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(7000);
		return driver.findElement(By.xpath("//a[@id='testing']"));
	}
	
	
	public static WebElement input(WebDriver driver)
	{
		return driver.findElement(By.linkText("Edit"));
	}
	
	public static WebElement fullname(WebDriver driver)
	{
		return driver.findElement(By.id("fullName"));
		
	}
	
	public static WebElement signout(WebDriver driver)
	{
		return driver.findElement(By.linkText("Sign out"));
	}
	*/
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath
	 
	 
	 
	 @FindBy(linkText="Log in")//findelement ilama epdi elements locate pani find anrathu, ayhuku tha inthe example
	 public static WebElement login1;
	 
	 
	 @FindBy(name="email")//Pagefactory nu onu pakaporom athula find element use panamatom so athuku tha Findby use pani element locate panrom
	 public static WebElement username;
	 
	 
	 @FindBy(name="password")//Page factory na ena, athoda syntax login class la syntax ezuthi irupom
	 public static WebElement password;
	 
	 
	 
	 @FindBy(xpath="//button[@class='button is-primary']")
	 public static WebElement login2;
	 
	 
	 
	 @FindBy(xpath="//a[@id='testing']")
	 public static WebElement workspace;
	 
	 
	 
	 @FindBy(linkText="Edit")
	 public static WebElement input;
	 
	 
	 
	 @FindBy(id="fullName")
	 public static WebElement fullname;
	 
	 
	 
	 @FindBy(linkText="Sign out")
	 public static WebElement signout;


}

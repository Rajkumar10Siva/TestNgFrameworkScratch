package POMframework2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetcodelogObjects {
	
	
	
	@FindBy(linkText= "Log in")
	public static WebElement signin;
	
	@FindBy(name="email")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")
	public static WebElement login;

	
	
	
	
	
	
	
	
	
	
	

}

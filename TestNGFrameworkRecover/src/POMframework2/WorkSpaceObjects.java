package POMframework2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkSpaceObjects {
	
	
	@FindBy(linkText="Work-Space")
	public static WebElement workspace;
	
	@FindBy(linkText ="Edit")
	public static WebElement inputEdit;
	
	@FindBy(id="fullName")
	public static WebElement fullname;


}

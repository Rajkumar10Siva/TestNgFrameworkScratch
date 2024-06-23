package PomFramework1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMframework2.LetcodelogObjects;
import POMframework2.WorkSpaceObjects;

public class Letcodelogin {
	
	

	
	@Test
	public void letcode() throws InterruptedException
	{
	
	// Launch Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	System.out.println("Chrome opened successfully");
	//Open Amazon Web page
	d.get("https://letcode.in/");
	//Implicit wait
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Maximize the page
	d.manage().window().maximize();
	
	
	
	
	PageFactory.initElements(d, LetcodelogObjects.class);
	
	LetcodelogObjects.signin.click();
	LetcodelogObjects.username.sendKeys("rkchella17@gmail.com");
	LetcodelogObjects.password.sendKeys("Anjali@143");
	LetcodelogObjects.login.click();
	
	Thread.sleep(7000);
	
	PageFactory.initElements(d,WorkSpaceObjects.class);
	WorkSpaceObjects.workspace.click();
	WorkSpaceObjects.inputEdit.click();
	WorkSpaceObjects.fullname.sendKeys("Rajkumar");
	
	Thread.sleep(5000);

	
	
	
	
	d.quit();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

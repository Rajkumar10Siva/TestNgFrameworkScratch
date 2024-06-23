package POMletcode1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POMletcode2.PomframeworkloginObjects;

public class Pomframeworklogin {
	
	

	@Test
	public void logintest() throws InterruptedException 
	{
	
		//Launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		
		//go to the particular website
		driver.get("https://letcode.in/");
		
		
		//import statement for giving command to webdriver to wait for agiven time to find the element
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		

		
		
		
		//maximize the browser
		driver.manage().window().maximize();
		
		
		
		
		
		/*	PomframeworkloginObjects pom = new PomframeworkFindelements();

		//1. Select login
		PomframeworkloginObjects.login1(driver).click();

		//2. Select email and enter email
		PomframeworkloginObjects.username(driver).sendKeys("rkchella17@gmail.com");

		//3.Select password and enter password
		PomframeworkloginObjects.password(driver).sendKeys("Anjali@143");

		//4. click login
		PomframeworkloginObjects.login2(driver).click();

		//5. Select workspace
		PomframeworkloginObjects.workspace(driver).click();

		//6. Select input
		PomframeworkloginObjects.input(driver).click();

		//7. Enter firstname
		PomframeworkloginObjects.fullname(driver).sendKeys("Rajkumar");

		//8. Select logout
		PomframeworkloginObjects.signout(driver).click();
		*/
		
		
		

		
		
		//Using PageFactory - athula driver and classname.class pass pananum
		PageFactory.initElements(driver, PomframeworkloginObjects.class);
		
		//1. Select login
		PomframeworkloginObjects.login1.click();
		
		//2. Select email and enter email
		PomframeworkloginObjects.username.sendKeys("rkchella17@gmail.com");
				
		//3.Select password and enter password
		PomframeworkloginObjects.password.sendKeys("Anjali@143");
				
		//4. click login
		PomframeworkloginObjects.login2.click();
	
		Thread.sleep(10000);
		
		//5. Select workspace
		PomframeworkloginObjects.workspace.click();
				
		//6. Select input
		PomframeworkloginObjects.input.click();
				
		//7. Enter firstname
		PomframeworkloginObjects.fullname.sendKeys("Rajkumar");
				
		//8. Select logout
		PomframeworkloginObjects.signout.click();
		
		
		System.out.println("Our program test case passed");
		
		Thread.sleep(10000);
		
		
		driver.quit();
		
		
	}
}

















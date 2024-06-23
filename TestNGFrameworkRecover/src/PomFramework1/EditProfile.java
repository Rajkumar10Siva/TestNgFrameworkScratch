package PomFramework1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMframework2.EditProfilePageObjects;
import POMframework2.LoginPageObjects;

public class EditProfile {
	
	
	@Test
	public void login() throws InterruptedException
	{
		
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		System.out.println("Chrome opened successfully");
		//Open Amazon Web page
		d.get("https://phptravels.net/login");
		//Implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Maximize the page
		d.manage().window().maximize();
		
		
	//	EditProfilePageObjects editProfilePageObjects = new EditProfilePageObjects();
		
	//	EditProfilePageObjects.username(d).sendKeys("user@phptravels.com");
	//	EditProfilePageObjects.password(d).sendKeys("demouser");
	//	EditProfilePageObjects.login(d).click();
		//Belows is the updatede code for the above 3 elements
		
		PageFactory.initElements(d,LoginPageObjects.class);

		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.login.click();
		
		
		
		PageFactory.initElements(d,EditProfilePageObjects.class);

		
		
		EditProfilePageObjects.profile.click();
		EditProfilePageObjects.fname.sendKeys("Raj");
		EditProfilePageObjects.lname.sendKeys("Kumar");
		
		
		/*//Enter Username
		
		WebElement username = d.findElement(By.name("email"));
		user.sendKeys("user@phptravels.com");
		
		
		//Enter Password
		
		WebElement password = d.findElement(By.name("password"));
		pass.sendKeys("demouser");
		
		Thread.sleep(5000);
		
		//Click sign in
		WebElement login = d.findElement(By.xpath("//*[@type='submit']"));
		login.click();
		
		//Click Profile
		WebElement pro = d.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[3]/ul/li[4]/a"));
		pro.click();
		
		//Edit or type Firstname
		WebElement fname = d.findElement(By.name("firstname"));
		fname.clear();
		fname.sendKeys("Raj");
		
		
		//Edit or type lastname
		WebElement lname = d.findElement(By.name("lastname"));
		lname.clear();
		lname.sendKeys("Kumar");*/
		
		
		
Thread.sleep(3000);
		
System.out.println("Log in successfully");

System.out.println("Operation performed");

		
d.quit();
	}
}

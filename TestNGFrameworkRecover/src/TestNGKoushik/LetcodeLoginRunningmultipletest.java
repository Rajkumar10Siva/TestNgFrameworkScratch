package TestNGKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LetcodeLoginRunningmultipletest {
	
	
	//Login test for letcode account and instagram accout.
	
	@Test
	public void Letcodelogin() throws Throwable
	{
		// Launch Browser
		ChromeDriver d= new ChromeDriver();
		
		//Open Amazon Web page
		d.get("https://letcode.in/");
		
		//Maximize the page
		d.manage().window().maximize();
		
		//Select login
		WebElement log=d.findElement(By.linkText("Log in"));
		log.click();
		
		//find the email element and passing the values
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys("rkchella17@gmail.com");
		
		//find the pass element and passing the values
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("Anjali@143");
		
		Thread.sleep(5000);
		
		//webdriver will sleep for 5 seconds and net perform ant action fot this 5 seconds.
		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));

		//click the log in button
		login.click();
		
		//close the browser
		d.quit();
		
	}

}

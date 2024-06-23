package Dataprovider2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Dataprovider3.ExampleIndices;

public class Example1 extends ExampleIndices{
	
	

	
	
	
	@Test(dataProvider="logintest", dataProviderClass = Dataprovider3.ExampleIndices.class)//Dataprovider name inga attribute la pass pananum
	public void logintest(String emailID, String password) throws InterruptedException
	{
	
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);
		System.out.println("Chrome opened successfully");
		
		//Open letcode website 
		d.get("https://letcode.in/");
		
		//Implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Maximize the page
		d.manage().window().maximize();
		
		//click login
		WebElement log=d.findElement(By.linkText("Log in"));
		log.click();

		//enter email
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys(emailID);

		//Entering password
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys(password);
	
		//wait for few seconds
		Thread.sleep(5000);
	
		//click login
		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
		login.click();
	
	
		//Getting current url and printing
		String currentURL=d.getCurrentUrl();
		System.out.println("Current URL is :" +currentURL);
	
	
		//Close the browser
		d.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

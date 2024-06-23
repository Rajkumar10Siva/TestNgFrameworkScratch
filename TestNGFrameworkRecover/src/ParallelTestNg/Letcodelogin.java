package ParallelTestNg;



//Testng tutorial =2.1

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Letcodelogin {
	
	//intha package la multiple classes a epdi orae time la multiple time epdi orade browser la run panrathu at same time la
	//created two classes letcode log in and insta login
	//xml file la we have to change parallel mode la - classes select pananum
	//xml file la Thread count = 5 is default, that means 5 classes varaikum namma parallel a run panikalam, namma project la 2 classes the iruku so no problem, suppose 7 classes iruntha first 5 execute agitu remaining two next execute agum
	//Thread count la kodutha namma project la 2 class run pana porom so ipdi kodutha one by one a run agum, oru class test run agi mudinja piragu inonu run agum.
		
		@Test
		public void Letcodelogin1() throws InterruptedException
		{
			//Launch Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			System.out.println("Chrome opened successfully");
			
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
			//WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
			//login.click();

			d.quit();
			
		}
	}
	



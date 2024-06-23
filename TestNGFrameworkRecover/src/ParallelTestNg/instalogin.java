package ParallelTestNg;




//Testng tutorial =2




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class instalogin {
	
	//intha package la multiple classes a epdi orae time la multiple time epdi orade browser la run panrathu at same time la
		//created two classes letcode log in and insta login
		//xml file la we have to change parallel mode la - classes select pananum
		//xml file la Thread count = 5 is default, that means 5 classes varaikum namma parallel a run panikalam, namma project la 2 classes the iruku so no problem, suppose 7 classes iruntha first 5 execute agitu remaining two next execute agum
		//Thread count la kodutha namma project la 2 class run pana porom so ipdi kodutha parallel a run agum.

	
	@Test
	public void Instalogin() throws Throwable
	{
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		System.out.println("Chrome opened successfully");
		
		
		//Open Amazon Web page
		d.get("https://www.instagram.com/");
		
		
		//Webdriver will wait some time period to find the webelement.
		//It affects the Find element and Find elements method.
		//it is one time declaration
		//it will works and wait before finding the element.
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		//Maximize the page
		d.manage().window().maximize();
		
		
		//Select email
		WebElement user=d.findElement(By.name("username"));
		user.sendKeys("thoppul_azhagigal");
		
		//select pass
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("vijay_vj");
		
		////webdriver will sleep for 5 seconds and net perform ant action fot this 5 seconds.
		Thread.sleep(5000);
		System.out.println("");
		
		//select login
		WebElement login = d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		login.click();
		System.out.println("Login successfully");
		
//		WebElement notnow= d.findElement(By.xpath("//div[@class=\"_ac8f\"]/button"));
//		notnow.click();
//
//		//toget the current page URL
//		String currentURL=d.getCurrentUrl();
//		System.out.println("CurrentURL is :"+currentURL );
		
		//close all the browsers and all active web driver instance
		d.quit();
	}

}

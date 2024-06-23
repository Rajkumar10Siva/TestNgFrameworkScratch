package TestNGKoushik;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstagramLoginRunningMultipleTest {
	
	//Project Two class create pananum - done
		//Two class la log in coding different apps ku write pani irukom
		//oru package la iruka multiple class run pananum using xml file 
		//method ku name - running multiple classes test using testNG
		
		
		
		//How to run Multiple Classes?
		//Select the classes and right click>testNG>Convert to TestNG>Gice xml name
		
		
		
		
		
		
		
		
		
		
		
		@Test
		public void Instalogin() throws Throwable
		{
			// Launch Browser
			ChromeDriver d= new ChromeDriver();
			System.out.println("Chrome opened successfully");
			
			
			//Open Amazon Web page
			d.get("https://www.instagram.com/");
			
			
			//[Webdriver will wait some time period to find the webelement.
			//It affects the Find element and Find elements method.
			//it is one time declaration
			//it will works and wait before finding the element.]
			
			//Implicit wait
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
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
			
			
			//select login
			WebElement login = d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
			login.click();
			System.out.println("Login successfully");
			
			WebElement notnow= d.findElement(By.xpath("//div[@class=\"_ac8f\"]/button"));
			notnow.click();
			

			//toget the current page URL
			String currentURL=d.getCurrentUrl();
			System.out.println("CurrentURL is :"+currentURL );
			
			//close all the browsers and all active web driver instance
			d.quit();
			
			
		}

}

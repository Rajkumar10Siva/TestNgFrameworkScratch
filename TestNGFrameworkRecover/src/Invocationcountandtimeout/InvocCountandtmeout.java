package Invocationcountandtimeout;

//TestnG tutorial =5



import java.time.Duration;

//Testng tutorial =6


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class InvocCountandtmeout {
	//invocation count why? - it is used to run the single test case for multiple times
	//intha program la invocation count kodukalana intha test case 1 time the run agum, but inga 3 count koduthu irukom, so 3 times intha @test run agum
	//intha porgram la 1 @test the iruku
	// invocationTimeout why? - def(the maximum number of milliseconds that the total number of invocations in this test)
	//InvocationTimeout la milliseconds la tha time kodukanum 1000 milliseconds =1 second, so namma kodukara time kula 3 vati intha test case run agi mudinji  irukanum,mudinja pass ilana @test fail agidum
	//kodukura time kula mudikalana test case fail agidum and timout exception varum, example(10000) intha program la kodutha error varum
	//InovocationTimeOut epo work agum na invocation Count iruntha mattum tha work agum
	//invocation time out and count = both are attributes
	//@Test 3 vati one by one a tha run agum open agi close agi open agi close agi open agi close agi
	
	
		@Test(invocationCount = 3,invocationTimeOut = 10000)
		public void count()
		{
			// Launch Browser
			System.setProperty("webdriver.chrome,driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			
			System.out.println("Chrome opened successfully");
			
			
			//Open Chrome
			d.get("https://www.google.co.in/");
			
			
			//Webdriver will wait some time period to find the webelement.
			//It affects the Find element and Find elements method.
			//it is one time declaration
			//it will works and wait before finding the element.

			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			
			//Maximize the page
			d.manage().window().maximize();
			
			d.findElement(By.name("q")).sendKeys("Cricket", Keys.ENTER);
			
			
			//Google la cricket nu type pani search pani vara adutha page la cricket apdinra word motha ethana time iruku nu count pana ezuthi iruka coding.
			
			List<WebElement> crickets = 
					d.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
			
			//to get the count of the cricket word in the given page
			System.out.println(crickets.size());
			
			d.quit();	
		
	}
}

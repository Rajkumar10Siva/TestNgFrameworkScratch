package ThreadPoolSIze;

//testng tutorial = 7


import java.time.Duration;

//Testng tutorial =8


import java.util.List;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ThreadPoolSizee {
	
	//Intha program la Threadpool size, time out and Expectedexception attributes pathi paka porom
	//Threadpool size puriyanum na invocationcount out ena nu puriyanum.
	//Invocation count la 2 nu kodutha (@test) case one by one a two time run agum, one run agitu and close agiotu and scond one run agum
	//Threadpoolsize la 2 nu kodutha (@Test) parallel a two browser la anthe @test open agi parallel a run agum, atha difference between threadpoolsize and invocation count
//Interview question - when will threadpool size works? - InvocationCount iruntha mattum tha threadpool size work agum
	//invocation count kodukama thread  pool size la 3 4 nu kodutha just one time mattum browser la open agi run agum, parallel test run agathu
	//timeout atribute  - oru@test some seconds kula mudiyanum na Timeout attribut use panikalam, inga invocation count attribute theva illa
	//invocation time out epo work agum invocation count iruntha run agum.
	//Syntax :- @Test(timeOut = 3000)
	//intha @test 3 seconds kula run agutha nu check  panom, panalana thread time out excetpion.
	//Timeout epo use panuvom - puthus vara build or page ithana seconds kula load agutha nu check paana
	//What is ExpectedException? - namma test case la exception vanthu fail analum atha pass agura mari katanum report la na apo Expected exception use panipom
	//entha exception varum nu tester ku therinja antha exception a @test la kodutha antha exception iruntha athu ilatha mari program run agidum
	// intha program la find element la thappu iruku na example By.name value =q nu iruku atha qe nu change pana no such exception varum console la.
	//so exception varum vanthalum atha ignore panna the ExpectedException attribute use panrom.
	//Syntax = @Test(expexedExceptions = {NoSuchElementException.class})
	
	
	//Intha @Test 3 times parallel a 3 time run agum
	//suppose 3 and t2 kodutha , 2 times @test parallel la 2 browser open agi run agum, one more time entha browser la test case muditho athula 3rd time @test run agum
	// 3 browser open agi @Test oru oru browser layum 1 time run agum

	
	@Test(invocationCount =5, threadPoolSize = 5, timeOut = 50000)
	public void program()
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
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			
			
			//Maximize the page
			d.manage().window().maximize();
			
			d.findElement(By.name("q")).sendKeys("Cricket", Keys.ENTER);
			
			List<WebElement> crickets = 
			d.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
			System.out.println(crickets.size());
			d.quit();			
	}
	
	
	
	
}

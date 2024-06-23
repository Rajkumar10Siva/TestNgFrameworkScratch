package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFramework {
	
	//Datadriver framework
		//Step 1 - 4 class create pani login panra example pathom, so 4 class first create pani code ezuthi irupom.
		//step 2 - xml file create pani atha oru suite and oru test la 4 classes potu run panom(ithu oru test a run achu).
		//step 3 - atha overcome pana thani thani test la oru oru class potu run pani 4 test a run panom.
		//step 4 - report eduka project right click pani refresh koduthu(test output la index.html a open with browser koduthu report pathom)
		//step 5 - ula data kodukama, parameters oru oru class ls iruka test case ku thani thani ya koduthu run panom.
		//step 6 - 4 class la 3 class delete pani, programming lines a korachom.(athuku tha data driver framework a use panrom simple a irukanum program lines kammiya irukanum nu.
		//step  7 - Ulla data provider annotation use pani atha testng ku passpani data's prodram ulayae koduthu return pani run pannom.
		//step 8 - program ula data vekurathu correct a irukathu nu soli xl sheet la  data vechu atha program la link pani run panrathu the data drivern framework oda work.
		//step 9 - main a oru vati browser open pani 4 data run pana @test la before test and after test use panuvom.
		
		//Giving data's by creating two dimensional array
	
	WebDriver d;
	String [][] data  =	{
			
			{"Raj1231@gmail.com", "Anjali@1143"},
			{"Raj12@gmail.com", "Anjali@143"},
			{"Raj123@gmail.com", "Anjali@13"},
			{"Raj123@gmail.com", "Anjali@143"},
			
		};
		
		//void method la iruntha return panamudiyathu, so error varumothu athu void eduka solum. eduthachu
	//Data providr ku oru name vekkanum
	//antha name @test ku dataprovider la antha name pass pananum
	//Return yen use panrom na - koduthu iruka data dataprovider la return pani @test ku kodukum

		@DataProvider (name ="loginData" )
		public String[][] loginDataProvider()
		{
			return data;
		}
		
		
		
		
		
		
		
		
		@BeforeTest
		public void beforeTest()
		{
			// Launch Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
			System.out.println("Chrome opened successfully");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 d= new ChromeDriver(options);
		}
		
		
		
		
		
		@Test(dataProvider="loginData") 
		public void letcodeloginBothCorrect(String uName, String pass) throws InterruptedException 
		{		
		//Open Amazon page
		d.get("https://letcode.in/");
		
		//Implicit wait
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximize the page
		d.manage().window().maximize();
		
		WebElement log=d.findElement(By.linkText("Log in"));
		log.click();

		WebElement email=d.findElement(By.name("email"));
		email.sendKeys(uName);

		WebElement passw=d.findElement(By.name("password"));
		passw.sendKeys(pass);


		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
		login.click();

		Thread.sleep(6000);

		System.out.println("Testcase 1 Passed");
		}
	
		
	@AfterTest
	public void aftertest()
	{
		//close the browser
		d.quit();
	}
	

}

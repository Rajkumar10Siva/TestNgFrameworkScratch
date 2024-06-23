package Parameters;
//Testng tutorial =9


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;



//It is cross browser testing
//important interview topic- cross browser testing using testNG parameter
// oru @test a parallel a 2 different browser la run panrathu tha cross browser testing
//TestNG exceution padi oru example like Before class and Before method and @test
//if class potu 2 browser ku code ezutharom
//Normal a google page 2 browser la open agi search box la mumbai indians nu search panrom
//xml page la 2 parameters ezuthanum
//oru xml file kula oru test suite the irukum - interview question


public class BrowserTest {
	static WebDriver d;
	
	@Parameters({"Browser"})
	@BeforeTest
	
	public void openbrowser(String browser) throws Exception
	{
	if(browser.equalsIgnoreCase("chrome"))
	{
		
		System.setProperty("webdriver.chrome,driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 d = new ChromeDriver();	
		 System.out.println("Chrome opened successfully");	
	}
	
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
			System.setProperty("webdriver.gecko.driver", "C:\\Selinium files\\geckodriver.exe");
			d= new FirefoxDriver();
			System.out.println("firefox opened successfully");
	}
	
	
	else
	{
		throw new Exception("Invalid browser");
	}
	
	}
	
	
	
	@Test
	public void opengoogle() throws InterruptedException
	{
		//Open  Web page
		d.get("https://www.google.com/");

	}
	
	@AfterTest
	public void close()
		{
		//close the browser
		d.close();
	    }
	
}





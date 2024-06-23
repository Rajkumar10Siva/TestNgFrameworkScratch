  package DataProvider;
  
	//Testng tutorial =12
  
  
  
  
  

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Datautils.DataUtilss;
import Datautils.DataUtilss2;


public class DataProvider3 extends DataUtilss2 {
	
	//data provider la name manidatory na - yes
	//Name ilama run panamudiyuma na panamudiyum atha epdi nu @dataprovider la name kodukama kuda @test ku input a pass panalam.
	//How? @dataprovioder annotation la input koduthu iruka method name a eduthutu vanthu @test la iruka dataprovider a name mari koduthukalam - example - see@Test
	//@Test la dataprovider is manidatory
	
	@Test(dataProvider = "getdata", dataProviderClass = DataUtilss2.class)
	
	public void letcodelogin(String emailid, String password) throws Throwable
	{
	System.out.println("Running Email is :" +emailid);
	// Launch Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	System.out.println("Chrome opened successfully");
	
	//Open Amazon page
	d.get("https://letcode.in/");
	
	//Implicit wait
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Maximize the page
	d.manage().window().maximize();
	
WebElement log=d.findElement(By.linkText("Log in"));
log.click();

WebElement email=d.findElement(By.name("email"));
email.sendKeys(emailid);

WebElement pass=d.findElement(By.name("password"));
pass.sendKeys(password);

Thread.sleep(5000);

WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
login.click();

String currentURL=d.getCurrentUrl();
System.out.println("Current URL is :" +currentURL);

d.quit();

	}
}

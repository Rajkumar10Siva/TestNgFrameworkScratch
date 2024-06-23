package DataProvider;


//Testng tutorial =12

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DtaProvider {
	@DataProvider(name = "login")
	//this is data provider syntax
	//why name ? - Because oru class la multiple data provider vechikalam, so intha test case ku intha data provider use pana porom nu sola tha name.
	//Data provider = attribute and annotation(2 type a koduthukalam), @pota anotation, @test bracket ula pota attributes
	//Why data provider ?- same lines of code a multiple test data ku run panalam using data provider.
	//intha test case letcode login panra test case, ithula 2 user vera vera email and password potu login panra program using data provider
	
	
	
	//Down method - Thaniya data ku namma oru method la data's input a kodukanum.
	//Intha koduthu iruka data than @test ku input a pogum.
	//epdi pogum ? - Data provider la kodutha name @test la data provider ku antha name kodupom. so input a @test ku pogum
	public String[][] getdata()
	{
		//First bracket respresents rows and 2nd brackiet represnts columns
		// why size - 2 - because we write the test for two ti9mes for two different data's
		String [][] data = new String[2][2];
		//row 1 and column 1
		data[0][0] = "rkchella17@gmail.com";
		//row 1 column 2
		data [0][1] = "Anjali@143";
		//row 2 column 1
		data [1][0] = "geethraj143@gmail.com";
		//row 2 column 2
		data [1][1] = "Anjali@1710";
		return data;
		//return kodukarthanala void nu method ku name koduthu irupom, return use panrathala String nu use panuvom, so error la mouse vecha String ku change pana solum void a
	}
	
	
	@Test(dataProvider = "login")
	//1st time test execute agumothu data[0][0] la iruka input String la iruka emailid ku pogum
	//data[0][1] la iruka input String password ku pogum, then 1st test case over.
	//2nd time test execute agumothu data[1][0] la iruka input String la iruka emailid ku pogum
	//data[1][1] la iruka input String password ku pogum, then 2nd test case over.
	//kizha iruku code two times koduthu iruka browser la excecute agum- why 2 times? - size two koduthu irukom la so
	public void letcodelogin(String emailid, String password) throws Throwable
	{
	
	// Launch Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver d = new ChromeDriver(options);
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

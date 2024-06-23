package Parameters;
//Testng tutorial =10




import java.time.Duration;

//Testng tutorial =10 and 11

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//this program explains about parameters in testNg(It is not a attribute, it is annotation)example - @potu ena potalum atha  annotation soluvom
//why parameters? - to read the data's and perform the operation from xml
//@Parameters org.testng import panuvom after entered the parameters nu
//Parameters ethuku use panrom na test input data pass panna, kizha iruka code oru login code
//Ithula send keys use pani tha nama email and password kodupom, apdi kodukama parameters la kodukara value email and password la  poi type agum.
//Parameters concept nalae xml file la poitu namma ena test input data koduka nenaikaramo xml file la type panuvom.
//for example email koduka nenaikarom na name ="emailID" Value ="rkchella17@gmail.com" - emailID apdinra input box la rkchella value poi type agum, this is same for password field.
//xml file la namma name ku ena type panramo athae name a tha parameters kula pass panuvom, mathi pass pana run agathu, same for password.
//Ipdi panrathanala xml la kodutha name @parameters ku pass agum.
//@parameters la iruka parameter @testku pass aga tha namma method kula variables pass panrom, inga email and password the variable, so String mail and password koduthukalam.
//@test attributes la namma ena name la venalum paramaters name koduthukalam
//emailID tha @parameters la first iruku, so namma method la first ena variable pass panromo anga emailID value eduthukum, and same for password, (emailid and password ku bathil namma ena variable name venalum koduthukalam)
//so final a namma send keys la value kodukama direct a method ula kodutha variables a send keys kula koduthukalam
//program xml file la irunthyu run panipom
//inthe program la letcode.in page a sign in pani current hom title a print panrom.
//Paramters 2 or 3 kamiya iruka input filed ku parameters use panuvum, static a irukurathuku parameters use panuvom
//dynamic a irukurathuku parameters use panakudtahu, athuku tha data provider use panuvom
//oru xml file kula oru test suite the irukum - interview question





public class Parameterss {
	
	

	
	@Parameters({"EmailID","Password"})
	@Test
	public void loginpara(String emailid, String password) throws Exception 
	{
		
	System.out.println(emailid + " " +password);

	
	// Launch Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	System.out.println("Chrome opened successfully");
	
	
	//Open  Web page
	d.get("https://letcode.in/");
	
	
	//Implicit wait
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
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

String title=d.getTitle();
System.out.println("Current Title is :" +title);

String currentURL=d.getCurrentUrl();
System.out.println("Current url is :" +currentURL);

d.quit();



	}

}

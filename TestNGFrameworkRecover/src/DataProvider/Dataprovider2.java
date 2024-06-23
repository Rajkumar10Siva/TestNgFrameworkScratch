package DataProvider;

//Testng tutorial =12

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Datautils.DataUtilss;

public class Dataprovider2 extends DataUtilss {
	
	//Last class la Data provider na ena nu pathum, and orae class la Data provider and @test vechi run pani pathom
	//This program - vera package  vera class la data provider vechu epdi run panalam nu pakaporom
	//Then DataProvider class and Indices na ena nu pakaporom.
	//mela iruka class la ethuku extends use panrom na intha class la data provider vekkala, so vera package la vera class la dataprovider vechi irukom so antha parant class, inga iruka class child class.
	//anga iruka data va inga iruka child class la access panna extends use panrom then run panrom thats all, this is one method.
	//parent class la ethachu annotation iruntha athutha first run agum, agitu and  inga iruka class la @Test annotation run agum
	//Another method inheritance la extends la use panama pannanu na @Test la Dataprovider potu antha parent class name koduthukalam
	//example - @Test(dataProvider = "login", dataProviderClass = DataUtilss.class) ipdi mattum potutu run panalam inherit extends panama. 
	//Indices ethuku? - Ipo data provider la 3 inputs(email, password) iruku na enaku 3um run agama just na solrathu mattum r7un aganum na Indices use panuvom.
	//intha Indices enga kodupom na Dataprovider annotation bracket la kodupom,DataUtilss apdinra class la annotation vechi irukom, so anga tha kodupom 		
		
		@Test(dataProvider = "login", dataProviderClass = DataUtilss.class)
		
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

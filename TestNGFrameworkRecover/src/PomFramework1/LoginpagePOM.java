package PomFramework1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMframework2.LoginPageObjects;

public class LoginpagePOM {
	
	//important framework
	//1. POM - Why? - code a easy ya maintain panum. change a easy ya adopt panikom webelemet changes.(It will adopt the WebElement changes in WebPage)
	//UI change agalam for log in page or some modules.  
	//ex- ethachu oru application la iruka button ku  webelement kandu pidikaraom, antha button use pani 10 test case ezuthi irupom. SUppose anthe web element value change achu na ela test caseum affect agum.
	//So atha thaniya oru page la antha web element vechu atha easy ya apo apo change panikalam change agumothu. 
	//so athuku tha pom use panrom.
	
	//2.What is Pom?
	//Test case -> la irunthu How to find the element a extract pani eduka promom 
	
	
	//procedure - video 1
	//1. Log in page ku normal program ezuthi irukom.
	//2. Then itha Pom a matha object la inoru class la vekkanum
	//3. So thaniya oru package create pani class create pani athula etha etha la find pananumo athuku methods ezuthi irukom. anthe methods ku correct ana elements a kodukanum, see loginpage objects class in another pom package.
	//4. Webdriver antha objects packgae la ezuthi iruka method ku pass pananum. pass pana udanae return statement kodukanum.
	//5. Antha objects class ku intha porgram la object create pananum.
	//So intha line use panrom /LoginPageObjects  loginPageObjects = new LoginPageObjects();
	//6. object create pani irukom class ku, so anthe objects class name irukura name.entha button ku element kandupidikiramo athu, bracket la driver pass panitu, ena operatioon(sendkeys, click) perform pana poromo atha kodukanum.
	//7. So 5th line a object intha class la create panama irukanum na, pom2 package la loginpageobjects class la iruka methods munadi statisc kodukanum. Static en kodukarom - object create panama direct a call panikalam class a
	//8. Then 		LoginPageObjects.username(d).sendKeys("user@phptravels.com"); intha mari etha etha la find pananumo athuku intha mari lines ezuthikanum.

	
	//video - 2
	//findelement use panama epdi element a locate panalam, panama epdi element a epdi identify pana mudiyum - yes mudiyum(atha paakaporom)
	//So first methods ethuvum namma use pana porathu ila 2nd pom package la objects class la
	//So elements a variable mari loginpage objects class la declare pananum static word use pani.
	//Then element anga epdi find pananum na- @FindBy method use pani find panuvom, refer loginPageObjects class in pom 2
	//driver pass panama 3 operation perform panra lines ezuthi irukom.
	//apram run panna nullpointer exception adikum username find agala nu
	//yen na driver pass panatathaala, so driver pass pana pagefactory line ezuthi irukom(athula driver, class name .class)syntax ezuthanum
	//then run pana run agum.
	//pageFactory la findelement use panamatom, FindBy tha use panuvom
	//pagefactory la iruka initElemets static type so atha anga static la variable declare panrom.
	
	
	
	
	
	@Test
	public void login() throws InterruptedException
	{
		
	
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		System.out.println("Chrome opened successfully");
		//Open phptravels Web page
		d.get("https://phptravels.net/login");
		//Implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Maximize the page
		d.manage().window().maximize();
		
	
	//	LoginPageObjects  loginPageObjects = new LoginPageObjects();
		
		//LoginPageObjects.username(d).sendKeys("user@phptravels.com");
		//LoginPageObjects.password(d).sendKeys("demouser");
	//	LoginPageObjects.login(d).click();
		
		
		
		PageFactory.initElements(d,LoginPageObjects.class);

		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.login.click();
		
		
        //intha 3 line koduthui program run pana null pointer exception adikum - why?
		//Username la null iruku yen? -pom 2 la loginobjects class la iruka username  ku value populate agala.
		//Yen agala? - @findBy pota udanae element kandupidika mudiyathu - driver is important mela iruka line la (d)eduthutom atha example difference.
		//antha web driver pass panna page factory use panuvom.
		//PageFactory.initElements(d,LoginPageObjects.class(classname ithu));//ipo run pana nullpointer exception adikathu - run agum
		//driver a pass pana page factory use panrom
		
		
		/*	//Enter Username
		
		WebElement username = d.findElement(By.name("email"));
		user.sendKeys("user@phptravels.com");
		
		
		//Enter Password
		
		WebElement password = d.findElement(By.name("password"));
		pass.sendKeys("demouser");
		
		//Click sign in
		WebElement login = d.findElement(By.xpath("//*[@type='submit']"));
		login.click(); */
		
		Thread.sleep(20000);
		
		System.out.println("Log in successfully"); 
		
		d.quit();
	}
	
	
	
	

}

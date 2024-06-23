package ParallelTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class letcode2 {
	
	
	
	
	
	@Test
	public void Letcodelogin1() throws Throwable
	{
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		System.out.println("Chrome opened successfully");
		
		//Open Web page
		d.get("https://letcode.in/");
		//Maximize the page
		d.manage().window().maximize();
		//Select login
		
		WebElement log=d.findElement(By.linkText("Log in"));
		log.click();
		
		//find the email element and passing the values
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys("rkchella17@gmail.com");
		
		//find the pass element and passing the values
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("Anjali@143");
		
		Thread.sleep(5000);
		
		//webdriver will sleep for 5 seconds and net perform ant action fot this 5 seconds.
		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
		
		//click the log in button
		login.click();
		d.quit();	
	}
	
	
	
	
	@Test
	public void Instalogin() throws Throwable
	{
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		System.out.println("Chrome opened successfully");
		
		
		//Open Amazon Web page
		d.get("https://www.instagram.com/");
		
		
		//Webdriver will wait some time period to find the webelement.
		//It affects the Find element and Find elements method.
		//it is one time declaration
		//it will works and wait before finding the element.
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
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
		System.out.println("");
		
		//select login
		WebElement login = d.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		login.click();
		System.out.println("Login successfully");
		
		d.close();
		
	}
		

}

package GivingPriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LiveExample {
	
	

	static WebDriver d;
	
	
	@Test(dependsOnMethods="method3")
	public void method4() throws InterruptedException
	{
		Thread.sleep(5000);
		//webdriver will sleep for 5 seconds and net perform ant action fot this 5 seconds.
		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));

		//click the log in button
		login.click();
	}
	
	
	@Test(priority=1)
	public void method1()
	{
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		d= new ChromeDriver();
		System.out.println("Chrome opened successfully");
	}
	
	
	@Test(dependsOnMethods="method2")
	public void method3()
	{
		//select sign in
		WebElement log=d.findElement(By.linkText("Log in"));
		log.click();
		
		//find the email element and passing the values
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys("rkchella17@gmail.com");
		
		//find the pass element and passing the values
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("Anjali@143");
	}
	
	@Test(dependsOnMethods="method1")
	public void method2()
	{
		//Open Amazon Web page
		d.get("https://letcode.in/");
		
		//Maximize the page
		d.manage().window().maximize();
	}
	
	
	@Test(priority=5)
	public void method5()
	{
		d.quit();
	}
	
	
}

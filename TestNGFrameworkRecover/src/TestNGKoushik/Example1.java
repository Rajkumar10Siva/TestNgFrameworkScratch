package TestNGKoushik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	
	
	@Test
	public void letcodelogin() throws InterruptedException
	{
	
			//To launch rhe browser
			ChromeDriver d = new ChromeDriver();
			
			//to fetch the url
			//d.get("https://letcode.in/signin");
			d.navigate().to("https://letcode.in/signin");
			
			//MAXIMIZE THE BROWSER
			d.manage().window().maximize();
			
			WebElement email = d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[1]/div/input"));
			email.sendKeys("rkchella17@gmail.com");
			
			Thread.sleep(3000);
			
			WebElement pass = d.findElement(By.name("password"));
			pass.sendKeys("Anjali@143");
			
			Thread.sleep(3000);

			WebElement login  =	d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
			
			login.click();
			
			String pagetitle = d.getTitle();
			System.out.println(pagetitle);
			
			String pageurl = d.getCurrentUrl();
			System.out.println(pageurl);
		
			Thread.sleep(3000);

			d.quit();
			
		}

}

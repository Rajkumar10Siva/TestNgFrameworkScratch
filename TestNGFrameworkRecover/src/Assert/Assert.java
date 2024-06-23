package Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assert {


	
	
	
	@Test
	public void openGoogle() throws InterruptedException
	{
	//To launch chrome browser
	System.setProperty("webdriver.chrome,driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	

	String Expected = "Goooogle";
	
	
	d.get("https://www.google.co.in/");
	
	Thread.sleep(5000);
	
	
	String Actual = d.getTitle();
	
	System.out.println(Expected);
	System.out.println(Actual);
	
	
	assertEquals(Expected, Actual);
	
	
	System.out.println("Both titles are equal");
	
	d.quit();
	

	}
}

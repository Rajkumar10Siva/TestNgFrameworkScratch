package ExpectedException;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedException {
	
	
	
	
	//Conside there is one sample test case inn my class.
	//In that class, I have passed the attribute invocation count =2, invoucation timeout =10000
	//If the test case executed by 2 times withing 10 seconds, it will considered as pass.
	//If the execution is not completed within 10 seconds, it will throw threadTomeoutException, so the test script is failed.
	//But if i like to hide this exception, I will use one attribute.
	//that name is called as expectedExeptions.
	//i have to pass this attribute inside the @Test
	//Once I passed this attributes to @Test method, the test execution result will now failed, it will show the result as pass even the test execution is not completed within 10 seconds.
	
	
	
	
	
	
	@Test(invocationCount = 3, invocationTimeOut = 1000, expectedExceptions = ThreadTimeoutException.class)
	public void count()
	{
		// Launch Browser
		System.setProperty("webdriver.chrome,driver", "C:\\Selinium files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		System.out.println("Chrome opened successfully");
		
		
		//Open Chrome
		d.get("https://www.google.co.in/");
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Maximize the page
		d.manage().window().maximize();
		
		//searchbox inspect
		WebElement search = d.findElement(By.name("qe"));
		search.sendKeys("Cricket", Keys.ENTER);
		
		//Google la cricket nu type pani search pani vara adutha page la cricket apdinra word motha ethana time iruku nu count pana ezuthi iruka coding.
		
		List<WebElement> crickets = 
				d.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
		
		//to get the count of the cricket word in the given page
		System.out.println(crickets.size());
		
		d.quit();	
	
	
	
	}
}

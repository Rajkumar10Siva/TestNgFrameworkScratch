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

public class ExpectedException {
	
	
	@Test()
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

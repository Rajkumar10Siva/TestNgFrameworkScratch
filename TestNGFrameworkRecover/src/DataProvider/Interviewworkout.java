package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Interviewworkout {
	
	
	
	@DataProvider(name="text",parallel = true, indices = {0,1})
	public String[][] setdata()
	{
		
	String [][] data = new 	String[4][4];
		
	data[0][0] = 	"Raj";
	data[0][1] = 	"kumar";
	data[0][2] = 	"7010795583";
	data[0][3] = 	"kanchipuram";

	data[1][0] = 	"Ramesh";
	data[1][1] = 	"kumar";
	data[1][2] = 	"9087238437";
	data[1][3] = 	"chennai";
		
	data[2][0] = 	"Dinesh";
	data[2][1] = 	"kumaran";
	data[2][2] = 	"8438930661";
	data[2][3] = 	"coimbatore";
	
	data[3][0] = 	"Aswin";
	data[3][1] = 	"kumar";
	data[3][2] = 	"9500433164";
	data[3][3] = 	"chennai";
	
	return data;
	
	}
	
	

	@Test(dataProvider = "text")
	public void textboxcheck(String first, String last, String number, String place)throws Throwable
	{
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);


		//open web page
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		//maximize
		d.manage().window().maximize();
		
		//first name
		d.findElement(By.id("RESULT_TextField-1")).sendKeys(first);

		//last name
		d.findElement(By.id("RESULT_TextField-2")).sendKeys(last);
		
		//phone number
		d.findElement(By.name("RESULT_TextField-3")).sendKeys(number);
		
		//country
		d.findElement(By.name("RESULT_TextField-4")).sendKeys(place);
		
		Thread.sleep(5000);
		
		d.quit();
	}
}


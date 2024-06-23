package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenFramework2 {
	
	
	
	WebDriver d;
	String data[][] = null;
	
	
	@DataProvider(name="TestData")
	public String[][] Exceldata() throws BiffException, IOException
	{
		data = getExceldata();
		return data;
	}
	
	
	public String[][] getExceldata() throws BiffException, IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\rkche\\OneDrive\\Desktop\\Dataframeswork.xls");
		
		//GetWorkbook
		Workbook workbook =	Workbook.getWorkbook(file);
		
		//GetSheet
		Sheet sheet = workbook.getSheet(0);
		
		
		int rowcount = sheet.getRows();
		int colcount = sheet.getColumns();
	
	
	
		
		//excel data
		//[0,0] = Username [1,0] = password
		//[0,1] = Username1 [1,1] = password1
		//[0,2] = Username2 [1,2] = password2
		//[0,3] = Username3 [1,3] = password3
		//[0,4] = Username4 [1,4] = password4
		
		
		//Two dimensional array data
		//[0,0] - username1 [0,1] = password1
		//[1,0] - username2 [0,1] = password2
		//[2,0] - username3 [0,1] = password3
		//[3,0] - username4 [0,1] = password4
		
		
		
		
		
		String [][] testdata = new String[rowcount-1][colcount];
		
		
		for(int i=1;i<rowcount; i++)
		{
			for(int j=0; j<colcount; j++)
			{
			 testdata[i-1][j] =	sheet.getCell(j, i).getContents();	 
			}
		}
		
		return testdata;
	}
		
		
	
	
	
	
	
@BeforeTest()
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	 d = new ChromeDriver(co);
	 
}
	





@Test(dataProvider="TestData")	
public void logintestcase(String uName, String pass) throws InterruptedException
{
	
	d.get("https://letcode.in/");
	
	d.manage().window().maximize();
	
	WebElement log=d.findElement(By.linkText("Log in"));
	log.click();

	WebElement email=d.findElement(By.name("email"));
	email.sendKeys(uName);

	WebElement passw=d.findElement(By.name("password"));
	passw.sendKeys(pass);
	
	WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
	login.click();

	Thread.sleep(3000);

	System.out.println("Testcase  Passed");
}
	


	
@AfterTest
public void closebrowser()
{
	d.quit();
}
	
	
	
	
	
	
	
		
		
		
		
		
		
	}
	



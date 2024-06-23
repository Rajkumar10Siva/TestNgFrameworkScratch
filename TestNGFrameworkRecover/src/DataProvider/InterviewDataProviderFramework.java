package DataProvider;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class InterviewDataProviderFramework {
	
	
	String [][] data = null;
	
	
	@DataProvider(name = "datas", parallel = true)
	public String[][] setdata() throws BiffException, IOException
	{

	data = getExceldata();
	return data;
	
	}
	
	
	public String[][] getExceldata() throws BiffException, IOException
	{
		
		
		File f = new File("C:\\Users\\rkche\\OneDrive\\Desktop\\Rajdata.xls");
		
		
		Workbook work = Workbook.getWorkbook(f);
		
		Sheet sheet =	work.getSheet(1);
		
		
		int row = sheet.getRows();
		
		System.out.println(row);
		
		int col = sheet.getColumns();
		
		System.out.println(col);

		
		
		String [][]testdata = new String[row-1][col];
		
		for(int i=1; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		
		return testdata;
	
		
	}
	
	
	
	@Test(dataProvider = "datas")
	public void form(String first, String last, String number, String place)throws Throwable
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

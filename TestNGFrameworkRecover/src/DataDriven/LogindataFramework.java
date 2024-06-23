package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LogindataFramework {
	
	
	//save the excel sheet in the format - 97-2003 
	//Steps with jxl framework
	//File location - C:\\Users\\rkche\\OneDrive\\Desktop\\Rajdata.xls
	//2.Get Workbook
	//3.Get sheet
	//4.Get rows
	//5.Get columns
	//6.Iterate and get call values
	
	//Datadriver framework
	//Step 1 - 4 class create pani login panra example pathom, so 4 class first create pani code ezuthi irupom.
	//step 2 - xml file create pani atha oru suite and oru test la 4 classes potu run panom(ithu oru test a run achu).
	//step 3 - atha overcome pana thani thani test la oru oru class potu run pani 4 test a run panom.
	//step 4 - report eduka project right click pani refresh koduthu(test output la index.html a open with browser koduthu report pathom)
	//step 5 - ula data kodukama, parameters oru oru class ls iruka test case ku thani thani ya koduthu run panom.
	//step 6 - parametets la yum nammala code koraika mudila nu next method promom. Athu tha dataprovider. 4 class la 3 class delete pani, programming lines a korachom.(athuku tha data driver framework a use panrom simple a irukanum program lines kammiya irukanum nu.
	//step  7 - Ulla data provider annotation use pani atha testng ku passpani data's program ulayae koduthu return pani run pannom.
	//step 8 - program ula data vekurathu correct a irukathu nu soli xl(.csv file) sheet la  data vechu atha program la link pani run panrathu the data drivern framework oda work.
	//step 9 - main a oru vati browser open pani 4 data run pana @test la before test and after test use panuvom.
	
	//Giving data's by creating two dimensional array
	
	
	
	WebDriver d;
	String [][] data  =	null;

	
	//void method la iruntha return panamudiyathu, so error varumothu athu void eduka solum. eduthachu
//Data providr ku oru name vekkanum
//antha name @test ku dataprovider la antha name pass pananum
//Return yen use panrom na - koduthu iruka data dataprovider la return pani @test ku kodukum

	@DataProvider (name ="loginData" )
	public String[][] loginDataProvider() throws BiffException, IOException
	{
		data = getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {//intha method namma xl file la irunthu data eduka
		
		FileInputStream excel = new FileInputStream("C:\\Users\\rkche\\OneDrive\\Desktop\\Dataframeswork.xls");//file save agi iruka location inga pass panrom
		
		//Getworkbook
		Workbook workbook = Workbook.getWorkbook(excel);
		
		//Getsheet
		Sheet sheet = workbook.getSheet(0);
		
		//Get rows
		int rowcount =	sheet.getRows();
		System.out.println(rowcount);
	
		//Get coloumns
		int columncount = sheet.getColumns();
		System.out.println(columncount);

		
		String testData[][] = new String[rowcount-1][columncount];
	
		//Excel data structure
	//[0,0]username   [1,0]password
	//[0,1]Raj123@gail.com   [1,1]Anjali@111	
	//[0,2]Raj123@gmail.com   [1,2]Anjali@1111	
	//[0,3]Raj123@gmail.co   [1,3]Anjali@143	
	//[0,4]Raj123@gmail.com   [1,4]Anjali@143
	
	
	
	//Two dimensional array
	
	//[0,0]Raj123@gail.com   [0,1]Anjali@111	
	//[1,0]Raj123@gmail.com   [1,1]Anjali@1111	
	//[2,0]Raj123@gmail.co   [2,1]Anjali@143	
	//[3,0]Raj123@gmail.com   [3,1]Anjali@143
	
	
	
	for(int i=1; i<rowcount; i++)
	{
		for(int j=0; i<columncount; j++)
		{
			//to get the sheet content
			testData[i-1][j] = 	sheet.getCell(j,i).getContents();
		}

	}
	
	
	return testData;
	}
	
	
	
	
	
	
	
	@BeforeTest
	public void beforetest()
	{
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		d= new ChromeDriver();
		System.out.println("Chrome opened successfully");
	}
	
	
	
	
	@Test(dataProvider="loginData") 
	public void letcodelogin(String uName, String pass) throws InterruptedException
 
	{
	//Open Amazon page
	d.get("https://letcode.in/");
	
	//Maximize the page
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
	public void aftertest()
	{
		//close the browser
		d.quit();
	}








}

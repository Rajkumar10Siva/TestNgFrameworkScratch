package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class exampleforExtentReport {
	
	
	
	
	ChromeDriver d;
	ExtentSparkReporter htmlreporter;//class and Object
	ExtentReports reports;//class and Object
	ExtentTest testcase;//class and Object
	
	
	@BeforeSuite
	public void  setbrowser()
	{
		
		htmlreporter= new ExtentSparkReporter("NewTestReport.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlreporter);
		d = new ChromeDriver();
	}
	

	
	
	@Test
	public void openGoogle() throws IOException
	{
		testcase = reports.createTest("Verify Google Title - TC001");
		d.get("https://www.google.co.in/");
		testcase.info("Navigate to Google");
		
		
		String expectedtitle = "Google";
		testcase.info("Expected Title is :"+expectedtitle);
		

		String actualtitle =d.getTitle();
		testcase.info("Actual Title is :"+actualtitle);

		
		testcase.info("Verifying expected and Actual Title");
		if(actualtitle.equals(expectedtitle))
		{
			//System.out.println(" Test case is passed ");//Intha line namaku console la kaatum
			testcase.pass("Actual Title and Expected title are Equal");//Intha line namaku Report la kaatum
		}
		else
		{
			System.out.println(" Test case is failed "); //Intha line namaku console la kaatum
			testcase.fail("Actual Title and Expected title are Not Equal");//Intha line namaku Report la kaatum
			
			//screenshot if test case failed
			//Convert the webdriver object to takesScreenshot
			TakesScreenshot ss = (TakesScreenshot) d;

			//Source file
			File source=ss.getScreenshotAs(OutputType.FILE);

			//destination file
			File destination = new File("Google.png");

			//Copy from source to destination profile.
			FileHandler.copy(source, destination);	
			
			testcase.addScreenCaptureFromPath("Google.png");
			
			
		}
	}
	
	
	
	
	@Test
	public void openFacebook() throws IOException
	{
		testcase = reports.createTest("Verify Facebook Title- TC002");
		d.get("https://www.facebook.com/facebook/");
		testcase.info("Navigate to Facebook");
		
		
		String expectedtitle = "facebook";
		testcase.info("Expected Title is :"+expectedtitle);


		String actualtitle =d.getTitle();
		testcase.info("Actual Title is :"+actualtitle);

		
		testcase.info("Verifying expected and Actual Title");
		if(actualtitle.contains(expectedtitle))
		{
			//System.out.println(" Test case is passed ");
			testcase.pass("Actual Title and Expected title are Equal");
		}
		else
		{
			//System.out.println(" Test case is failed ");
			testcase.fail("Actual Title and Expected title are Not Equal");
			
			
			//screenshot if test case failed
			//Convert the webdriver object to takesScreenshot
			TakesScreenshot ss = (TakesScreenshot) d;

			//Source file
			File source=ss.getScreenshotAs(OutputType.FILE);

			//destination file
			File destination = new File("facebook.png");

			//Copy from source to destination profile.
			FileHandler.copy(source, destination);	
			
			testcase.addScreenCaptureFromPath("facebook.png");
			
		}
	}
	
	
	
	@Test
	public void openInsta() throws IOException
	{
		testcase = reports.createTest("Verify Insta Title - TC003");
		d.get("https://www.instagram.com/");
		testcase.info("Navigate to Instagram");

		
		String expectedtitle = "Instagram";
		testcase.info("Expected Title is :"+expectedtitle);
		
		
		String actualtitle =d.getTitle();
		testcase.info("Actual Title is :"+actualtitle);
		
		
		
		testcase.info("Verifying expected and Actual Title");
		if(actualtitle.equals(expectedtitle))
		{
			//System.out.println(" Test case is passed ");
			testcase.pass("Actual Title and Expected title are Equal");
		}
		else
		{
			//System.out.println(" Test case is failed ");
			testcase.fail("Actual Title and Expected title are Not Equal");
			
			
			//screenshot if test case failed
			//Convert the webdriver object to takesScreenshot
			TakesScreenshot ss = (TakesScreenshot) d;

			//Source file
			File source=ss.getScreenshotAs(OutputType.FILE);

			//destination file
			File destination = new File("Insta.png");

			//Copy from source to destination profile.
			FileHandler.copy(source, destination);	
			
			testcase.addScreenCaptureFromPath("Insta.png");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	@AfterSuite
	public void closebrowser()
	{
		reports.flush();
		d.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActualTestCase {
	
	
	
//	@BeforeSuite
//	public void beforesuite()
//	{
//		System.out.println("Before Suite");
//	}
//	
//	
//	@AfterSuite
//	public void Aftersuite()
//	{
//		System.out.println("After Suite");
//	}
//	
//	
//	
//	@org.testng.annotations.BeforeTest
//	public void BeforeTest()
//	{
//		System.out.println("Before Test");
//	}
//	
//	
//	@org.testng.annotations.AfterTest
//	public void AfterTest()
//	{
//		System.out.println("After Test");
//	}
//	
//	
//	
//	@BeforeClass
//	public void Beforeclass()
//	{
//		System.out.println("Before class");
//	}
//	
//	
//	@AfterClass
//	public void AfterCLass()
//	{
//		System.out.println("After Class");
//	}
//	
//	@BeforeMethod
//	public void BeforeMethod()
//	{
//		System.out.println("Before Method");
//	}
//	
//	
//	@AfterMethod
//	public void AfterMethod()
//	{
//		System.out.println("After method");
//	}
	
	int a=10,b=20;
	
	@Test
	public void Test1()
	{
		assertEquals(a, a);
		System.out.println("Test case 1 success");
	}
	
	
	@Test
	public void Test2()
	{
		assertEquals(b, b);
		System.out.println("Test case 2 success");
	}
	
	
	@Test(timeOut = 3000)
	public void Test5() throws InterruptedException
	{
		System.out.println("Test case 3 failed due to time");
		Thread.sleep(5000);
	}
	
	
	@Test(priority = 0)
	public void Test3()
	{
		assertEquals(a, b);
		System.out.println("Test case 4");
	}
	

	@Test(priority = 1,dependsOnMethods = "Test3")
	public void Test4()
	{
		System.out.println("Skippeing Test case 5 ");
	}
	
	
}

package TestNGANnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngAnnotationsExample {
	
	
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite");	
	}
	
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("After Suite");
	}
	
	
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before class");
	}
	
	
	@AfterClass
	public void AfterCLass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method");
	}
	
	
	@Test
	public void Test1()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test
	public void Test2()
	{
		System.out.println("Test case 2");
	}
	

}

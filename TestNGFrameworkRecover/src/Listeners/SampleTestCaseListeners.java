package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTestCaseListeners {
	
	
	
	
	
	 int a=10,b=5;
	
	@Test(priority=1)
	public void equal1()
	{
		Assert.assertEquals(a, a);
		System.out.println("successfull 1");
	}
	
	@Test()
	public void equal2()
	{
		Assert.assertEquals(a, b);
		System.out.println("successfull 2");
	}
	
	
	@Test(dependsOnMethods="equal2")
	public void equal3()
	{
		Assert.assertEquals(a, b);
		System.out.println("successfull 3");
	}
	
	
	
	

}

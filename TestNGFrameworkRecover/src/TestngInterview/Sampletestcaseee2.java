package TestngInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampletestcaseee2 {
	
	
	
	
	
	
	@Test(retryAnalyzer=RetryListnerr2.class)
	public void testcase1()
	{
		Assert.assertEquals(true, false);
	}
	
	
	
	
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true,false);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

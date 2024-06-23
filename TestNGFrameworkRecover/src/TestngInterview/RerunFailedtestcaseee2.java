package TestngInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedtestcaseee2 {
	
	//1.How to rerun the failed test case in testNG?
	
	
//	a.We can run testng-failed.xml
//	b.Using IRetryAnalayzer Interface
//	c.Using IAnnotationTransformer (I) and IRetryAnalyzer(I) - fail ana test case entha oru annotation ilama run aga use panara interface
	
	
	// IAnnotationTransformer which is dependent of IRetryAnalyzer(I)
	//IRetryAnalyzer(I) is interface- ithula iruka method - retry()
	//IAnnotationTransformer (I) is interface - ithula iruka method - transform()
	
 
	//1 method = Ipo namma class la 3 test cases iruku.
	//Ithula 1 test case pass aguthu, matha 2 fail aguthu
	//ipo namme fail ana test case a mattum thaniya epdi run panrathu - Note(pass ana testcase run aga kudathu again)
	//Intha time la namma program ku first xml file create pani 3 test case first run panuvom.
	//Result 1 pass and 2 failed nu varum
	//Ipo intha fail ana test case enga irukum na - Test out put la irukum - Name(testng-failed.xml)
	//Antha folder a click panrom na - athula fail ana test case method name oda irukum
	//Anga irunthu namma fail ana testcase run panikalam.
	//ela test method run pananum na xml file la irunthu run panikalam
	//SO test case fail achuna test-output la oru file la store agi irukum like xml file, anga irunthu run panikalam.
	//Intervieq question - fail agura test case mattum enga irunthu run pannuvom - (test-output) la iruka (testng-failed.xml)  folder la irunthu run panikalam, program la ena error nu change pani run panikalam
	//intha method manual a run panra method.
	//Itha over come panna automatica fail anathu mattum run pananum - athu tha adutha method.
	
	

static int a=5, b=10;
	@Test(retryAnalyzer = RetryListnerr1.class)
	public void equal1()
	{
		Assert.assertEquals(a, b);
		System.out.println("successfull 1");
	}
	
	@Test(priority=2)
	public void equal2()
	{
		Assert.assertNotEquals(a, b);
		System.out.println("successfull 2");
	}
	
	@Test(priority=3)
	public void equal3()
	{
		Assert.assertEquals(a, a);
		System.out.println("successfull 3");
	}

}

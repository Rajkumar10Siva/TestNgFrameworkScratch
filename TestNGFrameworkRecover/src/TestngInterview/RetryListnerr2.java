package TestngInterview;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListnerr2 implements IRetryAnalyzer {
	
	
	int failedcount=0;
	int limit  =4;
	
	

	@Override
	public boolean retry(ITestResult result) {
		if(failedcount<limit)
		{
			failedcount++;
			return true;//true nu vantha loop kula pogum
		}

		return false;//false epo varum na 4 time oru test pass aka try panum, apavum pass agalana return false agum.
	}
	
	
	

}

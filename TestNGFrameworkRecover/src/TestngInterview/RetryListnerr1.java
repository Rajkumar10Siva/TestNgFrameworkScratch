package TestngInterview;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListnerr1 implements IRetryAnalyzer{

	//RetryListner is a class  and IRetryAnalyzer is a interface
		//So class implements interface, so eror varum intha line type panumothu
		//so interface la implement panatha method lam class implement pananum
		//so add unimplemented methods a click pananum
	//unimplemented method kodutha Public boolen retry intha line varum.
	//so athula nammaku faile aguratest case oru limit varaikum run pananum- so athuku code ezuthi irukom
	//so anga iruka program fail agurathu intha program kuda epdi link agum.
	//athuku tha intha program class name a , run panra test case program la @test ku parameter la retryAnalyzer = RetryListner.class nu kodupom
	//so program ipo antha test case program kuda link agiduthu
	//so antha original program la entha @test ku retryAnalyzer kodukaramo(antha test case mattum 4 time pass aga vekka try panum failed test casea, athuku mela failed nu vanthudum).
	//Apo matha @testla 4 time run aguma na - NO(ethuku retryAnalazer kodukaramo athu mattum athana time run agum) remaining la one time tha run agum.
	//Suppose retryAnalyzer pass agura test case ku kodutha, athu one time mattum tha run agum.
	//retry analyzer a namma test output la poi run panna theva ila, original xml file la irunthae run panikalam.
	//but munadi manual a patha method la namma test-output la iruka file latha poi fail ana test case run panuvom'
	
	//ipo inoru question - namma kitta 1000 test case iruku, athula 240 test case fail aguthu na(namma onu onu kum poi retryAnalazyer kodutha ena agum - it is time consuming)
	//so athuku tha one time mattum retryAnalyzer kodutha pothum , apdi panra method la namma (IAnnotationTransformer) use panuvom
	
	
	
	int failedCount = 0;
	int failedlimit = 4;//namma ishtam tha intha value
	
	
//	@Override
//	public boolean retry(ITestResult result) {
//		// TODO Auto-generated method stub
//		return false;
//	}


	
	
	  @Override
	  public boolean retry(ITestResult result)
	  { 
		  if(failedCount<failedlimit)
		  {
			  failedCount++; 
			  return true; 
		  } 
		  return false; 
	  }
	 

	

}

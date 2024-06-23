package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener

//Listener na ena?
//To Listen the class or test case execution
//It automaticall calls the method based on the test case result.
//First oru class create pani irukom.
//ITestListener - Ithu oru interface(Itha class kuda namma sekanum, class interface sekanum na athuku use pana pora keyword=implements)
//so class implements interface(ipdi podanum, podumothu side le error varum like Add unimplement methods, intha error namaku soli kodutha tutorial la kuda iruku)
//Inthe error epo varum na TestNg version 7 ku kizha iruntha mattum tha intha mari add unimplemented method nu namaku kaatum, new version above 7.0 tesntNG version na namaku athu kaatathu.
//So athanala tha namma implement panumothu antha error namaku katala, unimplemented methods intha class ku kondu vara mudila.
//Yen testNg new version la add unimplemented methods varala, because testng7.0 mela iruntha athu java 8la iruka methods la direct a use panika mudiyum, neraya update pani irukanga.
//but testng 7.0 kizha iruntha athala java 8 features use panamudiyathu so.
//Seri namma epdi tha pa unimplemented methods inga konduvarathu.
//nama ena pananum na right click the class program la vechu pananum, then select Source, then select override/implement methods, then athula la iruka iTestListener method elam apply pana tutorial la unimplement methods kodutha vara ela method inga vanthuvidum.

//xml file la namma ena add pana porom na see below after suite apram intha line ezutha porom.

//<listeners>
//<listener class-name="Listeners.Listener"/> name epdi koduthom na packagename.classname
//</listeners>

//entha test case run pana poromo athuku xml file create pananum, anga intha mela kodutha listeners line add pananum, then anga intha listener kodukarthala intha listener entha class la iruka test case run panromo anga link agidum, so athan antha xml file la listeners add panrom.
// xml file la irunthu program run panna namaku entha order la program execute aguthu nu puriyum



{

	@Override
	public void onTestStart(ITestResult result)
	
	{ 
		//Test start agura apo like test execution agura apo intha method automatica call agi run agum.
		System.out.println("Test case is going to execute");		
	}

	
	@Override
	public void onTestSuccess(ITestResult result) 
	
	{//Test case pass achu na inthe method run agum

		System.out.println("Test case is passed");		
	}

	
	@Override
	public void onTestFailure(ITestResult result) 
	
	{//test case fail achu na intha method run agum

		System.out.println("Test case is failed");	
	}

	
	
	@Override
	public void onTestSkipped(ITestResult result)
	
	{//test case skip achu na intha method run agum

		System.out.println("Test case is Skipped");
	}

	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	
	{//10 test case iruntha athula athiga percentage pass achu na intha method run agum

		System.out.println("Certain percentage passed");
	}

	
	
	
	
/*	@Override(intha method namaku tutorial la soli tharala)
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}*/

	
	
	
	@Override
	public void onStart(ITestContext context) 
	
	{
		//Test case start agura munadi intha method run agum.
		System.out.println("Before Everything");
	}

	
	
	@Override
	public void onFinish(ITestContext context) 
	{
		//Test case end agita apram munadi intha method run agum
		System.out.println("After Everything");
	}
	


	

}

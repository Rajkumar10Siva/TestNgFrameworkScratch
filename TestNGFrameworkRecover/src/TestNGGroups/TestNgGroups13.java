package TestNGGroups;

import org.testng.annotations.Test;

public class TestNgGroups13 {
	//Testng tutorial =8.1
	
	

	 @Test(groups= "Functional test")
	  
	  public void smoketest() {
		  System.out.println("Smoke test 2");
	  }
	 
	  @Test(groups= "Functional test")
	  
	  public void Sanitytest() {
		  System.out.println("Sanity test 2");
	  }
	  
	  @Test(groups= "Functional test")
	  
	  public void Retest() {
		  System.out.println(" Re-test 2");
	  }
	  
	  @Test(groups= "Non Functional test")
	  
	  public void Loadtest() {
		  System.out.println("Load test 2");
	  }
	  
	  @Test(groups= "Non Functional test")
	  
	  public void Stresstest() {
		  System.out.println("Stress test 2");
	  }
	  
	  @Test(groups= "Other test")
	 
	  public void adhoctest() {
		  System.out.println("Adhoc test 2");
	  }

}

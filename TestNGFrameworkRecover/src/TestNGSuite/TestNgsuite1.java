package TestNGSuite;

import org.testng.annotations.Test;

public class TestNgsuite1 {
	
	 @Test(priority=1)
	  public void one() {
		  System.out.println("Open browser");
		  }
	 
	 
	  @Test(priority=2)
	  public void two() {
		  System.out.println("Open login page");
		  }
	  
	  
	  
	  @Test(priority=3)
	  public void three() {
		  System.out.println("Enter credentials");
		  }

}

package TestNGSuite;

import org.testng.annotations.Test;

public class TestNgsuite2 {
	
	
	@Test(priority=4)
	public void four() {
		System.out.println("Click login button and go to home page");
	}
	@Test(priority=5)
	public void five() {
		System.out.println("log out");
	}
	@Test(priority=6)
	public void six() {
		System.out.println("Close Browser");
	}

}

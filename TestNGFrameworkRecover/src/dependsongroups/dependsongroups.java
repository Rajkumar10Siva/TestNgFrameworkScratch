package dependsongroups;

import org.testng.annotations.Test;

public class dependsongroups {
	
	

	@Test(groups = "SmokeTesting")
	public static void smoke1()
	{
		System.out.println("Positive Login functionality code here");
	}
	
	@Test(groups = "SmokeTesting")
	public static void smoke2()
	{
		System.out.println("Positive Registration functionality code here");
	}
	
	@Test(groups = "SmokeTesting")
	public static void smoke3()
	{
		System.out.println("Product page here");
	}
	
	
	@Test(groups="sanity", dependsOnGroups = "SmokeTesting")
	public static void sanity()
	{
		System.out.println("password visibility functionality added here");
	}

}

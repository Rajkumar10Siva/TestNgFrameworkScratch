package AlwaysRunEnable;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Enable {
	
	
	
	@Test(enabled = true)
	public void signup()
	{
		System.out.println("sign up");
	}

	
//	@Test()
//	public void login()
//	{
//		System.out.println("Log in");
//		throw new NoSuchElementException("Element not there");
//	}
//	
//
//	
//	@Test(dependsOnMethods = "AlwaysRunEnable.Alwaysrun.login", alwaysRun = true)
//	public void searchproduct()
//	{
//		System.out.println("Search product");
//	}
//	
//	
//	@Test(description = "This method is used to do the add to cart")
//	public void Addtocart()
//	{
//		System.out.println("Add to cart");
//	}

	
	
}

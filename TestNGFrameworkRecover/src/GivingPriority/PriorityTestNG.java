package GivingPriority;


//Testng tutorial =3


import org.testng.annotations.Test;

public class PriorityTestNG {
	
	//without priority @test will run in alphabetical order or ASCII order
	//If we like to run the @Test as our wish we will give the priority
	//suppose 2 @test ku mattum priority set panrom remaining 3 set panalana,first priority kodukatha 3 @test  alphabetical order la run agum, then priority kodutha @test priority padi run agum.
	//Y ipdi execute aguhtu = ethumae kodukalana athoda priority default value is zero(so apo athana first run agum)
	//priority value negative la kuda kodukalam like -1, -2
	
	

	
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("Log in");
	}
	
	
	@Test(priority=1)
	public void signup()
	{
		System.out.println("sign up");
	}
	
	
	@Test(priority=4)
	public void addTocart()
	{
		System.out.println("addTOcart");
	}

	
	@Test(priority=3)
	public void searchproduct()
	{
		System.out.println("Search product");
	}


	@Test(priority=-1)
	public void signout()
	{
		System.out.println("sign out");
	}
	
	
	@Test(priority=-2)
	public void orderplaced()
	{
		System.out.println("order  placed");
	}
	

}

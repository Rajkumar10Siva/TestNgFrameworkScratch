package DependOnMethod;

import org.testng.annotations.Test;

//Testng tutorial =4


public class DependontestNG {
	

	//Depends on method nu attribute namma kodutha antha @test method run achuna tha atha depend pani iruka method run agum
	//Depend on method failure achuna atha depend pani iruka method skip agidum failure agathu
	//Enfail agathu -  because anthe @test method run ae agathu so it will skip
	//DependsOnmethod epdi failure agum - namma oru exception a manual throw pani check panrom
	//if we give both dependsONMethods and priority attributes, testNg will give high priority to dependsOnMethods. dependsOnMethods base pani tha testNg run agum
	//dependsOnMethods priority ya supress panidum	
	//depends on suppose vera class or vera package la @test iruku atha depend pani pananum na (packagename.classname.methodname) bracket la iruka mari kodukanum
		
		@Test()
		public void signup()
		{
			System.out.println("sign up");
		}
		
		
		@Test(dependsOnMethods="signup")
		public void login()
		{
			System.out.println("Log in");
		}
		
		
		@Test(dependsOnMethods="login")
		public void searchproduct()
		{
			System.out.println("Search product");
		}
		
		
		@Test(dependsOnMethods="searchproduct")
		public void addTocart()
		{
			System.out.println("addTOcart");
			throw new RuntimeException();
		}
		
		
		@Test(dependsOnMethods="addTocart")
		public void signout()
		{
			System.out.println("sign out");
		}

}

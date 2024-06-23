package AlwaysRunEnable;

//Testng tutorial =6


import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Alwaysrun{
	
	//This method tells about the attributes(Always run, Enable and Description).
	//Step 1 - 3 @test run pana porom so 3 methods write panrom
	//Step 2 - Depends on method vechu run pani pakurom
	//Step 3 - Manual a nammalae oru exception create pani, Depends on method vechu run pani pakurom.
	//Step 4 - Exception iruntha entha method la iruko athu fail agi and atha depend pani iruka method skip agum
	//Step 5 - Skip agura method a namma run pani pakanum na apo namma use pana pora attribute than always run.
	//alwaysRun default value is false (boolean)
	//Step 6 - enable - intha attribute kodutha @test vanthu run agathu athu oru @test nu eduthukathu
	//Enable epo use panuvom in real time means - ela timeum namma sign up panitu iruku matom, so oru vati panitu and matha vati atha run pana matom so apo enable koduthukalam
	//Example Smoke test oru vati tha panuvom first build varumothu smoke panitu, second build la smoke panama sanity panuvom antha time la enable = false use panikalam.
	//enable default method is True
	//Interview question - orae @test la enable = false and alwaysRun = true kodutha @test run aguma agatha
	//Answer = enable vanthu always run a supress panidum, so @test run agathu
	//Step 7 = decsription oru @test method la some letters kodutha athu console la print agum, paka easy ya puriyum antha @test ethuku run panrom nu so we use Description
	
	@Test()
	public void signup()
	{
		System.out.println("sign up");
	}

	
	@Test()
	public void login()
	{
		System.out.println("Log in");
		throw new NoSuchElementException("Element not there");
	}
	
	//Depends on method different a kuda try panlam same class and entha class la iruka method run pananumnaalum
	//Ex(@Test(dependsOnMethods ="packagename.classname.methodname)
	
	@Test(dependsOnMethods = "AlwaysRunEnable.Alwaysrun.login",alwaysRun = true )
	public void searchproduct()
	{
		System.out.println("Search protrueduct");
	}
	
	
	//This method is for enable and always run giving in same @test
	//@Test(dependsOnMethods = "AlwaysRunEnable.Alwaysrun.login", alwaysRun = true, enabled = false)
	//public void searchproduct()
	//{
	//	System.out.println("Search product");
	//}
	
	
	
	//This @test is used for Description
	
	@Test(description = "This method is used to do the add to cart")
	public void Addtocart()
	{
		System.out.println("Add to cart");
	}
	
}

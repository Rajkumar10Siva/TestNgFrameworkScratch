package TestNGGroups;
//Testng tutorial =8.2


import org.testng.annotations.Test;

public class TestNGgroups2 {
	
	//This program explains about TestNG groups and it is a attribute
	//Intha program la oru package la iruka oru class la Different test a group pani epdi run panalam
	//Regressiong test la 2 test cases ezutharom na atha mattum epdi run pani paakalam na include use panuvom
	//Syntax = <include name ="Regression test"></include>
	//Regression thavara matha types of test  run pani pakanum na exclude use panuvom
	//Syntax = <exclude name ="Regression test"></exclude>
	// Interview question = Include and exclude la same test type kodutha (regression nu kodutha) ethu run agum - Ans(ethuvum run agathu)
	//include compare panumothu exclude ku preference athigam so atha entha testum run agathu

	 @Test(groups= {"Smoke test"})
	  
	  public void signup() {
		  System.out.println("Smoke Signup successfully");
	  }
	 
	  @Test(groups= {"Regression test"})
	  
	  public void login() {
		  System.out.println("Regression Login successfully");
	  }
	  
	
	  @Test(groups= {"sanity test"})
	  
	  public void searchproduct() {
		  System.out.println("Sanity search  the product code run successfully");
	  }
	  
	  
	  @Test(groups= {"Re test"})
	  
	  
	  public void addToCart() {
		  System.out.println("Re-Test AddtoCart coding run successfully");
	  }
	  
	  
	  @Test(groups= {"Regression test"})
	  
	  public void Payment() {
		  System.out.println("Regression Payment coding run successfully");
	  }
	  
  @Test(groups= {"sanity test"})
	  
	  public void placetheorder() {
		  System.out.println("Sanity place the order code run successfully");
	  }

}

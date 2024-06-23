package Datautils;

import org.testng.annotations.DataProvider;

public class DataUtilss2 {
	
	
@DataProvider(indices = {0,1,2})
	
	//@DataProvider(name = "login", indices = {0,2}, parrallel = true)
	//intha parallel ethuku podrom na namma ena indices kodukaramo parrallel nu pota athaba browser open agi run agum
	//parallel podala  na  koduthu iruka indices one by one a run agum.
	//why DataUtilss2 - 1 la namma @DataProvider la name koduthu irupm, ithala name kodukala so difference kaga	
	//parameters and data provider onna use pannakudathu test case failure tha agum- apdi panna data provider mismtach error varum
 



public String[][] getdata()
	{
		//First bracket respresents rows and 2nd bracket represnts columns
		// why size - 3 - because we write the test for three times for three different data's
		String [][] data = new String[3][2];
		//row 1 and column 1
		data[0][0] = "rkchella17@gmail.com";
		//row 1 column 2
		data [0][1] = "Anjali@143";
		//row 2 column 1
		data [1][0] = "geethraj143@gmail.com";
		//row 1 column 1
		data [1][1] = "Anjali@1710";
		//row 2 column 0
		data [2][0] = "nitishchamp227@gmail.com";
		//row 2 column 1
		data [2][1] = "vijayvj";
		return data;
		//return kodukarthanala void nu method ku name koduthu irupom, return use panrathala String nu use panuvom, so error la mouse vecha String ku change pana solum void a
	}

}

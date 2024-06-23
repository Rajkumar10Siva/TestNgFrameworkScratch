package Dataprovider3;

import org.testng.annotations.DataProvider;

public class ExampleIndices {
	
	
	
	
	
	//@DataProvider(/*name = "logintest",*/ indices = {0,2}/*, parallel = true*/)
	
	
	
	@DataProvider(name = "logintest",parallel = true, indices = {0,1})
	public String[][] getdata()
	{
		//First bracket respresents rows and 2nd bracket represents columns
		//why size - 3 - because we write the test for three times for three different data's
		String [][] data = new String[3][2];
		
		//row 1 and column 1
		data[0][0] = "rkchella17@gmail.com";
		
		//row 1 column 2
		data [0][1] = "Anjali@143";
		
		//row 2 column 1
		data [1][0] = "geethraj143@gmail.com";
		
		//row 2 column 2
		data [1][1] = "Anjali@1710";
		
		//row 3 column 1
		data [2][0] = "nitishchamp227@gmail.com";
		
		//row 3 column 2
		data [2][1] = "vijayvj";
		
		return data;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

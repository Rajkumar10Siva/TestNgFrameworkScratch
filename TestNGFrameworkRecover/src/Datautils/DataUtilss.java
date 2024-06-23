package Datautils;

import org.testng.annotations.DataProvider;

public class DataUtilss {
	
	
	//@DataProvider(indices = {0,1,2}, parallel = true)
	
	@DataProvider(name = "login",parallel = true)
	//DataProvider (parrallel = true) - name kodukamayukm run panalam method name koduthu
	//intha parallel ethuku podrom na namma ena indices kodukaramo parrallel nu pota athana browser open agi run agum
	//parallel podala koduthu iruka indices one by one a run agum.
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

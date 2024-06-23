package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class simpleExample {
	
	
	
	@Parameters({"number1","number2"})
	@Test
	public void print(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	
	
	
	

}

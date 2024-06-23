package TestngInterview;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.ITestAnnotation;

public class TransformerListenerr1 implements IAnnotationTransformer{

	
	//intha program video la pakalam  - yen?
	//Implement pana udanae last program mari add unimplement methods option varanum, varatathala namma video la pathukalam.
	//Finally answer founded
	//Right click the class and select source and select override/unimplemented method select the first method and click okay
	
	
	
//	@Override
//	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
//			Method testMethod) {
//		// TODO Auto-generated method stub
//		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
//	}



	
	  @Override 
	  public void transform(ITestAnnotation annotation, Class testClass,Constructor testConstructor, Method testMethod)
	  
	  {
	  annotation.setRetryAnalyzer(RetryListnerr1.class);
	  }
	 
	
}

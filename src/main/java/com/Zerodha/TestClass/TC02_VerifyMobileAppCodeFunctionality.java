package com.Zerodha.TestClass;


import org.testng.Assert;
import org.testng.annotations.Test;

import TestNG.TestBaseClass;

public class TC02_VerifyMobileAppCodeFunctionality extends TestBaseClass {
	
	
	

	@Test
	public void VerifyMobileAppCodeFunctionality()
	{
		
		    System.out.println("Apply the Validation");
		      
		

		    String expectedUrl = "https://kite.zerodha.com/";    //dev/BA	
		
		
		    String actualUrl = driver.getCurrentUrl();
		    System.out.println(actualUrl);
		   
		   
		    Assert.assertEquals( expectedUrl, actualUrl );
		 
		
		
	}
	
	
	
	
	

}

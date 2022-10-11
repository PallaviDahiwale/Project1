package com.Zerodha.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestNG.TestBaseClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass {
	
	@Test
	public void VerifyLoginZerodhaFunctionality()
	{
		
		    System.out.println("Apply the Validation");
		      
		

		    String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";    //dev/BA	
		
		
		    String actualTitle = driver.getTitle();
		   
		   
		    Assert.assertEquals( expectedTitle, actualTitle );
		 
		
		
	}
	
	        
	
}

package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.POMCLASS.Pom_Class_NIHPAGE;

public class PageObjectManager {
	
      public  WebDriver driver;
      private Pom_Class_NIHPAGE BMICalculation ;
      
	  public WebDriver getDriver() 
	  {
		return driver;
	  }

	public Pom_Class_NIHPAGE getInstanceBMICalculation() 
	{    
		BMICalculation  =new Pom_Class_NIHPAGE(driver);
		
		return BMICalculation;
	}
	public  PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	
	}}
	
   
	
	
	
	




package com.NIH_TestRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.BaseMethods.BaseClassMethods;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//FeatureFile"},
                     glue = "com.NIH_stepdefinition",
                    // dryRun= false,
                 plugin= {"html:target/TestOutput/cucumber.html","pretty"})
                 
   
public class Test_Runner extends BaseClassMethods  {
	public static WebDriver driver;
	
  @BeforeClass
	public static void set_up() throws Throwable{
		   driver=BaseClassMethods.browserLaunch();
		   Thread.sleep(2000);
	}
  
 @AfterClass
	public static void tear_Down() throws Throwable{
		//BaseClassMethods.PrintScreen();
		Thread.sleep(2000);
		BaseClassMethods.close();

		System.out.println("successfully BMI Calculated using Standard Measurement in NIH application");
		}	
	}
	
			
	
		



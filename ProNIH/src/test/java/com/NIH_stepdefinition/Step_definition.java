package com.NIH_stepdefinition;

import org.openqa.selenium.WebDriver;

import com.BaseMethods.BaseClassMethods;
import com.NIH_TestRunner.Test_Runner;
import com.PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition extends BaseClassMethods {

	public static WebDriver driver = Test_Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User open URL {string}")
	public void user_open_url(String string) {
		LaunchUrl(string);
	}

	@When("User click on measurement as Standard")
	public void user_click_on_measurement_as_standard() {

		Click(pom.getInstanceBMICalculation().getStandard());
		
	}
	@When("User enter the Height {int} as feet in height field")
	public void user_enter_the_height_as_feet_in_height_field(Integer int1) {
		String valueOf = String.valueOf(int1);
		sendKeys(pom.getInstanceBMICalculation().getFeetfield(),valueOf);
	   
    }
	@When("User enter the Height {int} as inches in height field")
	public void user_enter_the_height_as_inches_in_height_field(Integer int1) {
		String valueOf = String.valueOf(int1);
		sendKeys(pom.getInstanceBMICalculation().getInchesfield(),valueOf);

	}
	@When("User enter the Weight {int} in Weight field")
	public void user_enter_the_weight_in_weight_field(Integer int1) {
		String valueOf = String.valueOf(int1);
		sendKeys(pom.getInstanceBMICalculation().getWeight(),valueOf);

	}
   @Then("User click on COMPUTE BMI button")
	public void user_click_on_compute_bmi_button() {
	   Click(pom.getInstanceBMICalculation().getComputeBMIbutton());

	}
	
	
	

}

package com.POMCLASS;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class_NIHPAGE {
	
	 public WebDriver driver;
	 
		@FindBy(xpath="//img[@alt='Standard Measurements']")
		private WebElement standard;
		@FindBy(id="height_feet")
		private WebElement feetfield;
		@FindBy(id="height_inches")
		private WebElement inchesfield;
		@FindBy(name="wt")
		private WebElement Weight;
        @FindBy(id="calcbmi")
		private WebElement computeBMIbutton;
        
		
		public WebDriver getDriver() {
			return driver;
		}
		
       public WebElement getStandard() {
			return standard;
		}
       
       public WebElement getFeetfield() {
			return feetfield;
		}

		public WebElement getInchesfield() {
			return inchesfield;
		}

		public WebElement getWeight() {
			return Weight;
		}

		public WebElement getComputeBMIbutton() {
			return computeBMIbutton;
		}
   public  Pom_Class_NIHPAGE (WebDriver driver2) {
	
	this.driver=driver2;
	
	PageFactory.initElements(driver2,this);
}}

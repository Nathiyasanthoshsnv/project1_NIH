package com.BaseMethods;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassMethods {
	
	public static WebDriver driver;
	public static Robot r;
	
	// 1)Launching Browser:
	public static WebDriver browserLaunch()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nathiya\\Project\\NIH_APPLICATION_PROJECT\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		return driver;
		
	}	
		           //***WEB DRIVER METHODS***
	// 2)Closing the Browser:
		public static void close()
		{	
		driver.close();
	
		}
	
   // 3)quite the Browser:
		public static void Quit()
		{	
		driver.quit();
		}
	// 4)navigate To:
		public static void navigateTo(String Url)
		{	
		driver.navigate().to(Url);
		}
   // 5) navigate back:
		public static void navigateBack()
		{	
		driver.navigate().back();
		}
   // 6) navigate forward:
		public static void navigateForward()
		{	
		driver.navigate().forward();
		}
	// 7) navigate refresh:
		public static void navigateRefresh()
		{	
		driver.navigate().refresh();
		}
	// 8) get Or Launch the site:
	    public static void LaunchUrl(String Url)
	    {	
        driver.get(Url);
	    }		
	// 9) get the Title:
	    public static void getTitle()
		{	
	      String T= driver.getTitle();
		  System.out.println("The title is:"+T);
		}	
	// 10) get CurrentUrl:
		public static void getCurrentUrl()
	    {	
		  String CU=driver.getCurrentUrl();
		  System.out.println("The CurrentUrl is:"+CU);
		}	
					
	                      //  ***WEB ELEMENT METHODS***
	//11) sendKeys():	
	   public static void sendKeys(WebElement send,String number)
	   {	
	     send.sendKeys(number);
	   }	
   //12) click():	
	   public static void Click(WebElement click11)
	    {	
	       click11.click();
	    }	
			
	// 13) getAttribute:
		public static void getAttribute(WebElement attri,String attribute)
		{	
		    String A=attri.getAttribute(attribute);
		    System.out.println("The Attribute is:"+A);		
		}	
	
   // 14) get the Text() :
		public static void getText(WebElement text)
		{ 
			String TX=text.getText();
		    System.out.println("The text of element is:"+TX);
		}	
	
    // 15) isEnabled():	
		public static void checkenable(WebElement enable)
		{	
		  if(enable.isEnabled())
		   {
			 System.out.println("The element is Clickable Or Editable");	
		   }
		  else 
		   {
		      System.out.println("The element is not Clickable Or Editable");	
		   }	
        }	
	// 16) isDisplayed():		
		public static void checkdisplay(WebElement display)
		{	
		   if(display.isDisplayed())
		    {
			    System.out.println("The element is visible");	
		    }
		   else 
		    {
		        System.out.println("The element is not visible");	
		    }	
        }	
   // 16) isSelecteded():		
		public static void checkselect(WebElement select)
		{	
			 if(select.isSelected())
			 {
				System.out.println("The element can be Selected");	
			 }
			 else 
			 {
			    System.out.println("The element cannot be Selected");	
			 }	
	     }	
	
	                      //***DROPDOWN***
     // 17) Single DropDown() :
		public static void singledrop(WebElement Single,String words)
		{	
		    Select S=new Select(Single);
		    S.selectByValue(words);
		}	
	
		public static void Multipledrop(WebElement Multiple,int index,String value)
		{	
		    Select S1=new Select(Multiple);
		    S1.selectByIndex(index);
		    S1.selectByValue(value);
		    
		}	
		           //  ***MULTIPLE DROPDOWN METHODS***
    // 18) isMultiple():		
		public static void checkMultiple(WebElement Multiple,int index,String value)
		{	
			Select S3=new Select(Multiple);
			S3.selectByIndex(index);
		    S3.selectByValue(value);
		    	
		 if(S3.isMultiple())
				{
					System.out.println("Multiple Options Selected");	
			    }else 
			    {
					System.out.println("Multiple Options cannot be Selected");	
			    }	
		}		
	
	
	 // 19) getOptions():		
		public static void getOptions(WebElement getOpt)
		{	
			Select S4=new Select(getOpt);
			List<WebElement>alloptions=S4.getOptions();
			System.out.println("ALL OPTIONS");
	        for(WebElement opt1:alloptions)
	          {
	           System.out.println(opt1.getText());	
	          }
	    }
	// 20) getFirstSelectedOptions():		
		public static void getFirstSelectedOption(WebElement getfirst)
		{	
			 Select S5=new Select(getfirst);
			 WebElement firstoption=S5.getFirstSelectedOption();
			 System.out.println("FIRST SELECTED OPTION");
			 System.out.println(firstoption.getText());
			 
			}
	// 21) getAllSelectedOptions():		
		public static void getAllSelectedOptions(WebElement getAll)
			{	
			Select S6=new Select(getAll);
			List<WebElement>allseleOpt=S6.getOptions();
			System.out.println("ALL SELECTED OPTIONS");
			for(WebElement allopt:allseleOpt)
		       {
			    System.out.println(allopt.getText());	
			   }
		   }
	
	                 //***SCREENSHOT***
	// 22) Screenshot():
		public static void PrintScreen() throws Throwable
		{	
	      TakesScreenshot TS=(TakesScreenshot)driver;
	      File Source=TS.getScreenshotAs(OutputType.FILE);
	      File Destination=new File("C:\\Users\\Nathiya\\Project\\MavenPro\\screenshot//SS.png");
	      FileUtils.copyFile(Source,Destination);
	      }
		
		
	                  
					//***SCROLL UP & DOWN***:	
		
	// 22) Based on pixels():	
		public static void scrolldownORup()
		{
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("Window.scrollBy()","");
		}
		
    // 22) to scroll bottom of the height():	
		public static void scrolltoheight(int index)
		{
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("Window.scrollTo(index,document.body.scrollHeight)","");
		}
    // 22) Return to starting page():							
		public static void scrolltoreturnpage(int index,int index1)
		{
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("Window.scrollBy(index,index1)","");
		}
				
    // 22) Based on WebElement()		
		public static void scrolltheWebpage(WebElement String)
		{
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].ScrollIntoView()",String);
		}
		
		
		              //***WAIT***	
	//Wait():
		public static void waitmethod()throws InterruptedException
		{
		 Thread.sleep(2000);
	    }
		
    //23)implicit wait():
		public static void implicitwait(int time)
		{
		 driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS) ;
		}
                    //***WINDOW HANDLES***
   //24)getWindowHandle():	
      public static void getwindowhandle()
         {
    	      String Handle=driver.getWindowHandle();
	          String title=driver.switchTo().window( Handle).getTitle();
	          System.out.println("Current Window title is"+title);
         }		  
  //24)getWindowHandles():	     		  
	   public static void getwindowhandles()
	    {
	       Set<String>Handles=driver.getWindowHandles();
	       System.out.println("Titles of all open Windows");
           for(String id:Handles)
              {
                String title=driver.switchTo().window(id).getTitle();
                System.out.println(title);
              }	
	    }

   //use break:
	 public static void getWHSusebreak(String titlename)
	   {
	        Set<String>Handles2=driver.getWindowHandles();
	       
            for(String id1:Handles2)
               {
               	if(driver.switchTo().window(id1).getTitle().equals(titlename))
               	{
               		break;
               	}
	           }
	        }

                            // ***ACTIONS CLASS***
    //24)ContextClick():	 
	      public static void ContextClick(WebElement elementname1)
	       {
             Actions ac1=new Actions(driver);
             ac1.contextClick(elementname1).build().perform();
	       }

	//24)doubleClick():
	      public static void doubleClick(WebElement elementname2)
	       {
             Actions ac2=new Actions(driver);
             ac2.doubleClick(elementname2).build().perform();
	       }
   //24)moveToElement():
	      public static void moveToElement(WebElement elementname3)
	       {
          Actions ac3=new Actions(driver);
          ac3.moveToElement(elementname3).build().perform();
	       }
  //24)click and Hold():
	     public static void clickandHold(WebElement elementname4)
	       {
              Actions ac4=new Actions(driver);
              ac4.moveToElement(elementname4).build().perform();
	       }
  //24)dragandDrop():
	    public static void draganddrop(WebElement dragname,WebElement dropname)
	       {
             Actions ac5=new Actions(driver);
             ac5.dragAndDrop(dragname, dropname).build().perform();
	       }
   //24)release():	      
	    public static void release(WebElement elementname)
	       {
              Actions ac6=new Actions(driver);
              ac6.release(elementname).build().perform();
	       }	      
	      
	                  // ***ROBOT CLASS***
	      
    //25)keyboard Events():
	    public static void robot() throws AWTException
	    {
           r=new Robot();
	    }
        public static void KeyPress_down()
        {
          r.keyPress(KeyEvent.VK_DOWN);
	    }
        public static void KeyPress_up()
        {
          r.keyPress(KeyEvent.VK_UP);
	    }
        public static void KeyRelease_down()
        {
          r.keyRelease(KeyEvent.VK_DOWN);
	    }
        public static void KeyRelease_up()
        {
          r.keyRelease(KeyEvent.VK_UP);
	    }
        public static void KeyPress_enter()
        {
          r.keyPress(KeyEvent.VK_ENTER);
	    }
        public static void KeyRelease_enter()
        {
          r.keyRelease(KeyEvent.VK_ENTER);
	    }
	               // ***ALERT***
 //  26) Alert Handling
//       Simple AND Confirm Alert:
        public static void alerthandling(String Alerttype) {
        	Alert alert = driver.switchTo().alert();
        	
        	if (Alerttype.equalsIgnoreCase("accept")) {
        		alert.accept();
        	}
        	else if (Alerttype.equalsIgnoreCase("dismiss")) {
        		alert.dismiss();
        	}	
        }

//      Prompt alert:
        public static void Prompt_Alert(String keysToSend) {
         Alert PA = driver.switchTo().alert();
        	PA.sendKeys(keysToSend);
        	PA.accept();
        }

    
	    
	    
	                     // ***FRAMES***

		//27)Frames:
		       
	    public static void Frames(WebElement element )
	    {
	    	
	        driver.switchTo().frame(element);
	        
	    } 
	   
	          
	          
	             // ***CHECK BOX***

	  //28) check box():	
		   public static void Checkbox(WebElement option1,WebElement option2)
		    {	
		       option1.click();
		       
		       option2.click();
		       
		       
		    } 
	      

	
		            // ***RADIO BUTTON***
	 //29) Radio button():
		   public static void Radiobutton(WebElement oneoption)
		    {	
		       oneoption.click();
		    } 
	      
	
	
	}
	      
	
	



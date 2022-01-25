package support;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;


public class Seleniumoperation
{
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	public static WebDriver driver=null;
	public static ConfigReader config=null;
	
   //browserLaunch	
	public static Hashtable<String,Object> browserlaunch(Object[]inputparameter)
	{
		try {
		
		String strbrowsername=(String) inputparameter[0];
		
	   
	    
	    config=new ConfigReader();
	 if(strbrowsername.equalsIgnoreCase("Chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
		 
	 }else if(strbrowsername.equalsIgnoreCase("Firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
	 }
	 
	 outputparameters.put("STATUS", "PASS");
	 outputparameters.put("MESSAGE", "Methodused: browserlaunch,Input_Data :" + inputparameter[0].toString());
	 }catch(Exception e)
		{
		 outputparameters.put("STATUS", "FAIL");
		 outputparameters.put("MESSAGE", "Methodused:browserlaunch,Input_Data : "+ inputparameter[0].toString());
		 }
		return outputparameters;
		}
			
	//openApllication
	 
	 public static Hashtable<String,Object> Openapplication()
	 {
		 try {
			
		 
		 driver.get(config.getApplicationUrl());
		 driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
		 outputparameters.put("STATUS", "PASS");
		 outputparameters.put("MESSAGE", "Methodused:openapplication,Input_Data :" + config.getApplicationUrl().toString());
		 
		 }catch(Exception e)
		 {
			 outputparameters.put("STATUS", "FAIL");
			 outputparameters.put("MESSAGE", "Methodused:openapplication,Input_Data : "+ config.getApplicationUrl().toString());
		 }
		 return outputparameters;
		 }
	 
	 //Click on Element
	 public static Hashtable<String,Object> Clickonelement(Object[]inputparameter)
	 {
		 try {
		String xpath=(String) inputparameter[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
		
		 outputparameters.put("STATUS", "PASS");
		 outputparameters.put("MESSAGE", "Methodused:clickonelement,Input_Data :" + inputparameter[0].toString());
		
		 }catch(Exception e)
		 
		 {
			 outputparameters.put("STATUS", "FAIL");
			 outputparameters.put("MESSAGE", "Methodused:clickonelement,Input_Data : "+ inputparameter[0].toString());
		 }
		 return outputparameters;
		 }
	 
	 //Move over Element
	  public static Hashtable<String,Object> Movetoelement(Object[]inputparameter)
	  {
		  try {
		  
			  String xpath=(String) inputparameter[0];
			  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
		Actions act = new Actions(driver);
		WebElement element=driver.findElement(By.xpath(xpath));
		act.moveToElement(element).build().perform();
		 outputparameters.put("STATUS", "PASS");
		 outputparameters.put("MESSAGE", "Moveonelement,Input_Data :" + inputparameter[0].toString());
	  }catch(Exception e)
		  {
		     outputparameters.put("STATUS", "FAIL");
			 outputparameters.put("MESSAGE", "Methodused:Moveonelement,Input_Data : "+ inputparameter[0].toString());
		  }
		  return outputparameters;
		  }
	  //Providing Sendkeys
	  public static Hashtable<String,Object> Sendkeys(Object[]inputparameter)
	  {
		  
		  try {
		String xpath=(String) inputparameter[0]; 
		String xpath1=(String) inputparameter[1];
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
	    WebElement pass=driver.findElement(By.xpath(xpath));
	    
	    pass.sendKeys(xpath1);
	     outputparameters.put("STATUS", "PASS");
		 outputparameters.put("MESSAGE", "Methodused:providing username,Input_Data :" + inputparameter[1].toString());
	    }catch(Exception e)
		  
		  {
	    	 outputparameters.put("STATUS", "FAIL");
			 outputparameters.put("MESSAGE", "Method: Providing username ,Input_Data : "+ inputparameter[1].toString());
	    	
		  }return outputparameters;
	  }
	  
	  //Create if else method
	
	  public static Hashtable<String,Object> gettingtext(Object[]inputparameter)
	  
	  {		  
		  try
		  {
			  
			  String giventext=(String) inputparameter[0];
			  String xpath= (String) inputparameter[1];
			  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS );
			  String result=driver.findElement(By.xpath(xpath)).getText();
			  
			  if(giventext.equalsIgnoreCase(result))
			 
					  {
				          System.out.println("Test case is passed");
					  }else
						  
					  {
						  System.out.println("Test case failed");
					  }
			      outputparameters.put("STATUS", "PASS");
				  outputparameters.put("MESSAGE", "Methodused:validation,Input_Data :" + inputparameter[0].toString()); 
		  }catch (Exception e)
		  {
			  outputparameters.put("STATUS", "FAIL");
			  outputparameters.put("MESSAGE", "Methodused:validation,Input_Data :" + inputparameter[0].toString());
			  
		  }
		  return outputparameters;
		  
	  }
	  //MAIN METHOD 
	  
	public static void main(String[] args) 
	{
		//Openbrowser
		
		Object [] input=new Object [2];
		
		input[0]="Chrome";
		
		browserlaunch(input);
		
		
		//OpenApplication
		
		Object []input1=new Object[1];
		input1[0]="https://www.flipkart.com/";
		Openapplication();
		
		
		//Click on Element
		
		Object []input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Clickonelement(input2);
		
		
		//Move on Elements
		
		Object[] input3=new Object[1];
		
		input3[0]="//*[@class=\"_1_3w1N\"]";
		
		Movetoelement(input3);
		
		//click on username 
		
		Object[]input4=new Object[1];
		
		input4[0]="//*[text()='My Profile']";
		
		Clickonelement(input4);
		
		 //Providing username by send keys
		
		Object[]input5 =new Object[2];
		
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]="Swapnilp9529@gmail.com";
		
		Sendkeys(input5);
		
		//Providing password by Sendkeys Method
		
		Object[] input6=new Object[2];
		
		input6[0]="//*[@type='password']";
		
		input6[1]="9762589258";
		
		Sendkeys(input6);
		
		//click on Login button 
		
		Object[] input7= new  Object[1];
		
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		
		Clickonelement(input7);		
		
		// Validation step
		
		Object[] input8 = new Object[2];
		
		input8[0]="Swapnil Pansare";
		input8[1]="//*[text()='Swapnil  Pansare']";
		gettingtext(input8);			
}
	}




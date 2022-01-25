package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Seleniumoperation;
import utility.HTMLReportGenerator;

public class Login 

{
	@Given("^user open \"(.*)\" browser$")
	public void user_open_browser(String bname) throws Throwable 

{
Object [] input=new Object [1];
	
	input[0]=bname;
	

	Seleniumoperation.browserlaunch(input);
    
}

	@Given("^user open url$")
	public void user_open_url() throws Throwable 
	

{   
	Seleniumoperation.Openapplication();
}

@When("^user click on cancel button$")
public void user_click_on_cancel_button() throws Throwable 
{
	Object []input2=new Object[1];
	input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	Hashtable<String,Object> output=	Seleniumoperation.Clickonelement(input2);    
	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user click on cancel button", output.get("MESSAGE").toString());   
}

@When("^user move on login dropdown$")
public void user_move_on_login_dropdown() throws Throwable 
{
	Object[] input3=new Object[1];
	
	input3[0]="//*[@class=\"_1_3w1N\"]";
	
	Hashtable<String,Object> output3=Seleniumoperation.Movetoelement(input3);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user move on login dropdown", output3.get("MESSAGE").toString());
    
}

@When("^user able to click My profile$")
public void user_able_to_click_My_profile() throws Throwable 

{
Object[]input4=new Object[1];
	
	input4[0]="//*[text()='My Profile']";
	
	Hashtable<String,Object> output4=Seleniumoperation.Clickonelement(input4);
	HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user able to click My profile", output4.get("MESSAGE").toString());

	
}

@When("^user enter \"([^\"]*)\" as username$")
public void user_enter_as_username(String String) throws Throwable 
{
Object[]input5 =new Object[2];
	
	input5[0]="//*[@class='_2IX_2- VJZDxU']";
	input5[1]=String;
	Hashtable<String,Object> output5=Seleniumoperation.Sendkeys(input5);
	HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as username", output5.get("MESSAGE").toString());
}

@When("^user enter password as\"([^\"]*)\"as password$")
public void user_enter_password_as_as_password(String String) throws Throwable 
{
Object[] input6=new Object[2];
	
	input6[0]="//*[@type='password']";
	
	input6[1]=String;
	
	Hashtable<String,Object> output6=Seleniumoperation.Sendkeys(input6);
	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter password as {string} as password", output6.get("MESSAGE").toString());
}

@When("^user click on login button$")
public void user_click_on_login_button() throws Throwable
{
Object[] input7= new  Object[1];
	
	input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
	
	Hashtable<String,Object> output7=Seleniumoperation.Clickonelement(input7);
	HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user click on login button", output7.get("MESSAGE").toString());

}

@Then("^Application shows user profile$")
public void application_shows_user_profile() throws Throwable 
{
    
Object[] input8 = new Object[2];
	
	input8[0]="Swapnil Pansare";
	input8[1]="//*[text()='Swapnil  Pansare']";
	Hashtable<String,Object> output8 =Seleniumoperation.gettingtext(input8);
	HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "Application shows user profile", output8.get("MESSAGE").toString());

}
	
	

}



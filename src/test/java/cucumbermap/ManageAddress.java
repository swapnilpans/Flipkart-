package cucumbermap;
import java.util.Hashtable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.Seleniumoperation;
import utility.HTMLReportGenerator;

public class ManageAddress 
{
@When("^user click on Manage addresses$")
public void user_click_on_Manage_addresses() throws Throwable 
{     Object[] input= new  Object[1];
	
	input[0]=   "//*[text()='Manage Addresses']";
	Hashtable<String,Object> output=Seleniumoperation.Clickonelement(input);
	HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user click on Manage addresses$", output.get("MESSAGE").toString()); }

@When("^user click on Add a new address$")
public void user_click_on_Add_a_new_address() throws Throwable

{    Object[] input1= new  Object[1];
	
	input1[0]=   "//*[@class='_1QhEVk']";
	
	Hashtable<String,Object> output1=Seleniumoperation.Clickonelement(input1);
	HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^user click on Manage addresses$", output1.get("MESSAGE").toString());}

@When("^user enter \"([^\"]*)\" as a name$")
public void user_enter_as_a_name(String String) throws Throwable

{   Object[]input2 =new Object[2];

input2[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
input2[1]=String;
Hashtable<String,Object> output2=Seleniumoperation.Sendkeys(input2);
HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user enter \"([^\"]*)\" as a name$", output2.get("MESSAGE").toString());  }
	
	
@When("^user enter \"([^\"]*)\" as mobile number$")
public void user_enter_as_mobile_number(String String) throws Throwable

{   Object[]input3 =new Object[2];

	input3[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
	input3[1]=String;
	Hashtable<String,Object> output3=Seleniumoperation.Sendkeys(input3);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user enter \"([^\"]*)\" as mobile number$", output3.get("MESSAGE").toString());}
	

@When("^user enter \"([^\"]*)\" as pincode$")
public void user_enter_as_pincode(String String) throws Throwable 

{  Object[]input4 =new Object[2];

input4[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
input4[1]=String;
Hashtable<String,Object> output4=Seleniumoperation.Sendkeys(input4);
HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user enter \"([^\"]*)\" as pincode$", output4.get("MESSAGE").toString());}
    

@When("^user enter \"([^\"]*)\" as Locality$")
public void user_enter_as_Locality(String String) throws Throwable 

{    Object[]input5 =new Object[2];

	input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
	input5[1]=String;
	Hashtable<String,Object> output5=Seleniumoperation.Sendkeys(input5);
	HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"([^\"]*)\" as Locality$", output5.get("MESSAGE").toString());}
    


@When("^user enter \"([^\"]*)\" as address$")
public void user_enter_as_address(String String) throws Throwable 

{   Object[]input6 =new Object[2];
	input6[0]="//*[@name='addressLine1']";
	input6[1]=String;
	Hashtable<String,Object> output6=Seleniumoperation.Sendkeys(input6);
	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"([^\"]*)\" as address$", output6.get("MESSAGE").toString());}
	
@When("^user enter \"([^\"]*)\" as Loaclity$")
public void user_enter_as_Loaclity(String String) throws Throwable

{  Object[]input7 =new Object[2];
input7[0]="//*[@name='landmark']";
input7[1]=String;
Hashtable<String,Object> output7=Seleniumoperation.Sendkeys(input7);
HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user enter \"([^\"]*)\" as Loaclity$", output7.get("MESSAGE").toString());}
	
@When("^user enter \"([^\"]*)\" as Alternate phone$")
public void user_enter_as_Alternate_phone(String String) throws Throwable 
{  Object[]input8 =new Object[2];
	input8[0]="//*[@name='alternatePhone']";
	input8[1]=String;
	Hashtable<String,Object> output8=Seleniumoperation.Sendkeys(input8);
	HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user enter \"([^\"]*)\" as Alternate phone$", output8.get("MESSAGE").toString());}
		
@When("^user select Home as a aadress type$")
public void user_select_Home_as_a_aadress_type() throws Throwable 

{  Object[] input9= new  Object[1];
	input9[0]=   "//*[@class='_1XFPmK']";
	Hashtable<String,Object> output9=Seleniumoperation.Clickonelement(input9);
	HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^user select Home as a aadress type$", output9.get("MESSAGE").toString());}
	
@When("^user click on save button$")
public void user_click_on_save_button() throws Throwable 

{    Object[] input10= new  Object[1];
	
	input10[0]=   "//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
	
	Hashtable<String,Object> output10=Seleniumoperation.Clickonelement(input10);
	HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^user select Home as a aadress type$", output10.get("MESSAGE").toString());}
   
@Then("^application shows new address added successfully$")
public void application_shows_new_address_added_successfully() throws Throwable 
{
Object[] input11 = new Object[2];
	input11[0]="Swapnil Pansare";
	input11[1]="//*[text()='Swapnil Pansare']";
	Hashtable<String,Object> output11 =Seleniumoperation.gettingtext(input11);
	HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^application shows new address added successfully$", output11.get("MESSAGE").toString());    
}
}
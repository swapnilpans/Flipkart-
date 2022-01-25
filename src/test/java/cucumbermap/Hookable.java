package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	
@Before
public void beforeMethod(Scenario scenario) throws UnknownHostException

{   
	HTMLReportGenerator.TestSuiteStart("D:\\ProjectFinal22012022\\Flipkart\\target\\projectreport\\Flipkart.html", "Flipkart");
	HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
	
	System.out.println("------------------------Scenario Start------------------------");
	
}

@After 
	
public void afterMethod(Scenario scenario)

{
	System.out.println("------------------------Scenario End------------------------");
	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
}
}

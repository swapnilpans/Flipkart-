package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

(
		features="src/test/resources/BusinessLogic/ManageAddress.feature",
		glue="cucumbermap",
		tags="@SmokeTest",
		plugin="pretty",
		monochrome=true
		
		
		)

public class TestRunner {

}

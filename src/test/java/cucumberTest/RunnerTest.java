package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/info.json"},
		features = {"src/test/resources/features"},
		glue = {"src/test/java/stepDefinition"}
		//tags = {"@tc1"}
		)



public class RunnerTest {

}

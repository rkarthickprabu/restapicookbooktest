package stepDefinition;

//import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/info.json"},
		features = {"src/test/resources/features"}
		//glue = {"restapicookbooktest/src/test/java/stepDefinition"},
		//tags = {"@tc1, @tc2"}
		)

public class RunnerTest {

	@Test
	public void test() {
		System.out.println("JUnit test");
		//fail("Not yet implemented");
	}

}


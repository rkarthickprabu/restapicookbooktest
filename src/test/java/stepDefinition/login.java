package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver = new FirefoxDriver();

	@Given("^User is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
		driver.get("http://localhost:9340/serverengine/html/cookbook/index.html");
	}

	@When("^User navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Throwable {
		driver.findElement(By.linkText("Authenticating with the Connect Server")).click();
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window
															// handles

		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
	}

	@When("^enters correct username$")
	public void enters_correct_username() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^enters correct password$")
	public void enters_correct_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^clicks Submit$")
	public void clicks_Submit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Login successful message is displayed$")
	public void login_successful_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^an Authorization token is displayed$")
	public void an_Authorization_token_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^enters incorrect username and password$")
	public void enters_incorrect_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Authentication failed message is displayed$")
	public void authentication_failed_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^clicks Submit without entering any credentials for username and password$")
	public void clicks_Submit_without_entering_any_credentials_for_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^'Please fill in this field' error tooltip should be displayed$")
	public void please_fill_in_this_field_error_tooltip_should_be_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}

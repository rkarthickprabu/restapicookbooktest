package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import pageObject.HandshakeTestPage;
import pageObject.HomePage;

public class Handshake {

	WebDriver driver = new FirefoxDriver();
	HomePage homePage;
	HandshakeTestPage handshakeTestPage;
	String winHandleBefore;
	
	@Given("^Im probably on the homepage$")
	public void i_m_on_the_homepage() throws Throwable {
		homePage = new HomePage(driver);
		homePage.navigateToWebApp();  
	}

	@When("^I navigate to the handshake page$")
	public void i_navigate_to_the_handshake_page() throws Throwable {		
		// Store the current window handle
		winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		handshakeTestPage = homePage.navigateToHandShakeTestPage();		
	}
	
	@And("^click Submit button$")
	public void click_Submit() throws Throwable {
		
		handshakeTestPage.submitForm();
	}

	@Then("^Result for Handshake is displayed$")
	public void result_for_handshake_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.getPageSource().contains("Server Engine REST Service available: AuthenticationRestService");

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}
}

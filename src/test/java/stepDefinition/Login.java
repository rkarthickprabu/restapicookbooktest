package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.AuthenticationPage;
import pageObject.HomePage;

public class Login {
	
	WebDriver driver = new FirefoxDriver();
	HomePage homePage;
	AuthenticationPage authenticationPage;
	String winHandleBefore;
	
	@Given("^Im on the homepage$")
	public void i_m_on_the_homepage() throws Throwable {
		homePage = new HomePage(driver);
		homePage.navigateToWebApp();
	   
	}

	@When("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {		
		// Store the current window handle
		winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		authenticationPage = homePage.navigateToAuthenticationPage();		
		
	}

	@And("^enter ([^\"]*)$")
	public void enter(String value) throws Throwable {
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		Thread.sleep(5000);
		authenticationPage.setUsernameField(value);
	}
	
	@And("^password ([^\"]*)$")
	public void password(String password) throws Throwable {
				authenticationPage.setPasswordField(password);

	}

	@And("^click Submit$")
	public void click_Submit() throws Throwable {
		
		authenticationPage.submitForm();
	}

	@Then("^Result for Login is displayed$")
	public void result_for_Login_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		driver.getPageSource().contains("Authenticated Successfully");
		// Close the new window, if that window no more required
		//driver.close();

		
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)
		driver.close();
	}



}

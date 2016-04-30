package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import pageObject.UploadingDesigntemplatePage;

public class UploadDesigntemplate {
	WebDriver driver = new FirefoxDriver();
	HomePage homePage;
	UploadingDesigntemplatePage uploadingDesigntemplate;
	String winHandleBefore;

	
@Given("^on homepage$")
	public void on_homepage() throws Throwable {
		homePage = new HomePage(driver);
		homePage.navigateToWebApp();
		
	}
	
@When("^I click on Upload Design template$")
public void i_click_on_Upload_Design_template() throws Throwable {
	winHandleBefore = driver.getWindowHandle();
	uploadingDesigntemplate = homePage.navigateToUploaddesigntemplate();
	
	
}


@And("^upload the template$")
public void upload_the_template() throws Throwable {
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window
	Thread.sleep(500);	
	uploadingDesigntemplate.testUploadingDesigntemplate();
}

@And("^Click Submit$")
public void click_Submit() throws Throwable {
	driver.findElement(By.id("submit")).click();
}

@Then("^Template Managed File ID is displayed$")
public void template_Managed_File_ID_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

	
	
	
	
	
	
	
	
	
	

}

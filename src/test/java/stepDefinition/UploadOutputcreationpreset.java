package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import pageObject.UploadingOutputcreationpresetPage;

public class UploadOutputcreationpreset {
	
	WebDriver driver = new FirefoxDriver();
	String winHandleBefore;
	HomePage homePage;
	UploadingOutputcreationpresetPage uploadingOutputcreationpreset;

@Given("^homepage$")
public void homepage() throws Throwable {

	homePage = new HomePage (driver);
	homePage.navigateToWebApp();

}

@When("^I click on Upload a Output Creation preset$")
public void i_click_on_Upload_a_Output_Creation_preset() throws Throwable {
    winHandleBefore = driver.getWindowHandle();
    uploadingOutputcreationpreset = homePage.navigateToUploadOutputcreationpreset();

}

@And("^upload the OC preset$")
public void upload_the_OC_preset() throws Throwable {
	 for(String winHandle : driver.getWindowHandles()){
		 driver.switchTo().window(winHandle);
	 }
		Thread.sleep(500);
		uploadingOutputcreationpreset.testUploadingOutputcreationpreset();
		
	}


@And("^click on the Submit button$")
public void click_on_the_Submit_button() throws Throwable {
	driver.findElement(By.id("submit")).click();

}

@Then("^Managed File ID for OC is displayed$")
public void managed_File_ID_for_OC_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions


}

	
}

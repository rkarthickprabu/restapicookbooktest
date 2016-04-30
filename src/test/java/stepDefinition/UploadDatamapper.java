package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import pageObject.UploadingDatamapperPage;

public class UploadDatamapper {

//	public UploadDatamapper() {
//		// TODO Auto-generated constructor stub
//	}


	WebDriver driver = new FirefoxDriver();
	HomePage homePage;
	UploadingDatamapperPage uploadingDatamapper;
	String winHandleBefore;
	
	@Given("^on the homepage$")
	public void on_the_homepage() throws Throwable {
		homePage = new HomePage(driver);
		homePage.navigateToWebApp();
		
	}
	
	@When("^I click on Upload datamapping config$")
	public void i_click_on_Upload_datamapping_config() throws Throwable {
		// Store the current window handle
		winHandleBefore = driver.getWindowHandle();
		uploadingDatamapper = homePage.navigateToUploaddatamapper();
	}

	@And("^upload the datamapping config$")
	public void upload_the_datamapping_config() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		Thread.sleep(500);	
		uploadingDatamapper.testUploadingDatamapper();
	}
	
	@And("^Click on Submit$")
	public void click_on_Submit() throws Throwable {
		driver.findElement(By.id("submit")).click();
	}

	@Then("^Datamapping Managed File ID is displayed$")
	public void datamapping_Managed_File_ID_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	
	
}

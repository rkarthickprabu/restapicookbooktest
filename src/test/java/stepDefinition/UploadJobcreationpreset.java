package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import pageObject.UploadingJobcreationpresetPage;

public class UploadJobcreationpreset {

    WebDriver driver = new FirefoxDriver();
    HomePage homePage;
    UploadingJobcreationpresetPage uploadingJobcreationpreset;
	String winHandleBefore;

	@Given("^At homepage$")
	public void at_homepage() throws Throwable {

		// Write code here that turns the phrase above into concrete actions
		homePage = new HomePage(driver);
		homePage.navigateToWebApp();
		}

	@When("^I click on Upload a Job Creation preset$")
	public void i_click_on_Upload_a_Job_Creation_preset() throws Throwable {
		winHandleBefore = driver.getWindowHandle();
		uploadingJobcreationpreset = homePage.navigateToUploadingJobcreationpreset();
	}

	@And("^upload the JC preset$")
	public void upload_the_JC_preset() throws Throwable {
	 for(String winHandle : driver.getWindowHandles()){
		 driver.switchTo().window(winHandle);
	 }
		Thread.sleep(500);
		uploadingJobcreationpreset.testUploadingJobcreationpreset();
		
	}

	@And("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
			driver.findElement(By.id("submit")).click();
	}
	
	@Then("^Managed File ID for JC is displayed$")
	public void managed_File_ID_for_JC_is_displayed() throws Throwable {

		
		//String ManagedFileID = driver.findElement(By.cssSelector("html body div#results.results fieldset div#results-body div.result div.value")).getAttribute("value");
		//String ManagedFileID = driver.findElement(By.xpath("/html/body/div[1]/fieldset/div/div[3]/div[2]")).getAttribute("value");
		//String ManagedFileID = driver.findElement(By.className("value")).getAttribute("value");
		//System.out.println("value of OC Managed file ID is: " + ManagedFileID);
	
	}

}

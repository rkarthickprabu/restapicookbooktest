package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.UploadingDatafilePage;
import pageObject.HomePage;

public class UploadDatafile {

	WebDriver driver = new FirefoxDriver();
	HomePage homePage;
	UploadingDatafilePage uploadingDatafile;
	String winHandleBefore;
	public static String DataManagedFileID;
	

	@Given("^Am on the homepage$")
	public void am_on_the_homepage() throws Throwable {
		homePage = new HomePage(driver);
		homePage.navigateToWebApp();
		
	}

	@When("^I click on Upload data file$")
	public void i_click_on_Upload_data_file() throws Throwable {
		// Store the current window handle
		winHandleBefore = driver.getWindowHandle();
		uploadingDatafile = homePage.navigateToUploaddatafile();
	}

	@And("^click on Browse button$")
	public void click_on_Browse_button() throws Throwable {
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		Thread.sleep(500);	
		uploadingDatafile.testUploadingData();
	}


	@Then("^result is displayed$")
	public void result_is_displayed() throws Throwable {
	   
		Thread.sleep(5000);
		

	 DataManagedFileID = driver.findElement(By.className("value")).getText();
		System.out.println("value of OC Managed file ID is: " + DataManagedFileID);
		//uploadingDatafile.storeDataFileID();
		homePage.storeDataFileID();
		
	}

	
	
}

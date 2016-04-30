package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
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
		//driver.findElement(By.id("datafile")).click();
		
		//driver.findElement(By.xpath("/html/body/form/fieldset/div[1]/input")).click();
		
		// assuming driver is a healthy WebDriver instance
	//driver.findElement(By.xpath("/html/body/form/fieldset/div[1]/input")).sendKeys("C:/_letter-ol/Promo-EN-10.csv");
		//driver.findElement(By.id("submit")).click();

		//driver.findElement(By.id("datafile")).sendKeys("C:/_letter-ol/Promo-EN-10.csv");
		//System.out.println("Hey Current URL:" + driver.getCurrentUrl());
		//driver.findElement(By.id("submit")).click();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		Thread.sleep(500);	
		uploadingDatafile.testUploadingData();
	}

	@Then("^dialog box opens$")
	public void dialog_box_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.id("submit")).click();
	}
	
	
}

package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import pageObject.UploadingDatafilePage;
import pageObject.AllinoneOperationPage;

public class Allinoneoperation {

	public Allinoneoperation() {
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = new FirefoxDriver();
	HomePage homePage;
	//AllinoneOperationPage runningAllinoneoperation;
	UploadingDatafilePage uploadingDatafile;
	AllinoneOperationPage allinoneoperation;	
	String winHandleBefore;
	//String DataManagedFileID;


@Given("^At home$")
public void at_home() throws Throwable {
	homePage = new HomePage (driver);
	homePage.navigateToWebApp();

}

@When("^I click on All-in-One page$")
public void i_click_on_All_in_One_page() throws Throwable {
	winHandleBefore = driver.getWindowHandle();
	 System.out.println(winHandleBefore);
	homePage.navigateToAllinoneOperation();
	
}

@And("^All the four checkbox options are checked$")
public void all_the_four_checkbox_options_are_checked() throws Throwable {
	for(String winHandle: driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
			}
		Thread.sleep(500);
		
		//runningAllinoneoperation.testRunningAllinoneoperation();
		if(!driver.findElement(By.id("datamining")).isSelected()){
			driver.findElement(By.id("datamining")).click();
		}
		
		
		if(!driver.findElement(By.id("contentcreation")).isSelected()){
			driver.findElement(By.id("contentcreation")).click();
		}
		if(!driver.findElement(By.id("jobcreation")).isSelected()){
			driver.findElement(By.id("jobcreation")).click();
		}
		
		if(!driver.findElement(By.id("outputcreation")).isSelected()){
			driver.findElement(By.id("outputcreation")).click();
		}
}

@And("^Managed File ID entered in their respective fields$")
public void managed_File_ID_entered_in_their_respective_fields() throws Throwable {

	
	//driver.findElement(By.id("datafile")).clear();
	//driver.findElement(By.id("datafile")).sendKeys(UploadDatafile.DataManagedFileID);
	//System.out.println(UploadDatafile.DataManagedFileID);
	//System.out.println(UploadingDatafilePage.Str1);
	//uploadingDatafile.storeDataFileID();
	homePage.storeDataFileID();

}

@And("^Submit$")
public void submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions


}

@Then("^Output file is created$")
public void output_file_is_created() throws Throwable {
    // Write code here that turns the phrase above into concrete actions


}

}
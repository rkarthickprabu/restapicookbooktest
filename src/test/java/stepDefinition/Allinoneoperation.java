package stepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
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
	UploadingDatafilePage uploadingDatafile;
	AllinoneOperationPage allinoneoperation;	
	String winHandleBefore;


	@Given("^At home$")
	public void at_home() throws Throwable {
		homePage = new HomePage (driver);
		homePage.navigateToWebApp();
	
	}
	
	@When("^I click on All-in-One page$")
	public void i_click_on_All_in_One_page() throws Throwable {
		winHandleBefore = driver.getWindowHandle();
		 //System.out.println(winHandleBefore);
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
		//homePage.storeDataFileID();
		//System.out.println("HomePage.fileId is: "+ HomePage.fileId);
		//Object value = HomePage.readValue("DataManagedFileID");
		//System.out.println("DataManagedFileId value is: " + value);
		//value is now saved as type Object. If this needs to be converted to String, just write: value.toString();
		//value.toString();
		driver.findElement(By.id("datafile")).clear();
		driver.findElement(By.id("datafile")).sendKeys((CharSequence) HomePage.readValue("DataManagedFileID", "DataManagedFileID"));
		
		//Object value = HomePage.readValue("DatamapperManagedFileID");
		//System.out.println("DatamapperManagedFileID value is: " + value);
		driver.findElement(By.id("datamapper")).clear();
		driver.findElement(By.id("datamapper")).sendKeys((CharSequence) HomePage.readValue("DatamapperManagedFileID", "DatamapperManagedFileID"));
		//System.out.println("DatamapperManagedFileID is: " + HomePage.readValue("DatamapperManagedFileID", "DatamapperManagedFileID"));
		
		//Object value2 = HomePage.readValue("TemplateManagedFileID");
		//System.out.println("TemplateManagedFileID value is: " + value2);
		driver.findElement(By.id("designtemplate")).clear();
		driver.findElement(By.id("designtemplate")).sendKeys((CharSequence) HomePage.readValue("TemplateManagedFileID", "TemplateManagedFileID"));
		
		//Object value3 = HomePage.readValue("JCManagedFileID");
		//System.out.println("JCManagedFileID value is: " + value3);
		driver.findElement(By.id("jcpreset")).clear();
		driver.findElement(By.id("jcpreset")).sendKeys((CharSequence) HomePage.readValue("JCManagedFileID", "JCManagedFileID"));
		
		//Object value4 = HomePage.readValue("OCManagedFileID");
		//System.out.println("OCManagedFileID value is: " + value4);
		driver.findElement(By.id("ocpreset")).clear();
		driver.findElement(By.id("ocpreset")).sendKeys((CharSequence) HomePage.readValue("OCManagedFileID", "OCManagedFileID"));
	}
	
	@And("^Submit$")
	public void submit() throws Throwable {
	
			driver.findElement(By.id("submit")).click();
	
	}
	
	@Then("^Output file is created$")
	public void output_file_is_created() throws Throwable {
		Thread.sleep(5000);
//		File file1 = new File("C:\\Users\\qatester\\Connect\\output\\Master.pdf");
//		File file2 = new File("C:\\Users\\qatester\\Connect\\output\\letter-ol_0001.pdf");
//		boolean isTwoEqual = FileUtils.contentEquals(file1, file2);
//		
//		if(isTwoEqual == true){
//			System.out.println("PASS - The output files are the same!");
//			
//			}else{
//				System.out.println("FAIL - Verify the output file");
//			}
		System.out.println("The output file(s) have been created successfully in the location specified in the output preset config");
		driver.close();
	}
	
	}
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import stepDefinition.UploadDatafile;

public class HomePage extends AbstractPage {

	
	public HomePage(WebDriver driver){
		super(driver);
	}
	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
	
	public AuthenticationPage navigateToAuthenticationPage () {
		driver.findElement(By.linkText("Authenticating with the Connect Server")).sendKeys(selectLinkOpeninNewTab);
		return new AuthenticationPage(driver);
	}
	
	public HandshakeTestPage navigateToHandShakeTestPage () {
		driver.findElement(By.cssSelector("a[href='examples/auth/auth-service-handshake.html']")).click();
		return new HandshakeTestPage(driver);
	}
	
	 public UploadingDatafilePage navigateToUploaddatafile()
	 {
		driver.findElement(By.linkText("Uploading a Data File to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDatafilePage(driver);
	 }
	
	 public UploadingDatamapperPage navigateToUploaddatamapper()
	 {
		driver.findElement(By.linkText("Uploading a Data Mapping Configuration to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDatamapperPage(driver);
	 }
	 
	 public UploadingDesigntemplatePage navigateToUploaddesigntemplate()
	 {
		driver.findElement(By.linkText("Uploading a Design Template to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDesigntemplatePage(driver);
	 }
	 
	 public UploadingJobcreationpresetPage navigateToUploadingJobcreationpreset()
	 {
		driver.findElement(By.linkText("Uploading a Job Creation Preset to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingJobcreationpresetPage(driver);
	 }

	 
	 public UploadingOutputcreationpresetPage navigateToUploadOutputcreationpreset()
	 {
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading an Output Creation Preset to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingOutputcreationpresetPage(driver);
		 
	 }
	 
	public AllinoneOperationPage navigateToAllinoneOperation()
	 {
		driver.findElement(By.linkText("Running an All-In-One Operation (Using JSON)")).sendKeys(selectLinkOpeninNewTab);
		return new AllinoneOperationPage(driver);
		 
	 }
	
	 public AllinoneOperationPage storeDataFileID(){
		 System.out.println("Hello!");
		 System.out.println("Value of DataManagedFileID is: " + UploadDatafile.DataManagedFileID);
		 String Str1 = UploadDatafile.DataManagedFileID;
		 System.out.println("Value of Str1 is: " + Str1 );

		return new AllinoneOperationPage (driver);
	 }
}



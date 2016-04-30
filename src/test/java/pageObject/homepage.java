package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	public AuthenticationPage navigateToAuthenticationPage () {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN);
		//driver.findElement(By.linkText("Authenticating with the Connect Server")).click();
		driver.findElement(By.linkText("Authenticating with the Connect Server")).sendKeys(selectLinkOpeninNewTab);
		return new AuthenticationPage(driver);
	}
	
	public HandshakeTestPage navigateToHandShakeTestPage () {
		driver.findElement(By.cssSelector("a[href='examples/auth/auth-service-handshake.html']")).click();
		return new HandshakeTestPage(driver);
	}
	
	 public UploadingDatafilePage navigateToUploaddatafile()
	 {
		//driver.findElement(By.linkText("Uploading a Data File to the File Store")).click();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading a Data File to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDatafilePage(driver);
	 }
	
	 public UploadingDatamapperPage navigateToUploaddatamapper()
	 {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading a Data Mapping Configuration to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDatamapperPage(driver);
	 }
	 
	 public UploadingDesigntemplatePage navigateToUploaddesigntemplate()
	 {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading a Design Template to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDesigntemplatePage(driver);
	 }
	 
	 public UploadingJobcreationpresetPage navigateToUploadingJobcreationpreset()
	 {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading a Job Creation Preset to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingJobcreationpresetPage(driver);
	 }

	 
	 public UploadingOutputcreationpresetPage navigateToUploadOutputcreationpreset()
	 {
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading an Output Creation Preset to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingOutputcreationpresetPage(driver);
		 
	 }
}

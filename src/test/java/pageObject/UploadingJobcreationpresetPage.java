package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadingJobcreationpresetPage extends AbstractPage{

	public UploadingJobcreationpresetPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	 public UploadingJobcreationpresetPage testUploadingJobcreationpreset() {
		driver.findElement(By.id("jcpreset")).sendKeys("C:\\_letter-ol\\JobCreationConfig\\default_jc.OL-jobpreset");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Sleep");
		}
		//driver.findElement(By.id("submit")).click();
		 return new UploadingJobcreationpresetPage (driver);
	 }

}
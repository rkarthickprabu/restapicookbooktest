package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadingOutputcreationpresetPage extends AbstractPage{

	public UploadingOutputcreationpresetPage(WebDriver driver) {
		
		super(driver);
	}

	 public UploadingOutputcreationpresetPage testUploadingOutputcreationpreset() {
			driver.findElement(By.id("ocpreset")).sendKeys("C:\\_letter-ol\\OutputCreationConfig\\default_pdf.OL-outputpreset");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Sleep");
			}
			//driver.findElement(By.id("submit")).click();
			 return new UploadingOutputcreationpresetPage (driver);
		 }
	
}

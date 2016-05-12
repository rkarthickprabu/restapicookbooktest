package pageObject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadingDatafilePage extends AbstractPage{

	public UploadingDatafilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 public UploadingDatafilePage deletefile(){
		  File file = new File("DataManagedFileID");
		  if(file.exists()) {
		   file.delete();
		  }
		return new UploadingDatafilePage (driver);
		 }
	
	
	
	 public UploadingDatafilePage testUploadingData() {
		 driver.findElement(By.id("datafile")).sendKeys("C:\\_letter-ol\\Promo-EN-10.csv");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Sleep");
		}
		driver.findElement(By.id("submit")).click();
		 return new UploadingDatafilePage (driver);
	 }

}

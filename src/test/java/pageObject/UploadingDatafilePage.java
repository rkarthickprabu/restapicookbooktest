package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefinition.UploadDatafile;

public class UploadingDatafilePage extends AbstractPage{

	public UploadingDatafilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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

	 
//	 public UploadingDatafilePage storeDataFileID(){
//		 System.out.println("Value of DataManagedFileID is: " + UploadDatafile.DataManagedFileID);
//		 String Str1 = UploadDatafile.DataManagedFileID;
//		 System.out.println("Value of Str1 is: " + Str1 );
//
//		return new UploadingDatafilePage (driver);
//	 }
}

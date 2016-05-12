package pageObject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadingDesigntemplatePage extends AbstractPage{

	public UploadingDesigntemplatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 public UploadingDesigntemplatePage deletefile(){
		  File file = new File("TemplateManagedFileID");
		  if(file.exists()) {
		   file.delete();
		  }
		return new UploadingDesigntemplatePage (driver);
		 }
	 
	 public UploadingDesigntemplatePage testUploadingDesigntemplate() {
		driver.findElement(By.id("designtemplate")).sendKeys("C:\\_letter-ol\\letter-ol.OL-template");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Sleep");
		}
		//driver.findElement(By.id("submit")).click();
		 return new UploadingDesigntemplatePage (driver);
	 }

}

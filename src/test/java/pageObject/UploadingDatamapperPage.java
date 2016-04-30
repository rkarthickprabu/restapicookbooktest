package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadingDatamapperPage extends AbstractPage{

	public UploadingDatamapperPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 public UploadingDatamapperPage testUploadingDatamapper() {
		driver.findElement(By.id("datamapper")).sendKeys("C:\\_letter-ol\\Promo-EN.OL-datamapper");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Sleep");
		}
		//driver.findElement(By.id("submit")).click();
		 return new UploadingDatamapperPage (driver);
	 }

}

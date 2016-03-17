package pageObject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

	protected WebDriver driver;
	
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
		
	}
	
	public HomePage navigateToWebApp() {
		
		driver.navigate().to("http://localhost:9340/serverengine/html/cookbook/index.html");
		return new HomePage (driver);
	}
	
	/*public void closeDriver() {
		driver.quit();
	}
	*/

}

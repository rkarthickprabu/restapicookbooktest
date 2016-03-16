package pageObject;

import org.openqa.selenium.WebDriver;

public class abstractpage {

	protected WebDriver driver;
	
	
	public abstractpage (WebDriver driver){
		this.driver = driver;
		
	}
	
	public homepage navigateToWebApp() {
		
		driver.navigate().to("http://localhost:9340/serverengine/html/cookbook/index.html");
		return new homepage (driver);
	}
	
	
	
}

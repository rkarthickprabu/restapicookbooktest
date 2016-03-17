package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	
	public HomePage(WebDriver driver){
		super(driver);
	}
	

	public AuthenticationPage navigateToAuthenticationPage (String link) {
		driver.findElement(By.linkText("Authenticating with the Connect Server")).click();
		return new AuthenticationPage (driver);
	}
	
	
}

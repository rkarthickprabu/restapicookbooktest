package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandshakeTestPage extends AbstractPage {
	
	public HandshakeTestPage(WebDriver driver) {
		super(driver);
	}
	
	public HandshakeTestPage submitForm() {
		driver.findElement(By.id("submit")).click();
		return new HandshakeTestPage(driver);
	}
}

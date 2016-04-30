package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends AbstractPage{

	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public AuthenticationPage setUsernameField(String value) {
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(value);
		return new AuthenticationPage (driver);
	}
	
	public AuthenticationPage setPasswordField(String password) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		return new AuthenticationPage (driver);
		}
	
	public AuthenticationPage submitForm() {
		driver.findElement(By.id("submit")).click();
		return new AuthenticationPage (driver);
	}
	
	/*public AuthenticationPage results() {
		 int result = 0;
		switch(result) {
		case 1 : 
			
			
		case 2: 
		}
		return new AuthenticationPage (driver);
		
	}
	*/
}

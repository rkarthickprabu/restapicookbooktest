package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllinoneOperationPage  extends AbstractPage{

	public AllinoneOperationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	
	public AllinoneOperationPage testAllinoneoperation(){
		
		System.out.println("test");
	//	driver.findElement(By.id("datamining")).click();

		return new AllinoneOperationPage(driver);
		
	}

}

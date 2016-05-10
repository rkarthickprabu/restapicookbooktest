//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//
//public class Test {
//public static void setClipboardData(String string) {
//   StringSelection stringSelection = new StringSelection(string);
//   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//}
//
//
//
//	
//
//	public static void main(String [] args) throws Throwable{
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.navigate().to("http://localhost:9340/serverengine/html/cookbook/examples/fs/fs-datafile-upload.html");
//		
//		//driver.findElement(By.id("datafile")).sendKeys("C:/_letter-ol/Promo-EN-10.csv");
//		//driver.findElement(By.xpath("/html/body/form/fieldset/div[1]/input")).sendKeys("C:/_letter-ol/Promo-EN-10.csv");
//
//		/*driver.findElement(By.xpath("//input[@type='file']"));
//		System.out.println("upload success");
//		Thread.sleep(5000);
//		driver.findElement(By.id("submit")).click();*/
//		
//		setClipboardData("C:/_letter-ol/Promo-EN-10.csv");
//		//native key strokes for CTRL, V and ENTER keys
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//	}
//	
//}

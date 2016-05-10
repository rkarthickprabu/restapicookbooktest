package pageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import stepDefinition.UploadDatafile;

public class HomePage extends AbstractPage {

	
	public HomePage(WebDriver driver){
		super(driver);
	}
	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN);
	public static String fileId = "hello";
	
	
	public AuthenticationPage navigateToAuthenticationPage () {
		driver.findElement(By.linkText("Authenticating with the Connect Server")).sendKeys(selectLinkOpeninNewTab);
		return new AuthenticationPage(driver);
	}
	
	public HandshakeTestPage navigateToHandShakeTestPage () {
		driver.findElement(By.cssSelector("a[href='examples/auth/auth-service-handshake.html']")).click();
		return new HandshakeTestPage(driver);
	}
	
	 public UploadingDatafilePage navigateToUploaddatafile()
	 {
		driver.findElement(By.linkText("Uploading a Data File to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDatafilePage(driver);
	 }
	
	 public UploadingDatamapperPage navigateToUploaddatamapper()
	 {
		driver.findElement(By.linkText("Uploading a Data Mapping Configuration to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDatamapperPage(driver);
	 }
	 
	 public UploadingDesigntemplatePage navigateToUploaddesigntemplate()
	 {
		driver.findElement(By.linkText("Uploading a Design Template to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingDesigntemplatePage(driver);
	 }
	 
	 public UploadingJobcreationpresetPage navigateToUploadingJobcreationpreset()
	 {
		driver.findElement(By.linkText("Uploading a Job Creation Preset to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingJobcreationpresetPage(driver);
	 }

	 
	 public UploadingOutputcreationpresetPage navigateToUploadOutputcreationpreset()
	 {
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.RETURN); 
		driver.findElement(By.linkText("Uploading an Output Creation Preset to the File Store")).sendKeys(selectLinkOpeninNewTab);
		return new UploadingOutputcreationpresetPage(driver);
		 
	 }
	 
	public AllinoneOperationPage navigateToAllinoneOperation()
	 {
		driver.findElement(By.linkText("Running an All-In-One Operation (Using JSON)")).sendKeys(selectLinkOpeninNewTab);
		return new AllinoneOperationPage(driver);
		 
	 }
	
	 public AllinoneOperationPage storeDataFileID(){
		 System.out.println("Hello!");
		 System.out.println("Value of DataManagedFileID is: " + UploadDatafile.DataManagedFileID);
		 String Str1 = UploadDatafile.DataManagedFileID;
		 System.out.println("Value of Str1 is: " + Str1 );

		return new AllinoneOperationPage (driver);
	 }

	 public static void writeValues(String fileName, String key, Object value) {
	  FileOutputStream fos;
	  try {
	   File file = new File(fileName);
	   if(!file.exists()) {
	    file.createNewFile();
	   }
	   fos = new FileOutputStream(file, true);
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   Map<String, Object> valueMap = new HashMap<String, Object>();
	   valueMap.put(key, value);
	   oos.writeObject(valueMap);
	   oos.close();	
	   fos.close();
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	 }
	 
	 public static Object readValue(String fileName, String key) {
		  HashMap<Integer, String> map = null;
		  FileInputStream fis = null;
		  ObjectInputStream ois = null;
		  try {
		   fis = new FileInputStream(fileName);
		   ois = new ObjectInputStream(fis);
		   map = (HashMap) ois.readObject();
		  } catch (IOException ioe) {
		   ioe.printStackTrace();
		  } catch (ClassNotFoundException c) {
		   System.out.println("Class not found");
		   c.printStackTrace();
		  } finally {
		   try {
		    ois.close();
		    fis.close();
		   } catch(Throwable th) {
		    // ignore
		   }
		  }
		  return map.get(key);
		 }
	 
//	 public static void deleteValueFile() {
//		  File file = new File("Values.txt");
//		  if(file.exists()) {
//		   file.delete();
//		  }
//		 }
//	 
}

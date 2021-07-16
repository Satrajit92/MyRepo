package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	@SuppressWarnings("deprecation")
	public WebDriver initializedriver() throws Exception {
		 WebDriver driver;
		 Properties prop= new Properties();	 
		 String workspace=System.getProperty("user.dir");
		 FileInputStream fis=new FileInputStream(workspace+"\\src\\main\\java\\resources\\data.properties");
		 prop.load(fis);
		 String URL=prop.getProperty("URL");
//		 String Item=prop.getProperty("item");
		// System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver",workspace+"\\src\\main\\java\\resources\\chromedriver.exe");		
		 driver=new ChromeDriver();
		 driver.get(URL);
		 driver.manage().window().maximize();
		 return driver;
		 
		 
	}
	
	
	
	
	
}

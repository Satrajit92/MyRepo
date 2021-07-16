package FrameworkforTest.FlipkartTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import resources.BaseClass;
import pageObjects.*;

public class AddtoCartTest extends BaseClass {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() throws Exception {
		driver=initializedriver();
		
		
	}
	
	@Test
	public void addmobile() throws InterruptedException, Exception {
		 String workspace=System.getProperty("user.dir");
		 FileInputStream fis=new FileInputStream(workspace+"\\src\\main\\java\\resources\\data.properties");	
		//FileInputStream fis=new FileInputStream("C:\\Users\\91987\\eclipse-workspace\\FlipkartTest\\src\\main\\java\\resources\\data.properties");
    Properties prop=new Properties();
    prop.load(fis);
	HomePage hm=new HomePage(driver);
	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(hm.getpopup()));
	hm.getquitsign().click();
	//Thread.sleep(1000);
	w.until(ExpectedConditions.visibilityOf(hm.gettopoffers()));
	String Item=prop.getProperty("item");
    hm.getsearchfield().sendKeys(Item);
    Thread.sleep(2000);
    hm.getsearchicon().click();
    Thread.sleep(2000);
    SearchResult sr=new SearchResult(driver);
    w.until(ExpectedConditions.visibilityOf(sr.getfiltersection()));
    driver.findElement(By.xpath("//div[text()='4 GB']/../div")).click();
    Thread.sleep(2000);
    w.until(ExpectedConditions.visibilityOf(sr.getclearalltext()));
    Thread.sleep(2000);
    w.until(ExpectedConditions.visibilityOf(sr.getfirstresult()));
    //String[] firstprice=sr.getfirstprice().getText().split("₹");
    //System.out.println(firstprice[1]);
    sr.getfirstresult().click();
    Thread.sleep(3000);
    Set<String> windows=driver.getWindowHandles();
    Iterator<String>it=windows.iterator();
    String ParentID=it.next();
    String ChildID=null;
    driver.close();
    while(it.hasNext())
    {
    	 ChildID=it.next();
    }
    
    driver.switchTo().window(ChildID);
    FinalProduct fp=new FinalProduct(driver);
    Thread.sleep(2000);
    w.until(ExpectedConditions.visibilityOf(fp.getavailableoffers()));
    String[] finalprice=fp.getfinalprice().getText().split("₹");
   System.out.println(finalprice[1]);
    fp.getaddtocart().click();
    Thread.sleep(2000);
    //By frame=By.xpath("//div[@class='_1YokD2 _3Mn1Gg col-4-12 _78xt5Y']");
   CheckOut co=new CheckOut(driver);
  // driver.switchTo().activeElement(driver.findElement(frame));
  // driver.switchTo().frame(driver.findElement(frame));
   w.until(ExpectedConditions.visibilityOf(co.getpricedetails()));
   //w.until(ExpectedConditions.visibilityOf(co.gettotalamount()));
   String[] checkoutprice=co.gettotalamount().getText().split("₹");
   System.out.println(checkoutprice[1]);
   Assert.assertEquals(checkoutprice[1],finalprice[1]);
    
    
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	

}

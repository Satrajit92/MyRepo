package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalProduct {
    
	public WebDriver driver;
	
	
	 By finalprice=By.xpath("//div[@class=\'_30jeq3 _16Jk6d\']");
	 By availableoffers=By.xpath("//div[text()='Available offers']");
	 By addtocart=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	
	
	public FinalProduct(WebDriver driver) {
		
		this.driver = driver;
	}
	
		
	public WebElement getfinalprice()
	{
		return driver.findElement(finalprice);
	}
	public WebElement getavailableoffers()
	{
		return driver.findElement(availableoffers);
	}
	public WebElement getaddtocart()
	{
		return driver.findElement(addtocart);
	}
	
}

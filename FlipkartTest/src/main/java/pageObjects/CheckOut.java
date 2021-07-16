package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOut {
    
	public WebDriver driver;
	
	
	 By pricedetails=By.xpath("//span[text()='Price details']");
	 By totalamount=By.xpath("//div[@class='_I_XQO']/div/div/div/div/../../span/div/div/span");

	
	
	public CheckOut(WebDriver driver) {
		
		this.driver = driver;
	}
	
		
	public WebElement getpricedetails()
	{
		return driver.findElement(pricedetails);
	}
	public WebElement gettotalamount()
	{
		return driver.findElement(totalamount);
	}

	
}

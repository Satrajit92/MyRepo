package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult {
    
	public WebDriver driver;
	private By filtersection=By.xpath("//section[@class='JWMl0H _2hbLCH']");
	private By clearalltext=By.xpath("//span[text()='Clear all']");
	private By firstresult= By.xpath("(//div[@class=\'_2kHMtA\'])[1]");
	private By firstprice=By.xpath("(//div[@class=\'_30jeq3 _1_WHN1\'])[1]");
	
	
	public SearchResult(WebDriver driver) {
		
		this.driver = driver;
	}
	
		
	public WebElement getfiltersection()
	{
		return driver.findElement(filtersection);
	}
	
	
	public WebElement getclearalltext()
	{
		return driver.findElement(clearalltext);
	}

	public WebElement getfirstresult()
	{
		return driver.findElement(firstresult);
	}

	public WebElement getfirstprice()
	{
		return driver.findElement(firstprice);
	}
}

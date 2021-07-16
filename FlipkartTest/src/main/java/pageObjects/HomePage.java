package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    
	public WebDriver driver;
	private By popup=By.xpath("//div[@class='_2MlkI1']");
	private By quitsign=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	private By searchfield= By.xpath("//input[@type='text']");
	private By searchicon= By.xpath("//button[@class=\'L0Z3Pu\']");
	private By topoffers= By.xpath("//img[@alt='Top Offers']");
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
public WebElement getpopup() {
		
		return driver.findElement(popup);
}
		
		
		public WebElement getsearchfield() {
			
			return driver.findElement(searchfield);
		}
			
	public WebElement getquitsign() {
		
		return driver.findElement(quitsign);
	}
	
	public WebElement getsearchicon() {
		
		return driver.findElement(searchicon);
	}
	
	public WebElement gettopoffers()
	{
		return driver.findElement(topoffers);
	}
	
	
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
	
	public DashBoardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h4[normalize-space()='Dashboard']") 
	 WebElement dashboard;
	
	public boolean isDashBoardexists()   // MyAccount Page heading display status
	{
		try {
			return (dashboard.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	
	

}
}
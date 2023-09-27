package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement enterYourEmail;
	@FindBy(xpath = "//input[@id='password']")
	WebElement enterYourPassword;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;
	/*@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement register;*/
	
	
	public void setEmail(String email) {
		enterYourEmail.sendKeys(email);
	}
	public void setpwd(String pwd) {
		enterYourPassword.sendKeys(pwd);
	}
	public void clicklogbtn() {
		loginbtn.click();
	}

}

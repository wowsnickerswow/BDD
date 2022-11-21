package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath = "//a[@id='login2']")
	public WebElement LogInButton;
	
	@FindBy(xpath = "//input[@id='loginusername']")
	public WebElement userNameInput;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement passwordInput;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	public WebElement signInButton;
	
	@FindBy(xpath="//div[@id='tbodyid']//div[1]//div[1]//div[1]//h4[1]")
	public WebElement samsungPhone;
	
}

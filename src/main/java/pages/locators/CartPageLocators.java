package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {
	@FindBy(xpath = "//a[@id='login2']")
	public WebElement LogInButton;
	
	@FindBy(xpath = "//button[normalize-space()='Place Order']")
	public WebElement PlaceOrderBtn;
	
	
	

}

package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonePageLocators {
	
	@FindBy(xpath = "//a[normalize-space()='Add to cart']")
	public WebElement AddToCartBtn;
	
	@FindBy(xpath = "//a[@id='cartur']")
	public WebElement CartBtn;
	
	@FindBy(xpath="//div[@id='contcont']//a[2]")
	public WebElement Categories;

}

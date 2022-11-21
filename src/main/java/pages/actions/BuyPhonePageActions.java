package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import pages.locators.PhonePageLocators;
import utils.SeleniumDriver;

public class BuyPhonePageActions {
	
	PhonePageLocators phonePageLocators = null;
	
	public BuyPhonePageActions() {
		this.phonePageLocators = new PhonePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), phonePageLocators);
	}
	
	public void selectPhoneCategory(String Phone) {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.click(phonePageLocators.Categories);
	}

	
	

}

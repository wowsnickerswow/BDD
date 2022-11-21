package pages.actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import utils.SeleniumDriver;
public class HomePageActions {
	
	HomePageLocators homePageLocators = null;
	
	public HomePageActions() {
		
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
		
		
	}
	
	public void clickSignInButton() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.click(homePageLocators.LogInButton);
		
	}
	
	public void  provideUserNameAndPassword() {
		
	}

}

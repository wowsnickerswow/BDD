package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class buyingPhoneSteps {
	
	HomePageActions homePageActions = new HomePageActions();
	
	@Given("I am on the Home Page of {string} website")
	public void i_am_on_the_home_page_of_website(String websiteURL) {
	    SeleniumDriver.openPage(websiteURL);
;
	}

	@When("login into product store")
	public void login_into_product_store() {
	    homePageActions.clickSignInButton();
	    
	}

	@And("Select phone category")
	public void select_phone_category() {

	}

	@And("click on forst phone from the list")
	public void click_on_forst_phone_from_the_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I add phone to the cart")
	public void i_add_phone_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("rediret to cart page")
	public void rediret_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

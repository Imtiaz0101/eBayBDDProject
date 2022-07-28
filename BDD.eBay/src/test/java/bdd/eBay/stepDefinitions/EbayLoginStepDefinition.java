package bdd.eBay.stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import bdd.eBay.PageActions.EbayLoginPageActions;
import bdd.eBay.utilities.GetWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EbayLoginStepDefinition {
	
	EbayLoginPageActions actions =new EbayLoginPageActions();
	GetWebDriver close=new GetWebDriver();
	@Given("User is on eBay homepage")
	public void user_is_on_eBay_homepage() {
	   // actions.navigateToEbayLoginPage();
	   // actions.validateEbayLoginPage();
	   GetWebDriver.webdriver.get("https://www.ebay.com/");
	}

	@Given("User click on sign in button")
	public void user_click_on_sign_in_button() {
	    
	   actions.clickSignin();
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
	    close.tearDownWebDriver();
	   
	}
	

}

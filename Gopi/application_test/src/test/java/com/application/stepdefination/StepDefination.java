package com.application.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.application.declaration.WrapperClassApp;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination extends WrapperClassApp {

	@Given("^user enter userid and paasword$")
	public void user_enter_userid_and_paasword() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//System.out.println(prop.getProperty("app.loginpage.userid_txtbox"));
		enterById(prop.getProperty("app.loginpage.userid_txtbox"),"wl2b086");
		enterById(prop.getProperty("app.loginpage.password_txtbox"),"Month#03");
	}

	@Given("^click on login button$")
	public void click_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickById(prop.getProperty("app.loginpage.login_btn"));
	}

	@Given("^user enters \"(.*?)\"$")
	public void user_enters(String cardnum) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		enterById(prop.getProperty("app.searchpage.cardnumber_txtbox"), cardnum);
	}

	@Given("^click on search button$")
	public void click_on_search_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickById(prop.getProperty("app.searchpage.search_btn"));
	}

	@Then("^trsnaction page is displayed as default$")
	public void trsnaction_page_is_displayed_as_default() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		verifyTitle(prop.getProperty("app.transactionpage.title"));
	}

	@Given("^user enters LastName as \"(.*?)\"$")
	public void user_enters_LastName_as(String lastname) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		enterById(prop.getProperty("app.search.lastname_txtbox"), lastname);
	}

	@Given("^click on search button for LastName search$")
	public void click_on_search_button_for_LastName_search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		clickById(prop.getProperty("app.searchpage.search_btn"));
	}


	@Then("^transaction page is displayed as default$")
	public void transaction_page_is_displayed_as_default() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		verifyTitle(prop.getProperty("app.transactionpage.title"));
	}


	@Given("^perform valid \"(.*?)\"$")
	public void perform_valid(String cardnum)
	{
		enterById(prop.getProperty("app.searchpage.cardnumber_txtbox"), cardnum);
		clickById(prop.getProperty("app.searchpage.search_btn"));
	}
	
	@Then("^transaction page displays and user clicks on first trasnaction from list$")
	public void transaction_page_displays_and_user_clicks_on_first_trasnaction_from_list()
	{
		clickByXpath("//table[@id='tran-link-list']/tbody/tr[3]");
		//WebElement el=driver.findElement(By.xpath(""));
		//el.click();
		System.out.println(driver.getTitle());
	}
	
}

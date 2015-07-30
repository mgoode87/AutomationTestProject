package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class StepsLogout {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	public String userName = "timeywimeywho10@gmail.com";
	public String passWord = "fish1122";
	public String homePageTitle = "Google";
	public String loginPageTitle = "Sign in - Google Accounts";
	public String url = "http://www.google.com";
	
	@When("^User Clicks on the account dropdown arrow$")
	public void user_Clicks_on_the_account_dropdown_arrow() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User account dropdown appears$")
	public void user_account_dropdown_appears() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User clicks on Sign out$")
	public void user_clicks_on_Sign_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User is on the HomePage$")
	public void user_is_on_the_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User sees SigninButton$")
	public void user_sees_SigninButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

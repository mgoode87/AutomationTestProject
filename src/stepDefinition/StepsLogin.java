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
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import pages.*;

public class StepsLogin {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	public String userName = "timeywimeywho10@gmail.com";
	public String passWord = "fish1122";
	public String homePageTitle = "Google";
	public String loginPageTitle = "Sign in - Google Accounts";
	public String url = "http://www.google.com";
	
	@Given("^User is on HomePage$")
	public void userIsOnHomePage() throws Throwable{
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.getHomePageTitle(driver), homePageTitle);
	
	}
	
	@When("^User navigates to Login Page$")
	public void userNavigatestoLoginPage() throws Throwable{
		homePage = new HomePage(driver);
		homePage.clickSignInHomePage();
		
		loginPage = new LoginPage(driver);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Assert.assertEquals(loginPage.getLoginPageTitle(), loginPageTitle);
	}
	
	@When("^User enters Username$")
	public void userEntersUsername() throws Throwable{
		loginPage = new LoginPage(driver);
		loginPage.enterUsername(userName);
		
	}
	
	@When("^User clicks Next$")
	public void userClicksNext() throws Throwable{
		loginPage = new LoginPage(driver);
		loginPage.clickNextButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@When("^User enters Password$")
	public void userEntersPassword() throws Throwable{
		loginPage = new LoginPage(driver);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		loginPage.enterPassword(passWord);
		  
	}
	
	@When("^User clicks Submit$")
	public void userClicksSubmit() throws Throwable{
		loginPage = new LoginPage(driver);
		loginPage.clickSignInButton();
	}
	
	@Then("^User is on Account Home Page$")
	public void userIsAccountHomePage() throws Throwable{
		homePage = new HomePage(driver);
		Assert.assertEquals(driver.getTitle(), homePageTitle);
		driver.close();
		driver.quit();
	}

}

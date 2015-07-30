package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;

public class LoginTest {
	public WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	public String userName = "timeywimeywho10@gmail.com";
	public String passWord = "fish1122";
	public String homePageTitle = "Google";
	public String loginPageTitle = "Sign in - Google Accounts";
	public String url = "http://www.google.com";
	
  
  @Test (dependsOnMethods = { "VerifyHomePageLoads" })
  public void LoginTest() {
	  
	  homePage = new HomePage(driver);
	 
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  System.out.println("driver=" + driver); 
	  homePage.clickSignInHomePage();
	  
	  loginPage = new LoginPage(driver);
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  Assert.assertEquals(loginPage.getLoginPageTitle(), loginPageTitle);
	  
	  loginPage.enterUsername(userName);
	  loginPage.clickNextButton();
	  
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  
	  loginPage.enterPassword(passWord);
	  loginPage.clickSignInButton();
 
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.getTitle(), loginPageTitle);
	  
  }
  
  
  @Test
  public void VerifyHomePageLoads(){
	  homePage = new HomePage(driver);
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  Assert.assertEquals(homePage.getHomePageTitle(driver), homePageTitle);
  }
  
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}

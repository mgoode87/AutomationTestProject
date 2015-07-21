package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;

public class LoginTest {
	public WebDriver driver;
	public LoginPage loginPage = new LoginPage(driver);
	public HomePage homePage = new HomePage(driver);
	public String userName = "timeywimeyDoctor10@gmail.com";
	public String passWord = "password";
	
  @Test
  public void Login() {
	  //TODO Verify you are on http://www.google.com
	  
	  //TODO Click the SignIn Button
	  
	  //TODO Verify you are on the login page
	  
	  //TODO Enter Username/Password
	  loginPage.enterUsername(userName);
	  loginPage.enterPassword(passWord);
	  
	  //TODO Submit
	  loginPage.clickSignInButton();
	  
	  //TODO Verify you are on the user HomePage 
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  driver.get("https://google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

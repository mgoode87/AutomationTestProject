package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.*;
public class ExecuteSearchTest {

	public WebDriver driver;
	public HomePage homepage;
	public String search = "Google";
	
	@Test
	public void ExecuteSearch() {
		
		homepage = new HomePage(driver);
		homepage.enterSearch(search);
		
		
	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		
	}

	@AfterMethod
	public void afterMethod() {
		
		driver.quit();
	}

}

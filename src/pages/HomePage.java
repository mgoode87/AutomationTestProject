package pages;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	public WebDriver driver;
	public WebElement element;
	private static Logger Log = Logger.getLogger(HomePage.class.getName());

	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	
	
	 By signInButtonLocator = By.id("gb_70");
	 By gmailButtonLocator = By.linkText("Gmail");
	 By searchButtonLocator = By.name("btnk");
	 By luckyButtonLocator = By.name("test");
	 By advertisingButtonLocator = By.linkText("Advertising");
	 By businessButtonLocator = By.linkText("Business"); 
	 By aboutButtonLocator = By.linkText("About");
	 By privacyButtonLocator = By.linkText("Privacy");
	 By termsButtonLocator = By.linkText("Terms");
	 By settingsButtonLocator = By.linkText("Settings");
	 By imagesButtonLocator = By.linkText("Images");
	 By googleAppsButtonLocator = By.linkText("Options");
	 By searchInputBoxLocator = By.id("gs_htif0");
	 By searchFieldExistsLocator = By.id("searchform");
	 //By tileTextLocator = By.xpath(
	 
	
	 /*
	  * Button locating methods 
	  */
	
	public WebElement signInButton(){
			
			element = driver.findElement(signInButtonLocator);	
			return element;
	}
	
	public WebElement gmailButton(){
		
		return driver.findElement(gmailButtonLocator);
		
	}
	
    public WebElement searchButton(WebDriver driver){
    	
    	return driver.findElement(searchButtonLocator);
    		
    }
    
    public WebElement luckyButton(WebDriver driver){
    	
    	//TODO: Figure out how to findElement for "I'm feeling Lucky" button
    	return driver.findElement(luckyButtonLocator);
    	
    }
	
    public WebElement advertisingButton(WebDriver driver){
    	
    	return driver.findElement(advertisingButtonLocator);
    	
    }
    
    public WebElement businessButton(WebDriver driver){
    	
    	return driver.findElement(businessButtonLocator);
    	
    }
    
    public WebElement aboutButton(WebDriver driver){
    	
    	return driver.findElement(aboutButtonLocator);
    	
    }
    
    public WebElement privacyButton(WebDriver driver){
    	
    	return driver.findElement(privacyButtonLocator);
    	
    }
    
    public WebElement termsButton(WebDriver driver){
    	
    	return driver.findElement(termsButtonLocator);
    	
    }
    
    public WebElement settingsButton(WebDriver driver){
    	
    	return driver.findElement(settingsButtonLocator);
    	
    }
    
    public WebElement imagesButton(WebDriver driver){
    	
    	return driver.findElement(imagesButtonLocator);
    	
    }
    
    public WebElement googleAppsButton(WebDriver driver){
    	
    	return driver.findElement(googleAppsButtonLocator);
    	
    }	
    
    public WebElement searchInputBox(WebDriver driver){
    	
    	return driver.findElement(searchInputBoxLocator);
    	
    }
    
    /*
     * Action methods 
     */
    
    public void enterSearch(String searchText){
    	driver.findElement(searchInputBoxLocator).sendKeys(searchText);
    }
    
    public void submitSearch(String searchText){
    	driver.findElement(searchInputBoxLocator).sendKeys(searchText);
    	searchButton(driver);
    }
    
    public WebElement verifySearchField(WebDriver driver){
    	
    	return driver.findElement(searchFieldExistsLocator);
    	
    }
    
    public String verifySearchFieldByText(){
    	return verifySearchField(driver).getText();
    }
    
    public void clickSignInHomePage(){
    	signInButton().click();
    	System.out.println("driver=" + driver); 
    }
    
    public String getHomePageTitle(WebDriver driver){
    	System.out.println(driver.getTitle());
    	return driver.getTitle();
    	
    }
    
    public void clickGmailButton(){
    	
    	gmailButton().click();
    }
    
    
    
  
    
    
    
}


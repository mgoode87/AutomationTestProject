package pages;

import org.openqa.selenium.*;

public class LoginPage {
	
	public WebElement element = null;
	public WebDriver driver = null;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	By emailInputBoxLocator = By.name("Email");
	By nextEmailButtonLocator = By.id("next");
	By emailAlertMessageLocator = By.id("errormsg_0_Email");
	By backArrowButtonLocator = By.id("back-arrow");
	By persistentCookieCheckboxLocactor = By.id("PersistentCookie");
	By forgotPasswordLinkLocator = By.id("link-forgot-passwd");
	By passwordInputFieldLocator = By.id("Passwd");
	By signInButtonLocator = By.id("signIn");
	By signInWithADifferentAccountLinkLocator = By.linkText(" Sign in with a different account ");
	By reAuthEmailLocator = By.id("reauthEmail");
	
	public WebElement usernameInputBox(WebDriver driver){
		return driver.findElement(emailInputBoxLocator);		
	}
	
	public WebElement nextButton(){
		return driver.findElement(nextEmailButtonLocator);		
	}
	
	public WebElement emailAlertMessage(WebDriver driver){
		return driver.findElement(emailInputBoxLocator);		
	}
	
	public WebElement backArrowButton(WebDriver driver){
		return driver.findElement(backArrowButtonLocator);		
	}
	
	public WebElement perstistentCookieCheckbox(WebDriver driver){
		return driver.findElement(persistentCookieCheckboxLocactor);		
	}
	
	public WebElement forgotPasswordLink(WebDriver driver){
		return driver.findElement(forgotPasswordLinkLocator);		
	}
	
	public WebElement passwordInputField(WebDriver driver){
		return driver.findElement(passwordInputFieldLocator);		
	}
	
	public WebElement signInButton(WebDriver driver){
		return driver.findElement(signInButtonLocator);		
	}
	
	public WebElement signInWithADifferentAccountLink(WebDriver driver){
		return driver.findElement(signInWithADifferentAccountLinkLocator);	
	}
	
	public WebElement reAuthEmail(WebDriver driver){
		return driver.findElement(reAuthEmailLocator);
	}
	
	

	/*
	 * action methods
	 */
	
	public void clickBackArrow(){
		backArrowButton(driver).click();
	}
	
	public void clickNextButton(){
		nextButton().click();
	}
	
	public void clickPerstistentCookieCheckbox(){
		perstistentCookieCheckbox(driver).click();
	}
	
	public void clickForgotPasswordLink(){
		forgotPasswordLink(driver).click();
	}
	
	public void enterPassword(String password){
		passwordInputField(driver).sendKeys(password);
	}
	
	public void clickSignInButton(){
		signInButton(driver).click();
	}
	
	public void clickSignInWithADifferentAccountLink(){
		signInWithADifferentAccountLink(driver).click();
	}
	
	public void enterUsername(String username){
		usernameInputBox(driver).sendKeys(username);
	}
	
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
	    
}

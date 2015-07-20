package pages;

import org.openqa.selenium.*;

public class LoginPage {
	
	private WebElement element = null;
	private WebDriver driver = null;
	
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
	
	
	public WebElement usernameInputBox(WebDriver driver){
		element = driver.findElement(emailInputBoxLocator);
		return element;
	}
	
	public WebElement nextButton(WebDriver driver){
		element = driver.findElement(nextEmailButtonLocator);
		return element;
	}
	
	public WebElement emailAlertMessage(WebDriver driver){
		element = driver.findElement(emailInputBoxLocator);
		return element;
	}
	
	public WebElement backArrowButton(WebDriver driver){
		element = driver.findElement(backArrowButtonLocator);
		return element;
	}
	
	public WebElement perstistentCookieCheckbox(WebDriver driver){
		element = driver.findElement(persistentCookieCheckboxLocactor);
		return element;
	}
	
	public WebElement forgotPasswordLink(WebDriver driver){
		element = driver.findElement(forgotPasswordLinkLocator);
		return element;
	}
	
	public WebElement passwordInputField(WebDriver driver){
		element = driver.findElement(passwordInputFieldLocator);
		return element;
	}
	
	public WebElement signInButton(WebDriver driver){
		element = driver.findElement(signInButtonLocator);
		return element;
	}
	
	public WebElement signInWithADifferentAccountLink(WebDriver driver){
		element = driver.findElement(signInWithADifferentAccountLinkLocator);
		return element;
	}
	
	

	/*
	 * action methods
	 */
	
	public void clickBackArrow(){
		backArrowButton(driver).click();
	}
	
	public void clickNextButton(){
		nextButton(driver).click();
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
}

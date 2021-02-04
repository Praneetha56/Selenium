package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	 
	WebDriver driver = null;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement emailForForgotPwd;
	
	public WebElement getEmailForForgotPwd() {
		return emailForForgotPwd;
	}
	
	public void setEmailForForgotPwd(String forgotEmailVal) {
		emailForForgotPwd.sendKeys(forgotEmailVal);
	}
	
	@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
	private WebElement submitEmailButton;
	
	public WebElement getSubmitEmailButton() {
		return submitEmailButton;
	}
	
	@FindBy(xpath="//a[@title='Back to Login']")
	private WebElement backToLogin;
	
	public WebElement getBackToLogin() {
		return backToLogin;
	}
	
	@FindBy(xpath="//a[@title='Authentication']")
	private WebElement authentication;
	
	public WebElement getAuthentication() {
		return authentication;
	}
	
	
}

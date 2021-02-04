package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver = null;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement createEmail;
	
	public WebElement getCreateEmail() {
		return createEmail;
	}
	
	public void setCreateEmail(String emailVal) {
		createEmail.sendKeys(emailVal);
	}
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement submitCreate;
	
	public WebElement getSubmitCreate() {
	    return submitCreate;
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement loginId;
	
	public WebElement getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginVal) {
		loginId.sendKeys(loginVal);
	}
	
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement loginPassword;
	
	public WebElement getLoginPassword() {
		return loginPassword;
	}
	
	public void setLoginPassword(String loginPwd) {
		loginPassword.sendKeys(loginPwd);
	}
	
	@FindBy(xpath="//a[@title='Recover your forgotten password']")
	private WebElement forgotPassword;
	
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement submitLogin;
	
	public WebElement getSubmitLogin() {
		return submitLogin;
	}
	
	@FindBy(xpath="//i[@class='icon-home']")
	private WebElement returnHome;
	
	public WebElement getReturnHome() {
		return returnHome;
	}
	
	
	
	
	
	
	
}

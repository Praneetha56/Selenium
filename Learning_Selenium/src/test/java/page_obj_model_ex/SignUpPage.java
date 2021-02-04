package page_obj_model_ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
 
	WebDriver driver = null;
	
	public SignUpPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='enterimg']")
	private WebElement enter;
	
	public void getEnter() {
		 enter.click();
		
	}
	
	@FindBy(xpath="//*[text()='Sign In']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
		
	}
	
	@FindBy(xpath="//*[text()='Skip Sign In']")
	private WebElement skipSignin;
	
	public WebElement getSkipSignin() {
		return skipSignin;
		
	}
}

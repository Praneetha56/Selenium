package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSignInPage {
	
	WebDriver driver = null;
	
	public AfterSignInPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=history'])[1]")
	private WebElement orderHistory;
	
	public WebElement getOrderHistory() {
		return orderHistory;
	}
	
	@FindBy(xpath="//a[@title='Credit slips']")
	private WebElement myCreditSlips;
	
	public WebElement getMyCreditSlips() {
		return myCreditSlips;
	}
	
	@FindBy(xpath="//a[@title='Addresses']")
	private WebElement myAddress;
	
	public WebElement getMyAddress() {
		return myAddress;
	}
	
	@FindBy(xpath="//a[@title='Information']")
	private WebElement myPersonalInformation;
	
	public WebElement getMyPersonalInformation() {
		return myPersonalInformation;
	}
	
	@FindBy(xpath="//a[@title='My wishlists']")
	private WebElement myWishlists;
	
	
	public WebElement getMyWishlists() {
		return myWishlists;
	}
	
	@FindBy(xpath="//a[@title='Home']")
	private WebElement home;
	
	public WebElement getHome() {
		return home;
	}
}

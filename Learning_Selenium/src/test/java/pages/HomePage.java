package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactUs;
	
	public WebElement getContactUs() {
		return contactUs;
	}
	
	@FindBy(xpath="//a[contains(text(), 'Sign in')]")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	@FindBy(xpath="//input[@id= 'search_query_top']")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
		
	public void setSearch(String searchValue) {
		search.sendKeys(searchValue);
	}
	
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement submitButton;
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	@FindBy(xpath="//a[@title= 'View my shopping cart']")
	private WebElement cart;
	
	public WebElement getCart() {
		return cart;
	}	
	
	@FindBy(xpath="//a[@title= 'Women']") 
	private WebElement womenMenu;
	
	public WebElement getWomenMenu() {
		return womenMenu;
	}
	
	@FindBy(xpath="(//a[@class= 'sf-with-ul'])[4]")
	private WebElement dresses;
	
	public WebElement getDresses() {
		return dresses;
	}
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement tShirts;
	
	public WebElement getTShirts() {
		return tShirts;
	}
		
	@FindBy(xpath="//a[@class= 'homefeatured']")
	private WebElement popular;
	
	public WebElement getPopular() {
		return popular;
	}
	
	@FindBy(xpath="//a[@href='#blockbestsellers']")
	private WebElement bestSellers;
	
	public WebElement getBestSellers() {
		return bestSellers;
	}
		
	@FindBy(xpath="//input[@class= 'inputNew form-control grey newsletter-input']")
	private WebElement newsLetter;
	
	public WebElement getNewsLetter() {
		return newsLetter;
	}
		
	public void setNewsLetter(String emailValue) {
		newsLetter.sendKeys(emailValue);
	}
	
	@FindBy(xpath="//h4[text()='Categories']")
	private WebElement categories;
	
	public WebElement getCategories() {
		return categories;
	}
	
	@FindBy(xpath="(//a[contains(text(), 'Women')])[2]")
	private WebElement womenInCategories;
	
	public WebElement getWomenInCategories() {
		return womenInCategories;
	}
	
	@FindBy(xpath="//h4[text()='Information']")
	private WebElement information;
	
	public WebElement getInformation() {
		return information;
	}
	
		
	@FindBy(xpath="//a[@title='Specials']")
	private WebElement infoSpecials;
	
	public WebElement getinfoSpecials() {
		return infoSpecials;
	}
	
	@FindBy(xpath="//a[@title='New products']")
	private WebElement infoNewProducts;
	
	public WebElement getInfoNewProducts() {
		return infoNewProducts;
	}
	
	@FindBy(xpath="//a[@title='Best sellers']")
	private WebElement infoBestSellers;
	
	public WebElement getInfoBestSellers() {
		return infoBestSellers;
	}
	
	@FindBy(xpath="//a[@title='Our stores']")
	private WebElement infoOurStores;
	
	public WebElement getInfoOurStores() {
		return infoOurStores;
	}
	
	@FindBy(xpath="//a[@title='Contact us']")
	private WebElement infoContactUs;
	
	public WebElement getInfoContactUs() {
		return infoContactUs;
	}
	
	@FindBy(xpath="//a[@title='Terms and conditions of use']")
	private WebElement infoTerms;
	
	public WebElement getInfoTerms() {
		return infoTerms;
	}
	
	@FindBy(xpath="//a[@title='About us']")
	private WebElement infoAboutUs;
	
	public WebElement getInfoAboutUs() {
		return infoAboutUs;
	}
	
	@FindBy(xpath="//a[@title='Sitemap']")
	private WebElement infoSiteMap;
	
	public WebElement getinfoSiteMap() {
		return infoSiteMap;
	}
	
	@FindBy(xpath="//a[@title='Manage my customer account']")
	private WebElement myAccount;
	
	public WebElement getMyAccount() {
		return myAccount;
	}
	
	@FindBy(xpath="//a[@title='My orders']")
	private WebElement orders;
	
	public WebElement getOrders() {
		return orders;
	}
	
	@FindBy(xpath="//a[@title='My credit slips']")
	private WebElement creditSlips;
	
	public WebElement getCreditSlips() {
		return creditSlips;
	}
	
	@FindBy(xpath="//a[@title='My addresses']")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(xpath="//a[@title='Manage my personal information']")
	private WebElement personalInfo;
	
	public WebElement getpersonalInfo() {
		return personalInfo;
	}
	
	}
	
	
	
	
	
	
	
	
	
	


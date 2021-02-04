package log4j_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	WebDriver driver = null;
	
	public CreateAccountPage(WebDriver driver) {
	    this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Create an account']")
	private WebElement createAccountPageText;
	
	public WebElement getCreateAccountPageText() {
		return createAccountPageText;
	}
	
	@FindBy(id="id_gender1")
	private WebElement male;
	
	@FindBy(id="id_gender2")
	private WebElement female;
	
	public void setGender(String gender) {
		if(gender.equals("male")) {
			male.click();
		} else if(gender.equals("female")) {
			female.click();
		} else {
			System.out.println("Invalid gender");
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement FirstName;
	
	public WebElement getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstNameValue) {
		FirstName.sendKeys(firstNameValue);
	}
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement LastName;
	
	public WebElement getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastNameValue) {
		LastName.sendKeys(lastNameValue);
	} 
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement createPassword;
	
	public WebElement getCreatePassword() {
		return createPassword;
	}
	
	public void setCreatePassword(String createPasswordValue) {
		createPassword.sendKeys(createPasswordValue);
	}
	
	@FindBy(id="days")
	private WebElement days;
	
	public void setDays(String date) {
		Select day = new Select(days);
		day.selectByValue(date);
	}
	
	@FindBy(id="months")
	private WebElement months;
	
	public void setMonths(String date) {
		Select month = new Select(months);
		month.selectByValue(date);
	}
	
	@FindBy(id="years")
	private WebElement years;
	
	public void setYears(String year_1) {
		Select year = new Select(years);
		year.selectByValue(year_1);
	}
	
	/*
	 * @FindBy(id="days") private WebElement days;
	 * 
	 * public void setDays(String date) { Select day = new Select(days);
	 * day.selectByVisibleText(date); }
	 * 
	 * @FindBy(id="months") private WebElement months;
	 * 
	 * public void setMonths(String date) { Select month = new Select(months);
	 * month.selectByValue(date); }
	 * 
	 * @FindBy(id="years") private WebElement years;
	 * 
	 * public void setYears(int date) { Select year = new Select(years);
	 * year.selectByIndex(date); }
	 */
	
	@FindBy(xpath="//input[@id='newsletter']")
	private WebElement newsletter;
	
	public void setNewsletter() {
		 newsletter.click();
	}
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstNameInAddress;
	
	public WebElement getFirstNameInAddress() {
		return firstNameInAddress;
	}
	
	public void setFirstNameInAddress(String firstNameInAddressVal) {
		firstNameInAddress.sendKeys(firstNameInAddressVal);
	}
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastNameInAddress;
	
	public WebElement getLastNameInAddress() {
		return lastNameInAddress;
	}
	
	public void setLastNameInAddress(String lastNameInAddressVal) {
		lastNameInAddress.sendKeys(lastNameInAddressVal);
	}
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement companyName;
	
	public WebElement getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyNameValue) {
		companyName.sendKeys(companyNameValue);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	public WebElement getAddress1() {
		return address1;
	}
	
	public void setAddress1(String address1Value) {
		address1.sendKeys(address1Value);
	}
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;
	
	public WebElement getAddress2() {
		return address2;
	}
	
	public void setAddress2(String address2Value) {
		address2.sendKeys(address2Value);
	}
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	public void setCity(String cityValue) {
		city.sendKeys(cityValue);
	}
	
	
	@FindBy(xpath="//input[@id='id_state']")
	private WebElement state;
	
	public WebElement getState() {
		return state;
	}
	
	public void setState(String stateValue) {
		Select state_1= new Select(state);
		state_1.selectByValue(stateValue);
	}
	
	@FindBy(xpath="//input[@id='id_country']")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	
	public void setCountry(String countryVal) {
		Select country_1= new Select(country);
		country_1.selectByValue(countryVal);
	}
	
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement postcode;
	
	public WebElement getPostcode() {
		return postcode;
	}
	
	public void setPostcode(String postcodeVal) {
		postcode.sendKeys(postcodeVal);
	}
	
	@FindBy(xpath="//textarea[@id='other']")
	private WebElement additionalInfo;
	
	public WebElement getAdditionalInfo() {
		return additionalInfo;
	}
	
	public void setAdditionalInfo(String additionalInfoVal) {
		additionalInfo.sendKeys(additionalInfoVal);
	}
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneNum;
	
	public WebElement getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNumber) {
		phoneNum.sendKeys(phoneNumber);
	}
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement mobileNum;
	
	public WebElement getMobileNum() {
		return mobileNum;
	}
	
	public void setMobileNum(String mobileNumber) {
		mobileNum.sendKeys(mobileNumber);
	}
	
	@FindBy(xpath="//input[@id='alias']")
	private WebElement alternateAddress;
	
	public WebElement getAlternateAddress() {
		return alternateAddress;
	}
	
	public void setAlternateAddress(String alternateAddressVal) {
		alternateAddress.sendKeys(alternateAddressVal);
	}
	
	@FindBy(xpath="//button[@id='submitAccount']")
	private WebElement registerButton;
	
	public WebElement getRegisterButton() {
		return registerButton;
	}
}

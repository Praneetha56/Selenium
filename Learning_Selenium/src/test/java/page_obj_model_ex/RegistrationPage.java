package page_obj_model_ex;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	WebDriver driver = null;
	
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@id = 'enterimg']")
	private WebElement signUp;
	
	public WebElement getSignUp() {
		return signUp;
	}
	
	
	@FindBy(xpath="//input[@type = 'text' and @placeholder = 'First Name']")
	private WebElement firstName;
	
	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	
	@FindBy(xpath="//input[@type = 'text' and @placeholder = 'Last Name']")
	private WebElement lastName;
	
	public void setLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	
	@FindBy(xpath="//textarea[@ng-model= 'Adress']")
	private WebElement address;
	
	public void setAddress(String addressVal) {
		address.sendKeys(addressVal);
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	
	@FindBy(xpath="//input[@type='email' and @ng-model= 'EmailAdress']")
	private WebElement email;
	
	public void setEmail(String emailid) {
		email.sendKeys(emailid);
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	
	@FindBy(xpath="//input[@type='tel' and @ng-model= 'Phone']")
	private WebElement phoneNum;
	
	public void setPhoneNum(String mobilenum) {
		phoneNum.sendKeys(mobilenum);
	}
	
	public WebElement getPhoneNum() {
		return phoneNum;
	}
	
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement male;
	
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement female;
	
	public void setGender(String gender) {
		if(gender.equals("male")) {
			male.click();
		}
		
		if(gender.equals("female")) {
			female.click();
		} else {
			System.out.println("Invalid gender");
		}
	}
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Cricket']")
	private WebElement hobbyCricket;
	
	public void setHobbyCricket() {
		hobbyCricket.click();
	}
	
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Movies']")
	private WebElement hobbyMovies;
	
	public void setHobbyMovies() {
		hobbyMovies.click();
	}
	
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Hockey']")
	private WebElement hobbyHockey;
	
	public void setHobbyHockey() {
		hobbyHockey.click();
	}
	
	
	@FindBy(xpath="//div[@id='msdd']") 
	private WebElement Lang;
	
	public void setLang() {
		Lang.click();
	}
	
	
	@FindBy(xpath="//div[@id='msdd']/following::li/a")
	private List<WebElement> language;
	

	
	
	public void setLanguage(String lang) {
		
	for(WebElement lan : language)
	{
		String link = lan.getText();
		if(link.contains(lang))
		{
			lan.click();
		}
	}
	}
	
	
	
	
	@FindBy(id="Skills")
	private WebElement Select;
	
	public void select(String selectSkill) throws InterruptedException {
		
		Select.click();
		Thread.sleep(5000);
		Select dropdown = new Select(Select);
		dropdown.selectByValue(selectSkill);
		
	}
	
	@FindBy(id="countries")
	private WebElement Select1;
	
	public void select1(String country) throws InterruptedException {
		
		Select1.click();
		
		Select dropdown = new Select(Select1);
		dropdown.selectByValue(country);
		Thread.sleep(5000);
		
	}
	
	
	@FindBy(xpath="//*[contains(@class, 'arrow')]")
	private WebElement anotherCountry;
	
	public void getAnotherCountry() {
		anotherCountry.click();
	}
	
	
	@FindBy(id="yearbox")
	private WebElement year;
	
	public void setYear(String Year) {
		year.click();
		Select Years = new Select(year);
		Years.selectByValue(Year);
	}
	
	@FindBy(xpath="//*[contains(@ng-model, 'monthbox')]")
	private WebElement months;
	
	public void setMonths(String month) {
		months.click();
		Select Months = new Select(months);
		Months.selectByValue(month);
	}
	
	@FindBy(xpath="//*[contains(@id, 'daybox')]")
	private WebElement days;
	
	public void setDays(String day) {
		days.click();
		Select Days = new Select(days);
		Days.selectByValue(day);
	}
	
	@FindBy(xpath="//*[@id = 'firstpassword']")
	private WebElement password;
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	@FindBy(xpath="//*[@id = 'secondpassword']")
	private WebElement passwordConfirm;
	
	public void setPasswordConfirm(String password) {
		passwordConfirm.sendKeys(password);
	}
	
	
	@FindBy(xpath="//*[@id = 'submitbtn']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}
	
	
	@FindBy(xpath="//*[contains(@id, 'Button')]")
	private WebElement refresh;
	
	public WebElement getRefresh() {
		return refresh;
	}
	
	
	@FindBy(xpath="//*[contains(@class, 'facebook')]")
	private WebElement facebookLink;
	
	public void getFacebookLink() {
		facebookLink.click();
	}
	
	
	@FindBy(xpath="//*[contains(@class, 'twitter')]")
	private WebElement twitterLink;
	
	public void getTwitterLink() {
		twitterLink.click();
	}
	
	
	@FindBy(xpath="//*[contains(@class, 'linkedin')]")
	private WebElement linkedinLink;
	
	public void getLinkedinLink() {
		linkedinLink.click();
	}
	
	
	@FindBy(xpath="//*[contains(@class, 'google-plus')]")
	private WebElement googlePlusLink;
	
	public void getGooglePlusLink() {
		googlePlusLink.click();
	}
	
	
	@FindBy(xpath="//*[contains(@class, 'youtube')]")
	private WebElement youtubeLink;
	
	public void getYoutubeLink() {
		youtubeLink.click();
	}
}

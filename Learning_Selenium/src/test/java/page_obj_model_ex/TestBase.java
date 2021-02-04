package page_obj_model_ex;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class TestBase {
	public WebDriver driver;
	public ChromeOptions options;
	
	protected RegistrationPage registrationPageObj;
	protected SignUpPage signUpPageObj;
	
	
	public WebDriver getDriver() {
		return driver;
	}
  
  @BeforeMethod
  public void setup() {
	  
	  System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
	  driver = new ChromeDriver(options);
	  driver.get("http://demo.automationtesting.in/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  registrationPageObj = new RegistrationPage(driver);
	  signUpPageObj = new SignUpPage(driver);
  }
  


  @AfterMethod
  public void afterMethod() {
  }

}

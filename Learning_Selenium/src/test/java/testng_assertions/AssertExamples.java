package testng_assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertExamples {
	WebDriver driver;
	ChromeOptions options;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\\\Learning_Selenium\\\\Driver_Executables\\\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
	  driver = new ChromeDriver(options);
	  driver.get("http://demo.automationtesting.in/Index.html");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  
  @Test
  public void verifyUsingAssertions() {
	  
	  WebElement signinButton = driver.findElement(By.xpath("//a[contains(@href, 'SignIn')]"));
	  Assert.assertEquals(signinButton.isEnabled(), true);
	  System.out.println("SignIn Button is Enabled");
	  
	  signinButton.click();
	  
	  WebElement emailField = driver.findElement(By.xpath("//input[contains(@ng-model, 'Email')]"));
	  Assert.assertEquals(emailField.isDisplayed(), true);
	  System.out.println("EmailId textbox is available");
	  
	  emailField.sendKeys("praneetha@test.com");
	  String EmailField = emailField.getAttribute("value");
	  System.out.println(EmailField);
	  
	  WebElement passwordField = driver.findElement(By.xpath("//input[contains(@ng-model, 'Password')]"));
	  Assert.assertEquals(passwordField.isDisplayed(), true);
	  System.out.println("Password textbox is avaialble");
	  
	  passwordField.sendKeys("Ptgad134");
	  String Password = passwordField.getAttribute("value");
	  System.out.println(Password);
	  
	  WebElement enterButton = driver.findElement(By.xpath("//img[contains(@id, 'enterbtn')]"));
	  Assert.assertEquals(enterButton.isEnabled(), true);
	  System.out.println("Enter button is Enabled");
	  
	  enterButton.click();
  }

  @AfterMethod
  public void afterMethod() {
  }

}

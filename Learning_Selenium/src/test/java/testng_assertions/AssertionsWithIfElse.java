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

public class AssertionsWithIfElse {
	WebDriver driver;
	ChromeOptions options;
	
  @BeforeMethod
  public void beforeMethod() {
	  	System.setProperty("webdriver.chrome.driver", "..\\LearnTestNG\\Driver_Executables\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		driver= new ChromeDriver(options);
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @Test
  public void verifyText() {
	  WebElement skipSigninButton = driver.findElement(By.xpath("//button[text()='Skip Sign In']"));
	  Assert.assertEquals(skipSigninButton.isEnabled(), true);
	  System.out.println("SkipSignIn Button is Enabled");
	  skipSigninButton.click();
	  
	  WebElement webTableLink = driver.findElement(By.xpath("//a[contains(@href, 'WebTable')]"));
	  Assert.assertEquals(webTableLink.isDisplayed(), true);
	  System.out.println("WebTable Link is available");
	  
	  webTableLink.click();
	  
	  String Text = driver.findElement(By.xpath("//h4[contains(text(), 'Double Click')]")).getText();
	  if(Text.contains("And")) {
		  System.out.println("Matching : PASS");
	  }else {
			  System.out.println("Not Matching : FAIL");
			  Assert.assertTrue(false);
		  
	  }
  }

  @AfterMethod
  public void afterMethod() {
  }

}

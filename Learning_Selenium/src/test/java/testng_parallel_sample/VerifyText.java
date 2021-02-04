package testng_parallel_sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

/*import static org.testng.Assert.assertTrue;*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class VerifyText {
	WebDriver driver;
	ChromeOptions options;
 
	@BeforeMethod (groups= {"Smoke", "Regression", "VerifyText", "banking"}) 
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\LearningSelenium\\Driver_Executables\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("http://automationpractice.com/");
	  System.out.println("Enter into the website");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
  }
 
	@Test  (groups= {"Smoke", "Regression", "VerifyText"}) 
  public void verifyTextOnHomePage() {
	  WebElement getTextInHomePage= driver.findElement(By.xpath("//h4[text()='Follow us on Facebook']"));
	  String text = getTextInHomePage.getText();
	  if(text.equals("Follow us on Gmail")) {
		  System.out.println("The Text is Matching : Pass");
	  }
	  else {
		  System.out.println("The Text is Not Matching :Fail");
	  }
	  Assert.assertTrue(false);
	  
  }
  
	@Test  (groups= {"Smoke", "Regression", "VerifyText"}) 
  public void verifyTextOnHomePage1() {
	  WebElement getTextInHomePage= driver.findElement(By.xpath("//h4[text()='Follow us on Facebook']"));
	  String text = getTextInHomePage.getText();
	  Assert.assertEquals(text, "Follow us on Gmail");
	  
	 
  }
  
	@Test  (groups= {"Smoke", "Regression", "VerifyText"}) 
  public void verifyTextOnHomePage2() {
	  Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='Follow us on Facebook']")).getText(),  "Follow us on Facebook");
	  System.out.println("Verified : Pass");
	 
  }
  
	@Test  (groups= {"Smoke", "Regression", "VerifyText", "banking"}) 
  public void verifyTheSearchBox() {
	  WebElement searchBox= driver.findElement(By.xpath("//input[@placeholder='Search']"));
	  Assert.assertEquals(searchBox.isDisplayed(), true);
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed(), true);
  }
	 
	@AfterMethod  (groups= {"Smoke", "Regression", "VerifyText", "banking"}) 
  public void afterMethod() {
	  driver.close();
	  System.out.println("Closed the web page");
  }

}

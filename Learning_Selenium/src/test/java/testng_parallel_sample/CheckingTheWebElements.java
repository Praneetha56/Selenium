package testng_parallel_sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CheckingTheWebElements {
	WebDriver driver;
	ChromeOptions options;
 
	@BeforeMethod /* (groups= {"Smoke", "Regression", "Check"}) */
  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "..\\LearningSelenium\\Driver_Executables\\chromedriver.exe");
	options = new ChromeOptions();
	options.addArguments("start-maximized");
	driver = new ChromeDriver(options);
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
	@Test /* (groups= {"Smoke", "Regression", "Check"}) */
  public void checkingWebElements() {
	  Assert.assertEquals(driver.findElement(By.xpath("//a[@title='Contact Us']")).isEnabled(), true);
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed(), true);
	  Assert.assertEquals(driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).isEnabled(),true);
	  Assert.assertEquals(driver.findElement(By.xpath("//a[@title='Women']")).isEnabled(), true);
	  
  }

	@AfterMethod /* (groups= {"Smoke", "Regression", "Check"}) */
  public void afterMethod() {
	  System.out.println("Close the browser.");
	  driver.close();
  }
}
package testng_practice_enabled_false;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class AnnotationsWithMethods {
	WebDriver driver;
  @Test
  public void testcase1() {
	  System.out.println("Testcase1 started");
	  Actions action = new Actions(driver);
	  WebElement search = driver.findElement(By.xpath("//*[contains(@id, 'query')]"));
	  search.sendKeys("DRESSES");
	  String searchval = search.getAttribute("value");
	  action.moveToElement(search).doubleClick().build().perform();
	  System.out.println(searchval);
	  System.out.println("Testcase1 ended");
  }
  
  @Test(enabled = false)
	public void testcase2() {
	  	System.out.println("Testcase2 started");
		driver.findElement(By.xpath("//*[contains(@title, 'shopping')]")).click();
		String text = driver.findElement(By.xpath("//*[contains(@id, 'cart_title')]")).getText();
		System.out.println(text);
		System.out.println("Testcase2 ended");
	}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  System.out.println("I am from before method");
	  System.out.println("Enter into browser and navigating to the web page");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from the after method");
	  System.out.println("Closing the browser");
	  driver.close();
  }

}

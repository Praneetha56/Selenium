package testng_parallel_sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Navigate2 {
	WebDriver driver;
	ChromeOptions options;
	
  @BeforeMethod(groups= {"Smoke", "Regression", "Navigate"})
	  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\LearningSelenium\\Driver_Executables\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("http://automationpractice.com/");
	  System.out.println("Enter into the website"); 
	  }
  
  @Test(groups= {"Smoke", "Regression", "Navigate"})
  public void Navigate() {
	  driver.findElement(By.linkText("Contact us")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   driver.navigate().back();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   driver.navigate().forward();
   System.out.println("Navigation is done.");
		
	  
  }
 

  @AfterMethod(groups= {"Smoke", "Regression", "Navigate"})
  public void afterMethod() {
	  System.out.println("Close the browser.");
	  driver.close();
  }

}

package testng_parallel_sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class GetText_1 {
	WebDriver driver;
	ChromeOptions options;
  
  @BeforeMethod(groups= {"Smoke", "Regression", "GetText"})
	  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\LearningSelenium\\Driver_Executables\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("http://automationpractice.com/");
	  System.out.println("Enter into the website");
	  }
  
  @Test(groups= {"Regression",  "GetText"})
  public void GetTextFromAP() {
	  driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("DRESSES");
	  String searchValue=driver.findElement(By.xpath("//input[@id='search_query_top']")).getAttribute("value");
	  System.out.println("The value in the text box is : "+searchValue);
	  System.out.println(driver.findElement(By.xpath("//input[@id='search_query_top']")).getAttribute("class"));
  }


  @AfterMethod(groups= {"Smoke", "Regression", "GetText"})
  public void afterMethod() {
	  System.out.println("Close the browser.");
	  driver.close();
  }

}

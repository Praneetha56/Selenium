package testng_parallel_sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Login_2 {
	WebDriver driver;
	ChromeOptions options;
  
  @BeforeClass(groups= {"Smoke", "Regression", "Login"})
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "..\\LearningSelenium\\Driver_Executables\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("http://automationpractice.com/");
	  System.out.println("Enter into the website");
  }
  
  @Test(groups= {"Smoke", "Regression", "Login"})
  public void Login2() {
	  driver.findElement(By.xpath("//a[@class='login']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praneetha63@test.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abcdef");
		System.out.println("Succesfully Logged In");
  }

  @AfterClass(groups= {"Smoke", "Regression", "Login"})
  public void afterClass() {
	  System.out.println("Close the browser.");
	  driver.close();
  }

}

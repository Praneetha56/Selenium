package testng_grouping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class GroupingSample_3 {
	
	WebDriver driver;
	
  @BeforeClass(groups= {"Smoke" , "Regression"})
	  public void beforeClass() {
	  	System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
	  	driver = new ChromeDriver();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	driver.get("http://automationpractice.com/index.php");
	  	driver.manage().window().maximize();
	  	System.out.println("I am from before class");
	  	System.out.println("Enter into browser and navigating to the web page");
	  }

  @Test(groups= {"Smoke", "Regression"})
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
  
  @Test(groups= {"Regression"})
  public void navigateRefresh() throws Exception {
	  Select subjectHeading = new Select(driver.findElement(By.id("id_contact")));
	  subjectHeading.selectByValue("2");
	  driver.findElement(By.xpath("(//*[contains(@class, 'grey')])[1]")).sendKeys("kunni@test.com");
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[contains(@class, 'logo ')]")).click();
	  Thread.sleep(3000);
  }
  
  @Test(groups= {"Smoke"})
  public void clickOnBestSellers() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[text()= 'Best Sellers']")).click();
  }
  
  @AfterClass(groups= {"Smoke", "Regression"}) 
  public void afterClass() {
	  System.out.println("I am from the after class");
	  System.out.println("Closing the browser");
	  driver.close();
  }

}

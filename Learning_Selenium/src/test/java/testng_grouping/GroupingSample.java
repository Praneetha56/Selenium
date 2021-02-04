package testng_grouping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class GroupingSample {
	
	WebDriver driver;
 
  @BeforeMethod(groups= {"Smoke" , "Regression"})
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  System.out.println("I am from before class");
	  System.out.println("Enter into browser and navigating to the web page");
  }
  
  
  @Test(groups= {"Regression"})
  public void CreateAccount() {
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kunni25@test.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Praneetha");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abcdef");
		Select Day = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		Day.selectByVisibleText("4  ");
		Select Month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		Month.selectByValue("6");
		Select Year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		Year.selectByIndex(20);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Kunni");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Digital Cutlet");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("28-308/2020, 50035");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Pearl Apartments, No.104");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
		Select State = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		State.selectByValue("5");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("50035");
		Select Country = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
		Country.selectByValue("21");
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("this is additional information text area");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123457890");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("2345678876");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("alternate address");
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		System.out.println("Created a new account");
	}
  	
  
  @Test(groups= {"Smoke"})
  public void clickOnWomanLink() throws InterruptedException {
	  driver.findElement(By.xpath("(//*[@title='Women'])[1]")).click();
	  driver.findElement(By.xpath("(//*[@class='replace-2x'])[2]")).click();
	  driver.findElement(By.xpath("//*[contains(@class, 'product_img_link')] ")).click();
	  Thread.sleep(3000);
  }
  	
  @AfterMethod(groups= {"Smoke" , "Regression"})
  public void afterMethod() {
	  System.out.println("I am from the after class");
	  System.out.println("Closing the browser");
	  driver.close();
  }

}

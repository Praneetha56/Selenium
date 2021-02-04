package testng_parallel_sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class APByXpathsTest {
	WebDriver driver;
	ChromeOptions options;
  
  @BeforeMethod(groups= {"Smoke", "Regression", "CreateAccount"})
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "..\\LearningSelenium\\Driver_Executables\\chromedriver.exe");
	  options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver = new ChromeDriver(options);
	  driver.get("http://automationpractice.com/");
	  System.out.println("Enter into the website");
	  }
  
  @Test(groups= {"Smoke", "Regression", "CreateAccount"})
  public void CreateAccount_1() {
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("praneetha433@test.com");
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
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Praneetha");
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
	
 

  @AfterMethod(groups= {"Smoke", "Regression", "CreateAccount"})
  public void afterMethod() {
	  System.out.println("Close the browser.");
	  driver.close();
  }

}

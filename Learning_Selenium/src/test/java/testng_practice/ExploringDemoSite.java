package testng_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExploringDemoSite {
	WebDriver driver;
	ChromeOptions options;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "..\\LearnTestNG\\Driver_Executables\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		driver= new ChromeDriver(options);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
  @Test
  public void register() {
	  
	  driver.findElement(By.xpath("(//*[contains(@class, 'form-control')])[1]")).sendKeys("Praneetha");
	  System.out.println("Firstname is : "+ driver.findElement(By.xpath("(//*[contains(@class, 'form-control')])[1]")).getAttribute("value"));
	  
	  driver.findElement(By.xpath("(//*[contains(@class, 'form-control')])[2]")).sendKeys("Reddy");
	  System.out.println("Lastname is : "+ driver.findElement(By.xpath("(//*[contains(@class, 'form-control')])[2]")).getAttribute("value"));
	  
	  driver.findElement(By.xpath("(//*[contains(@class, 'form-control')])[3]")).sendKeys("Address");
	  System.out.println("Address is : "+ driver.findElement(By.xpath("(//*[contains(@class, 'form-control')])[3]")).getAttribute("value"));
	  
	  driver.findElement(By.xpath("//*[contains(@type, 'email')]")).sendKeys("praneetha@test.com");
	  System.out.println("Email : " +driver.findElement(By.xpath("//*[contains(@type, 'email')]")).getAttribute("value"));
	 
	  driver.findElement(By.xpath("//*[contains(@type, 'tel')]")).sendKeys("8753332273");
	  System.out.println("Mobile number  : " +driver.findElement(By.xpath("//*[contains(@type, 'tel')]")).getAttribute("value"));
	 
	  driver.findElement(By.xpath("(//*[contains(@type, 'radio')])[2]")).click();
	  System.out.println("Gender : " +driver.findElement(By.xpath("(//*[contains(@type, 'radio')])[2]")).getAttribute("value"));
	  
	  driver.findElement(By.id("checkbox2")).click();
	  System.out.println("Hobbies: " +driver.findElement(By.id("checkbox2")).getAttribute("value"));
	  
	  driver.findElement(By.xpath("//*[contains(@class, 'multiselect')]")).click();
	  driver.findElement(By.xpath("//*[text() = 'English']")).click();
	 
	  Select skill = new Select(driver.findElement(By.id("Skills")));
	  skill.selectByValue("Software");
	  System.out.println("get skills : " +driver.findElement(By.xpath("//select[@id='Skills']")).getAttribute("value"));
	  
	  Select country = new Select(driver.findElement(By.id("countries")));
	  country.selectByValue("India");
	  System.out.println("get country : " +driver.findElement(By.xpath("//select[@id='countries']")).getAttribute("value"));
	  
	  Select Country = new Select(driver.findElement(By.id("country")));
	  Country.selectByValue("India");
	  System.out.println("get Country : " +driver.findElement(By.xpath("//select[@id='country']")).getAttribute("value"));
	  
	  Select year = new Select(driver.findElement(By.id("yearbox")));
	  year.selectByVisibleText("1991");
	  System.out.println("get year : " +driver.findElement(By.xpath("//select[@id='yearbox']")).getAttribute("value"));
	  
	  Select month = new Select(driver.findElement(By.xpath("//*[contains(@placeholder, 'Month')]")));
	  month.selectByVisibleText("March");
	  System.out.println("get month : " +driver.findElement(By.xpath("//*[contains(@placeholder, 'Month')]")).getAttribute("value"));
	 
	  Select day = new Select(driver.findElement(By.id("daybox")));
	  day.selectByVisibleText("5");
	  System.out.println("get day : " +driver.findElement(By.xpath("//select[@id='daybox']")).getAttribute("value"));
	 
	  driver.findElement(By.xpath("//*[contains(@id, 'firstpassword')]")).sendKeys("Ptgad134");
	  driver.findElement(By.xpath("//*[contains(@id, 'secondpassword')]")).sendKeys("Ptgad134");
	  driver.findElement(By.id("submitbtn")).click();
	  
  }
  
  @AfterMethod
  public void aftermethod() {
	  
  }
}

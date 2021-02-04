package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavaScriptDOM_Method {
	
	WebDriver driver;
  @Test
  public void searchBox() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.bigbasket.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  Actions action = new Actions(driver);
	  WebElement search = driver.findElement(By.xpath("//*[@id='input']"));
	  action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("colgate").build().perform();
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  String execute = "return document.getElementById(\"input\").value";
	  System.out.println(execute);
	  String result = (String) js.executeScript(execute);
	  System.out.println("The value is : " +result);
	  
	  
  }
}


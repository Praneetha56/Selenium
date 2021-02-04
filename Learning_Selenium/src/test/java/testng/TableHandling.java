package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableHandling {
	WebDriver driver;
  @Test
  public void readTableContent() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/html_tables.asp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  List<WebElement> elements = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/td[2]"));
	  
	  System.out.println(elements.get(0).getText());
	  System.out.println(elements.get(1).getText());
	  
	  int size = elements.size();
	  
	  for(int i = 0; i<size; i++) {
		  String result = elements.get(i).getText();
		  System.out.println("The Contact Name : " +result);
	  }
	  
	  List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
	  
	  int rowSize = rows.size();
	  
	  for(int j=0; j<rowSize; j++) {
		  String resultRow = rows.get(j).getText();
		  System.out.println("The values of this Row is: " +resultRow);
	  }
  }  
  
}

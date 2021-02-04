package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingTextFromTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//*[contains(@placeholder, 'Search')]"));
	    search.sendKeys("DRESSES");
	    
	    String s = search.getAttribute("value");
	    System.out.println("The value in the search box is : " +s);
	    
	    String getAttributes = search.getAttribute("type");
	    System.out.println("The value of attribute Type : " +getAttributes); 
	    
	    String getAttr = search.getAttribute("class");
	    System.out.println("The value of attribute Class : " +getAttr);
		
		
		
		
	}

}

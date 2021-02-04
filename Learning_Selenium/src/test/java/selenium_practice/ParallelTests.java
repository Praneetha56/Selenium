package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {
	
	
	@Test
	public void getFireFox() {
		System.setProperty("webdriver.gecko.driver", "..\\Learning_Selenium\\Driver_Executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("GetFireFox method is running on the thread: " + Thread.currentThread().getId());
		driver.get("http://automationpractice.com/index.php");
		driver.close();
	}
	
	@Test
	public void getChrome() {
		System.setProperty("webdriver.chrome.driver","..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("GetChrome method is running on the thread: " +Thread.currentThread().getId());
		driver.get("http://automationpractice.com/index.php");
		driver.close();
		
	}
  
}

package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//1.navigate.to
		
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//2.navigate.back
		
		driver.findElement(By.xpath("//*[contains(@title, 'shopping cart')]")).click();
		driver.navigate().back();
		
		//3.navigate.forward
		
		driver.navigate().forward();
		
		//4.navigate.refresh
		
		driver.findElement(By.xpath("//*[contains(@alt, 'My Store')]")).click();
		driver.findElement(By.xpath("//*[contains(@class, 'search_query ')]")).sendKeys("DRESSES");
		driver.navigate().refresh();
		
	}

	
}

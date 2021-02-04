package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateSearchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		String key = "DRESSES";
		driver.findElement(By.xpath("//*[contains(@name, 'search_query')]")).sendKeys(key);
		driver.findElement(By.xpath("//*[contains(@class, 'button-search')]")).click();
		
		String searchText = driver.findElement(By.xpath("//*[contains(@class, 'lighter')]")).getText();
		System.out.println(searchText);
		
		if(searchText.contains(key)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

}

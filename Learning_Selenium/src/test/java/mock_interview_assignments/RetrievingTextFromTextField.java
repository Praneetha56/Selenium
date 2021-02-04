package mock_interview_assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RetrievingTextFromTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized" , "--disable-gpu" , "--disable-notifications" , "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		element.sendKeys("DRESSES");
		String retrieveText = element.getAttribute("value");
		System.out.println("Retrieved Text from the Webpage : " +retrieveText);
		driver.quit();
		
	}

}

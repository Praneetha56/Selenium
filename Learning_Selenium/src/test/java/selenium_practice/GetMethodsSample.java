package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. get()
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//2. getCurrentURL
		
		String url = driver.getCurrentUrl();
		System.out.println("The Current URL : " +url);
		
		String key = "DRESSES";
		driver.findElement(By.xpath("//*[contains(@name, 'search_query')]")).sendKeys(key);
		driver.findElement(By.xpath("//*[contains(@class, 'button-search')]")).click();
		
		//3.getText
		
		String searchText = driver.findElement(By.xpath("//*[contains(@class, 'lighter')]")).getText();
		System.out.println(searchText);
		
		if(searchText.contains(key)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		String url2 = driver.getCurrentUrl();
		System.out.println("Now the Current URL : " +url2);
		
		//4.getTitle
		
		driver.findElement(By.linkText("Contact us")).click();
		String currentPageTitle = driver.getTitle();
		System.out.println("CurrentPage Title : " +currentPageTitle);
		
		
		//5.getPageSource
		
		String sourceCode = driver.getPageSource();
		System.out.println("The current page source code : " +sourceCode);
		
	}

}

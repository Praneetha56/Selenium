package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
		driver.close();
	}

}

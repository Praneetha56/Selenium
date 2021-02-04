package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://javascript.info/alert-prompt-confirm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#' and @class='toolbar__button toolbar__button_run']")).click();
		String getAlertBoxText = driver.switchTo().alert().getText(); // getting text in the alert box
		System.out.println(getAlertBoxText);
		driver.switchTo().alert().accept();
		
		
	}

}

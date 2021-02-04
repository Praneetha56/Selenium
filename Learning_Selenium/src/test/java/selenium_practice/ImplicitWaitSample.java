package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kiwi5@test.com");
		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Sakruthi");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
	}

}

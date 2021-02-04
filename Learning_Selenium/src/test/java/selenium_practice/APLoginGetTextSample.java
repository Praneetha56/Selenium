package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APLoginGetTextSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiwi2@test.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		String text = driver.findElement(By.xpath("//p[contains(@class, 'info-account')]")).getText();
		System.out.println("The Text from the Login Page : " +text);
		
		String WebpageText = "Welcome to your account. Here you can manage all of your personal information and orders.";
		if(text.contentEquals(WebpageText)) {
			System.out.println("The Webpage text and retrieved text are MATCHING");
		} else {
			System.out.println("The Webpage text and retrieved text are NOT MATCHING");
		}
	}

}

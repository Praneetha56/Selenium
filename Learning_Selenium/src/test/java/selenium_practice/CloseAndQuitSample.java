package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://javascript.info/popup-windows");
		driver.manage().window().maximize();
		
		
		//when we click the below link a separate window pops up.
		driver.findElement(By.xpath("(//a[@class = 'toolbar__button toolbar__button_run' and @href = '#'])[3]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// In order to close the child windows too, we need to use driver.quit instead of close. 
		// driver.close closes only the currently active window or parent window.
		// but driver.quit closes the driver and closes every associated window
		driver.quit();
	}

}

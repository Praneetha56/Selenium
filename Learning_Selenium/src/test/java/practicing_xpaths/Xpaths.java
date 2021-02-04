package practicing_xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@src, 'All_Home-Kitchen')]")).click();
		driver.findElement(By.xpath("//*[contains(text(), 'Bakeware')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Ice Pop Moulds ')]")).click();
		driver.findElement(By.xpath("//span[text()='SAVE']"));
		WebElement productInfo = driver.findElement(By.xpath("//*[contains(@id,'about')][1]"));
		String getProductInfo = productInfo.getText();
		System.out.println(getProductInfo);
	}

}

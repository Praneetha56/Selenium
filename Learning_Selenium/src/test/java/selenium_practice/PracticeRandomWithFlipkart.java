package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeRandomWithFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chrome,driver", "..\\\\Learning_Selenium\\\\Driver_Executables\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certification-errors");
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//*[contains(@class, 'LK')]"));
		search.sendKeys("iPhone under 40000" +Keys.ENTER);
		WebElement navigatedToPage = driver.findElement(By.xpath("//*[contains(@class, 'Ermr')]"));
		System.out.println("Navigated to the Correct Respective Page : "  +navigatedToPage);
		WebElement displayName = driver.findElement(By.xpath("(//*[contains(@class, 'col-7')]/div[contains(@class, '4r')])[1]"));
		WebElement displayPrice = driver.findElement(By.xpath("(//*[contains(@class, 'WHN1')])[1]"));
		WebElement displayRating = driver.findElement(By.xpath("(//*[contains(@class, 'DZ')]/span/span)[1]"));
		WebElement displayName1 = driver.findElement(By.xpath("(//*[contains(text(), '7 Plus ')])[1]"));
		WebElement displayPrice1 = driver.findElement(By.xpath("(//*[contains(@class, 'WHN1')])[4]"));
		WebElement displayRating1 = driver.findElement(By.xpath("(//*[contains(text(), 'Ratings')])[5]"));
		WebElement displayName2 = driver.findElement(By.xpath("(//*[contains(@class, 'col-7')]/div[contains(@class, '4r')])[1]"));
		WebElement displayPrice2 = driver.findElement(By.xpath("(//*[contains(@class, 'WHN1')])[1]"));
		WebElement displayRating2 = driver.findElement(By.xpath("(//*[contains(@class, 'DZ')]/span/span)[1]"));
		
	}

}

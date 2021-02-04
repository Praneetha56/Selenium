package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ExploreGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.google.com/");
		WebElement googleSelect = driver.findElement(By.xpath("//input[@title='Search']"));
		googleSelect.sendKeys("w3schools"+Keys.ARROW_DOWN.ENTER);
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='w3schools']"))).build().perform();
		String googleSelectedWebpageText = driver.findElement(By.xpath("(//h2[@class='Uo8X3b'])[4]")).getText();
		Boolean compare = googleSelectedWebpageText.contentEquals("W3Schools is an educational website");
		System.out.println(googleSelectedWebpageText);
		System.out.println(compare);
	}

}

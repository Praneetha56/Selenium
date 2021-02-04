package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExploreAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7093351320");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Praneetha");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		driver.findElement(By.linkText("Your Seller Account")).click();
		driver.navigate().back();
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("dresses");
		action.moveToElement(search).doubleClick().build().perform();
		WebElement storeOrdersLink = driver.findElement(By.xpath("//a[@id='nav-orders']"));
		if(storeOrdersLink.isDisplayed()) {
			storeOrdersLink.click();
	    }
		WebElement openOrders = driver.findElement(By.xpath("//a[contains (text(),  'Open Orders')]"));
		Assert.assertEquals(openOrders.isEnabled(), true);
		openOrders.click();
		driver.findElement(By.linkText("Customer Service")).click();
		String others = driver.findElement(By.xpath("//a[@class='active']")).getAttribute("rel");
		System.out.println(others);
		driver.close();
		
	}
}
*/
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("Brushes"); 
		String retrieveText = element.getAttribute("value");
		System.out.println(retrieveText);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
	}
}
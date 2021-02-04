package mock_interview_assignments;

import static org.testng.Assert.assertNotNull;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetDetailsOfTheProductFromCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized","--disable-gpu","--disable-notifications","--ignore-certificate-errors","--window-size=1920,1200");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		
		WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
		searchElement.sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")));
		WebElement searchResults = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		assertNotNull(searchResults);
		String verifyText = searchResults.getText();
		System.out.println("Navigated to the correct page : " +verifyText);
		WebElement selectedProduct = driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium']"));
		String retrieveSelectedProduct = selectedProduct.getText();
		System.out.println("Product Details :" +retrieveSelectedProduct.replaceAll("₹","₹"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='a-link-normal a-text-normal']")));
		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']")).click();
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> childWindowsHandle = driver.getWindowHandles();
        Iterator<String> childWindow = childWindowsHandle.iterator();
        while (childWindow.hasNext()) {
            String ChildWindow = childWindow.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.xpath("//*[contains(@id,'cart-announce')]")).click(); 
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@class, 'attach-button-large')][1]")));
        //driver.findElement(By.xpath("//*[contains(@class, 'attach-button-large')][1]")).click();
        WebElement inCart = driver.findElement(By.xpath("//*[contains(@class,'a-vertical a-spacing-mini')][1]"));
        String inCartDetails = inCart.getText();
        System.out.println("The details of the Product that is added to Cart : " +inCartDetails.trim());
        String quantity = driver.findElement(By.xpath("//input[@type='text' and @name='quantityBox' and @value='1']")).getText();
        System.out.println(quantity);
        String price = driver.findElement(By.xpath("//p[@class='a-spacing-small']")).getText();
        System.out.println("Price :"+"₹"+price.trim());
        }
     }
	}
}

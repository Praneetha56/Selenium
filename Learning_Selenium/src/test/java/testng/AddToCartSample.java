package testng;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartSample {
	
	WebDriver driver;
 
	@Test
  public void addToCart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..\\\\Learning_Selenium\\\\Driver_Executables\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/ps/?q=Vegetables&nc=nb&tp=fresh-vegetables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String[] veggies = {"Ridge Gourd/Beerakaya","Carrot Local/Carrot","Coccinia/Dondakaya"};
		
		List<WebElement> vegList = driver.findElements(By.xpath("//div[@qa='product_name']//a[@class='ng-binding']"));
		for(int i = 0; i<vegList.size(); i++) {
			
			List veggieList = Arrays.asList(veggies);
			
			String veg = vegList.get(i).getText();
			
			if(veggieList.contains(veg)) {
				System.out.println("Found: " +veg);
				
				//WebElement element = driver.findElement(By.xpath("(//button[contains(text(),'Add')])"));
				
				/*
				 * JavascriptExecutor js = (JavascriptExecutor)driver; String execute =
				 * "return document.getElementByXpath(\"//button[contains(text(),'Add')]\").value"
				 * ; String result = (String) js.executeScript(execute);
				 * System.out.println(result);
				 */
				
				String elements = "//a[text()='"+veg+"']/parent::div[@class ='col-sm-12 col-xs-7 prod-name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[contains(text(),'Add')]";
				System.out.println(elements);
				
				Thread.sleep(10000);
				
				driver.findElement(By.xpath(elements)).click();
				
				WebElement Continue = driver.findElement(By.xpath("(//a[text()='Continue'])[1]"));
				
				if(Continue.isDisplayed() && Continue.isEnabled()) {
					Continue.click();
				}
			} else {
				System.out.println("Not Found : " +veggieList.get(i));
			}
		}
  }
}

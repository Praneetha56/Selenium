package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Verify;

public class ExploreFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Actions action = new Actions(driver);
		//action.click(driver.findElement(By.xpath("//input[@class='LM6RPg']"))).build().perform();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7093351320");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Praneetha");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@href='/viewcart?otracker=Cart_Icon_Click']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='My Cart']")));
		String myCartText = driver.findElement(By.xpath("//div[text()='My Cart']")).getText();
		System.out.println(myCartText);
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Flipkart']")));
		String exploreText = driver.findElement(By.xpath("//a[text()='Explore']")).getText();
		driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
	    System.out.println(exploreText);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text() , 'Baby & Kids')]")));
	    //action.moveToElement(driver.findElement(By.xpath("//span[contains(text() , 'Baby & Kids')]"))).build().perform();
	    driver.findElement(By.linkText("Toys")).click();
	    WebElement homeAndFurniture = driver.findElement(By.xpath("//span[contains(text() , 'Home & Furniture')]"));
	    Assert.assertEquals(homeAndFurniture.isDisplayed(), true);
	    if(homeAndFurniture.isDisplayed()) {
	    	homeAndFurniture.click();
	    }
	    else {
	    	System.out.println("Home & Furniture is not displayed");
	    }
	    Verify.verify(true, "Home & Furniture" , homeAndFurniture.isDisplayed());
	    System.out.println("Home & Furniture is displayed");
	    
	    
	    
		 
		/*
		 * try { Thread.sleep(5); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * action.moveToElement(driver.findElement(By.xpath("//div[@class='dHGf8H']"))).
		 * build().perform(); driver.findElement(By.linkText("Orders")).click();
		 * //driver.findElement(By.xpath(
		 * "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[5]/div/div/a")).click();
		 * //driver.findElement(By.xpath("//a[@class='_3ko_Ud']")).click();
		 * //driver.findElement(By.xpath(
		 * "//a[@href='/viewcart?otracker=Cart_Icon_Click']")).click(); //String
		 * myCartText =
		 * driver.findElement(By.xpath("//div[text()='My Cart']")).getText();
		 * //System.out.println(myCartText); driver.navigate().back();
		 * driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		 */
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//String sAddToCart="(//span[text()='Cart')])";
		//driver.findElement(By.xpath("//div[@id='container']/div/div/div/div[2]/div[5]/div/div/a/span")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click();
		
	}
}

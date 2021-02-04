package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysSample {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
		search.sendKeys("dreamcatchers");
		Thread.sleep(5000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		
		//String s = driver.findElement(By.xpath("(//div[@id= 'search']/div/div/div/div/div/div/a/h3/div/span)[5]")).getText();
		//System.out.println(s);
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("(//*[@id= \"search\"]/div/div/div/div/div/div/a/h3/div/span)[5]")).getText().contains("dreamcatchers")) {
			System.out.println("Pass");
		} else { 
			System.out.println("Fail");
		}
		
		
		
	}
		
}

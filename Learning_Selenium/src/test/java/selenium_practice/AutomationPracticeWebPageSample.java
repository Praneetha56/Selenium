package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeWebPageSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kiwi2@test.com");
		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Sakruthi");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
		
		Select d = new Select(driver.findElement(By.id("days")));
		d.selectByVisibleText("19  ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select m = new Select(driver.findElement(By.id("months")));
		m.selectByValue("2");
		
		Select y = new Select(driver.findElement(By.id("years")));
		y.selectByIndex(5);
		
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sakruthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Company");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Address1");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Address2");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("City");
		
		Select s = new Select(driver.findElement(By.id("id_state")));
		s.selectByVisibleText("Georgia");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("13400");
		
		Select c = new Select(driver.findElement(By.id("id_country")));
		c.selectByValue("21");
		
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("Additional Info");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("23567890");
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("2356789023");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Alias Address");
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		
		
		
		
		
	}

}

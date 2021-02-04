package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExploreFreshersWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-notifications", "--disable-gpu", "--ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.freshersworld.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * driver.findElement(By.linkText("Institutes")).click();
		 * 
		 * Thread.sleep(5000);
		 * //driver.get("https://corp.freshersworld.com/institutes?src=homeheader");
		 * 
		 * driver.switchTo().window(
		 * "https://corp.freshersworld.com/institutes?src=homeheader");
		 * Thread.sleep(10000);
		 * driver.findElement(By.xpath("//span[@class='close']")).click();
		 */
		//String getFraudAlert = driver.findElement(By.xpath("//a[@href='https://www.freshersworld.com/fraudawareness?src=']")).getText();
		//System.out.println(getFraudAlert);
		
		
		  //driver.close();
		 
		//driver.findElement(By.xpath("//span[@class='close']")).click();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().defaultContent().close();
		//driver.findElement(By.xpath("//span[@class='close']")).click();
		//driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Praneetha Reddy");
		//driver.findElement(By.xpath("//input[@id='company_name')")).sendKeys("Digital_Cutlet");
		//driver.navigate().refresh();
		//driver.findElement(By.xpath("//a[@class='home']")).click();
		
		driver.switchTo().activeElement().click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='register-button']")).click();
		driver.findElement(By.xpath("(//input[@class='register-page-inputs'])[1]")).sendKeys("Praneetha");
		driver.findElement(By.xpath("(//input[@class='register-page-inputs'])[2]")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praneethareddy56@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Abc123");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7093351320");
		//driver.findElement(By.xpath("//button[@id='sendOTP']")).click();
		Select city = new Select(driver.findElement(By.id("currentCity")));
		city.selectByValue("37");
		city.selectByVisibleText(" Hyderabad ");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("current_sublocation_id")));
		Select subLocation = new Select(driver.findElement(By.id("current_sublocation_id")));
		subLocation.selectByVisibleText("Dilsukhnagar ");
		
		
		Select course = new Select(driver.findElement(By.id("course")));
	    course.selectByVisibleText("BE/B.Tech");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("branch")));
		Select branch = new Select(driver.findElement(By.id("branch")));
		branch.selectByVisibleText("Information Science/Technology (IS/IT)");
		Select passedOutYear = new Select(driver.findElement(By.id("passYear")));
		passedOutYear.selectByVisibleText("2012");
		
		driver.findElement(By.id("percentage")).click();
		driver.findElement(By.xpath("//input[@id='marks']")).sendKeys("69");
		
		Select instituteLocation = new Select(driver.findElement(By.id("hqState")));
		instituteLocation.selectByVisibleText(" Andhra Pradesh ");
		Select instituteName = new Select(driver.findElement(By.id("hqInstitute")));
		instituteName.selectByVisibleText("Priyadarshini College Of Engineering And Technology (PCET),Nellore");
		Select university = new Select(driver.findElement(By.id("hqUniversity")));
		university.selectByVisibleText("Jawaharla Nehru Technological University");
		
		driver.findElement(By.xpath("//input[@id='hasTwelfthMarks']")).click();
		driver.findElement(By.xpath("//input[@id='twelfth']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='tenth']")).sendKeys("86");
		driver.findElement(By.xpath("//input[@id='token-input-skills']")).sendKeys("Selenium with java, Selenium with TestNG,");
		//driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		Assert.assertEquals(driver.findElement(By.id("whatsappsubscription")).isSelected(), true);
		Assert.assertEquals(driver.findElement(By.id("termsNcondition")).isSelected(), true);
		
		
		//Actions actionObj = new Actions(driver);
		//actionObj.moveToElement(target).build.perform();
		
	}

}

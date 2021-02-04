package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excelreader.ExcelReader;
import listener.EventListener;
import pages.AfterSignInPage;
import pages.CartPage;
import pages.CreateAccountPage;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.SignInPage;

public class TestBase {
	
	public static ExcelReader excelreader;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public WebDriver driver;
	EventListener ecapture;
	EventFiringWebDriver eventHandler;
	public Properties prop;
	public FileInputStream fis;
	

	
	protected HomePage homePageObj;
	protected SignInPage signInPageObj;
	protected ForgotPasswordPage forgotPasswordPageObj;
	protected AfterSignInPage afterSignInPageObj;
	protected CartPage cartPageObj;
	protected CreateAccountPage createAccountPageObj;
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeTest
	public void testbefore() throws IOException {
		extent = new ExtentReports(System.getProperty("user.dir") + "\\extentreport.html", false);
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\target\\Config\\extent-config.xml"));
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\config.Properties");
		prop.load(fis);
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		
		
		excelreader = new ExcelReader(System.getProperty("user.dir") + "\\data.xlxs");
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
			driver = new ChromeDriver();
			} else if(browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "..\\Learning_Selenium\\Driver_Executables\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if(browser.equals("ie")) {
				System.setProperty("webdriver.ie.driver", "..\\Learning_Selenium\\Driver_Executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else {
				System.out.println("No browser is Matching");
				System.exit(0);
			}
		
		ecapture = new EventListener();
		eventHandler = new EventFiringWebDriver(driver);
		eventHandler.register(ecapture);
		eventHandler.get(prop.getProperty("url"));
		eventHandler.manage().window().maximize();
		eventHandler.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		homePageObj = new HomePage(eventHandler);
		signInPageObj = new SignInPage(eventHandler);
		forgotPasswordPageObj = new ForgotPasswordPage(eventHandler);
		afterSignInPageObj = new AfterSignInPage(eventHandler);
		cartPageObj = new CartPage(eventHandler);
		createAccountPageObj = new CreateAccountPage(eventHandler);
	}
	

	@AfterMethod
	public void close() {
		driver.quit();
		extent.endTest(logger);
		extent.flush();
	}
	
	@AfterTest
	public void testafter() {
		extent.close();
	}
}

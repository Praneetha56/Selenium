package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> resultOfLists = driver.findElements(By.tagName("a"));
		System.out.println("The total Links available in this page : " +resultOfLists.size());
		
		for(int i=0; i<resultOfLists.size(); i++) {
			System.out.println("Link : " +resultOfLists.get(i).getText());
			if(resultOfLists.get(i).getText().equals("Amazon Pay")) {
				System.out.println("The link Amazon Pay exists");
				break;
			}else {
				System.out.println("The link Amazon Pay does not exists");
			}
		}
		
		List<WebElement> resultOfInputs =driver.findElements(By.tagName("input"));
		System.out.println("Number of inputs available in this page : " +resultOfInputs.size());
		
		for(int j = 0; j<resultOfInputs.size(); j++) {
			System.out.println("Input : " +resultOfInputs.get(j).getText());
			
		}
		
	}

}

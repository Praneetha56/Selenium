package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparsionOfTextsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		String txt = driver.findElement(By.xpath("//*[contains(text(),'Follow us ')]")).getText();
		System.out.println(txt);
		
		if(txt.contains("praneetha")) {
			System.out.println("The text contains Facebook : MATCHING");
		} else {
			System.out.println("The text does not contains Facebook : NOT MATCHING");
		}
		
		String p = driver.findElement(By.xpath("//*[contains(text(),'solely ')]")).getText();
		System.out.println(p);
		
		
	}

}

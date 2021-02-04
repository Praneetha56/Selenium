package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTheAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "..\\Learning_Selenium\\Driver_Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kiwi4@test.com");
		driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		String genderCheck = gender.getAttribute("value");
		System.out.println(genderCheck);
		System.out.println(gender.isSelected());
		
		WebElement gend = driver.findElement(By.id("id_gender1"));
		System.out.println(gend.isSelected());
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		firstname.sendKeys("Sakruthi");
		String firstName = firstname.getAttribute("value");
		System.out.println(firstName);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lastname.sendKeys("Reddy");
		String Lastname = lastname.getAttribute("value");
		System.out.println(Lastname);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		password.sendKeys("123456");
		String Password = password.getAttribute("type");
		System.out.println(Password);
		
		
		Select d = new Select(driver.findElement(By.id("days")));
		d.selectByVisibleText("19  ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.id("days")).getAttribute("value"));
		
		Select m = new Select(driver.findElement(By.id("months")));
		m.selectByValue("2");
		System.out.println(driver.findElement(By.id("months")).getAttribute("value"));
		
		Select y = new Select(driver.findElement(By.id("years")));
		y.selectByIndex(4);
		System.out.println(driver.findElement(By.id("years")).getAttribute("value"));
		
		WebElement newsletter = driver.findElement(By.xpath("//input[@name='newsletter']"));
		newsletter.click();
		System.out.println(newsletter.isSelected());
		
		WebElement offers = driver.findElement(By.xpath("//*[contains(@id,'optin')]"));
		System.out.println(offers.isSelected());
		if(offers.isSelected()==false) {
			offers.click();
		}
		
		WebElement first_name = driver.findElement(By.xpath("//input[@name='firstname']"));
		first_name.sendKeys("Sakruthi");
		String First_name = first_name.getAttribute("value");
		System.out.println(First_name);
		
		WebElement last_name = driver.findElement(By.xpath("//input[@name='lastname']"));
		last_name.sendKeys("Reddy");
		String Last_name = last_name.getAttribute("value");
		System.out.println(Last_name);
		
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("Company");
		String Company = company.getAttribute("value");
		System.out.println(Company);
		
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
		address1.sendKeys("Address1");
		String Address = address1.getAttribute("value");
		System.out.println(Address);
		
		
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("Address2");
		String Address2 = address2.getAttribute("value");
		System.out.println(Address2);
		
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("City");
		String City = city.getAttribute("value");
		System.out.println(City);
		
		Select s = new Select(driver.findElement(By.id("id_state")));
		s.selectByVisibleText("Georgia");
		System.out.println(driver.findElement(By.id("id_state")).getAttribute("value"));

		
		WebElement code = driver.findElement(By.xpath("//input[@name='postcode']"));
		code.sendKeys("13400");
		String Code = code.getAttribute("value");
		System.out.println(Code);
		
		
		Select c = new Select(driver.findElement(By.id("id_country")));
		c.selectByValue("21");
		System.out.println(driver.findElement(By.id("id_country")).getAttribute("value"));
		
		WebElement info = driver.findElement(By.xpath("//textarea[@name='other']"));
		info.sendKeys("Additional Info");
		String Info = info.getAttribute("value");
		System.out.println(Info);
		
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("23567890");
		String Phone = phone.getAttribute("value");
		System.out.println(Phone);
		
		
		WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		mobile.sendKeys("2356789023");
		String Mobile = mobile.getAttribute("value");
		System.out.println(Mobile);
		
		
		WebElement alias = driver.findElement(By.xpath("//input[@name='alias']"));
		alias.sendKeys("Alias Address");
		String Alias = alias.getAttribute("value");
		System.out.println(Alias);
		
	}

}

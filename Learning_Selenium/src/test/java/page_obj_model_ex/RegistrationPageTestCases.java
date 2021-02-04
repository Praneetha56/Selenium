package page_obj_model_ex;

import org.testng.annotations.Test;

public class RegistrationPageTestCases extends TestBase {
 
	@Test
  public void createAccount() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,10);
		signUpPageObj.getEnter();
		Thread.sleep(5000);
		registrationPageObj.setFirstName("Praneetha");
		registrationPageObj.setLastName("Reddy");
		registrationPageObj.setAddress("Address");
		registrationPageObj.setEmail("kiwi@test.com");
		registrationPageObj.setPhoneNum("1234566878");
		registrationPageObj.setGender("female");
		registrationPageObj.setHobbyMovies();
		registrationPageObj.setLang();
		registrationPageObj.setLanguage("Arabic");
		Thread.sleep(5000);
		registrationPageObj.select("APIs");
		registrationPageObj.select1("India");
		Thread.sleep(3000);
		registrationPageObj.setYear("2012");
		Thread.sleep(3000);
		registrationPageObj.setMonths("August");
		registrationPageObj.setDays("7");
		registrationPageObj.setPassword("Tetra123");
		registrationPageObj.setPasswordConfirm("Tetra123");
		registrationPageObj.getSubmit().click();
  }
}

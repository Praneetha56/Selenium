package alltestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class CreateAccount001TestCases extends TestBase {
	
	
	@Test
	void validateCreateAccountPageText() {
		
		homePageObj.getSignIn().click();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		signInPageObj.setCreateEmail(excelreader.getCellData("CreateAccount", "email", 2));
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signInPageObj.getSubmitCreate().click();
		createAccountPageObj.setFirstName(excelreader.getCellData("CreateAccount", "firstname", 2));
		createAccountPageObj.setLastName(excelreader.getCellData("CreateAccount", "lastname", 2));
		createAccountPageObj.setCreatePassword(excelreader.getCellData("CreateAccount", "password", 2));
		createAccountPageObj.setGender(excelreader.getCellData("CreateAccount", "gender", 2));
		createAccountPageObj.setDays(excelreader.getCellData("CreateAccount", "day", 2));
		createAccountPageObj.setMonths(excelreader.getCellData("CreateAccount", "month", 2));
		createAccountPageObj.setYears(excelreader.getCellData("CreateAccount", "year", 2));
		createAccountPageObj.setFirstNameInAddress(excelreader.getCellData("CreateAccount", "firstname_addr", 2));
		createAccountPageObj.setLastNameInAddress(excelreader.getCellData("CreateAccount", "lastname_addr", 2));
		createAccountPageObj.setCompanyName(excelreader.getCellData("CreateAccount", "company", 2));
		createAccountPageObj.setAddress1(excelreader.getCellData("CreateAccount", "address1", 2));
		createAccountPageObj.setAddress2(excelreader.getCellData("CreateAccount", "address2", 2));
		createAccountPageObj.setCity(excelreader.getCellData("CreateAccount", "city", 2));
		createAccountPageObj.setState(excelreader.getCellData("CreateAccount", "state", 2));
		createAccountPageObj.setPostcode(excelreader.getCellData("CreateAccount", "postcode", 2));
		createAccountPageObj.setCountry(excelreader.getCellData("CreateAccount", "country", 2));
		createAccountPageObj.setPhoneNum(excelreader.getCellData("CreateAccount", "phone", 2));
		createAccountPageObj.setMobileNum(excelreader.getCellData("CreateAccount", "phone_mobile", 2));
		createAccountPageObj.setAlternateAddress(excelreader.getCellData("CreateAccount", "alias", 2));
		
		Assert.assertEquals(createAccountPageObj.getCreateAccountPageText().getText(), "CREATE AN ACCOUNT");
		
		
		
	}

}

package log4j_practice;

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
		signInPageObj.setCreateEmail(prop.getProperty("username"));
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signInPageObj.getSubmitCreate().click();
		//createAccountPageObj.setGender(excelreader.getCellData("CreateAccount", "Title", 2));
		createAccountPageObj.setFirstName(excelreader.getCellData("CreateAccount", "First name", 2));
		createAccountPageObj.setLastName(excelreader.getCellData("CreateAccount", "Lastname", 2));
		createAccountPageObj.setCreatePassword(excelreader.getCellData("CreateAccount", "Password", 2));
		
		createAccountPageObj.setDays(excelreader.getCellData("CreateAccount", "Day", 2));
		createAccountPageObj.setMonths(excelreader.getCellData("CreateAccount", "Month", 2));
		createAccountPageObj.setYears(excelreader.getCellData("CreateAccount", "Year", 2));
		createAccountPageObj.setFirstNameInAddress(excelreader.getCellData("CreateAccount", "Firstname Address", 2));
		createAccountPageObj.setLastNameInAddress(excelreader.getCellData("CreateAccount", "Lastname Address", 2));
		createAccountPageObj.setCompanyName(excelreader.getCellData("CreateAccount", "Company", 2));
		createAccountPageObj.setAddress1(excelreader.getCellData("CreateAccount", "Address", 2));
		createAccountPageObj.setAddress2(excelreader.getCellData("CreateAccount", "Address (Line 2)", 2));
		createAccountPageObj.setCity(excelreader.getCellData("CreateAccount", "City", 2));
		createAccountPageObj.setState(excelreader.getCellData("CreateAccount", "State", 2));
		createAccountPageObj.setPostcode(excelreader.getCellData("CreateAccount", "Zip/Postal Code", 2));
		createAccountPageObj.setCountry(excelreader.getCellData("CreateAccount", "Country", 2));
		createAccountPageObj.setAdditionalInfo(excelreader.getCellData("CreateAccount", "Additional information", 2));
		createAccountPageObj.setPhoneNum(excelreader.getCellData("CreateAccount", "Home phone", 2));
		createAccountPageObj.setMobileNum(excelreader.getCellData("CreateAccount", "Mobile phone", 2));
		createAccountPageObj.setAlternateAddress(excelreader.getCellData("CreateAccount", "Address Alias", 2));
		
		Assert.assertEquals(createAccountPageObj.getCreateAccountPageText().getText(), "CREATE AN ACCOUNT");
		
		
		
	}

}

package alltestcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class SignInTestCases extends TestBase {

	@Test
	 
	 void CreateEmailAccount() {
		
		homePageObj.getSignIn().click(); 
		signInPageObj.setCreateEmail("praneetha399@test.com");
		signInPageObj.getSubmitCreate().click();
	 }	
	
}

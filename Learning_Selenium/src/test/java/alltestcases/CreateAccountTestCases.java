package alltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class CreateAccountTestCases extends TestBase {
	
	
	@Test
	void validateCreateAccountPageText() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Testcase has started");
		
		logger.log(LogStatus.INFO, "Click on SignIn button");
		homePageObj.getSignIn().click();
		logger.log(LogStatus.INFO, "Set emailId");
		signInPageObj.setCreateEmail("praneetha810@test.com");
		logger.log(LogStatus.INFO, "Click on Submit button");
		signInPageObj.getSubmitCreate().click();
		Assert.assertEquals(createAccountPageObj.getCreateAccountPageText().getText(), "CREATE AN ACCOUNT");
		logger.log(LogStatus.PASS, "Navigated to correct page");
	}

}

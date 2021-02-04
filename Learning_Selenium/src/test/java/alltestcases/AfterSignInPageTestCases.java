package alltestcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import log4j_practice.LogTest;

public class AfterSignInPageTestCases extends TestBase {
	
	
	
	@Test
	void MyOrderHistory() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "Test has started");
		logger.log(LogStatus.INFO, "Click on SignIn button");
		homePageObj.getSignIn().click();
		logger.log(LogStatus.INFO, "LoginId given");
		signInPageObj.setLoginId("praneetha63@test.com");
		logger.log(LogStatus.INFO, "LoginPassword given");
		signInPageObj.setLoginPassword("abcdef");
		logger.log(LogStatus.INFO, "Click on Submit button");
		signInPageObj.getSubmitLogin().click();
		logger.log(LogStatus.INFO, "Click on Order History");
		afterSignInPageObj.getOrderHistory().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

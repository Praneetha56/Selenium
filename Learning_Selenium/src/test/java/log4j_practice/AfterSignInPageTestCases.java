package log4j_practice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class AfterSignInPageTestCases extends TestBase {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	@Parameters({"username" , "password"})
	@Test
	void MyOrderHistory(String user, String pwd) throws IOException {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		log.info("Testcase Started" +TestcaseId);
		logger = extent.startTest(TestcaseId, "Test has started");
		logger.log(LogStatus.INFO, "Click on SignIn button");
		homePageObj.getSignIn().click();
		logger.log(LogStatus.INFO, "LoginId given");
		signInPageObj.setLoginId(prop.getProperty("username"));
		logger.log(LogStatus.INFO, "LoginPassword given");
		signInPageObj.setLoginPassword(prop.getProperty("password"));
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

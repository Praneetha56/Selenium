package alltestcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class HomePageTestCases extends TestBase {
	
	@Test
	void ClickOnContactUs() {
		String TestcaseID = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseID, "Testcase has started");
		
		logger.log(LogStatus.INFO, "Click on Contact us");
		homePageObj.getContactUs().click();
	}
}

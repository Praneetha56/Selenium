package alltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;

public class CartPageTestCases extends TestBase {
	
	@Test
	void CartPageValidate() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "TestCase has started");
		
		logger.log(LogStatus.INFO, "Click on Cart");
		homePageObj.getCart().click();
		
		Assert.assertEquals(cartPageObj.getCartPageText().getText(), "Your shopping cart");
		logger.log(LogStatus.PASS, "Matching");
		
		//logger.log(LogStatus.FAIL, "Failed");
		//Assert.assertEquals(cartPageObj.getCartPageText().getText(), "And");
	}

}

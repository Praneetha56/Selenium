package log4j_practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;



import base.TestBase;

public class CartPageTestCases extends TestBase {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
	@Test
	void CartPageValidate() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		log.info(TestcaseId + "Started");
		log.info("=================");
		
		log.info("Click on the Cart");
		homePageObj.getCart().click();
		
		log.info("Verify text from Cart page");
		Assert.assertEquals(cartPageObj.getCartPageText().getText(), "Your shopping cart");
		log.info("This condition is Passed");
		log.info("=================");
		
		//log.error("This condition is Failed");
		//Assert.assertEquals(cartPageObj.getCartPageText().getText(), "And");
	}

}

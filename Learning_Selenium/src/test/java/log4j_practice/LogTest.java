package log4j_practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {
	
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
	@Test
	public void print() {
		log.info("This is Info");
		log.debug("This is Debug");
		log.error("This is Error");
		log.fatal("This is Fatal");
		System.out.println("Done here");
	}

}

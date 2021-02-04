package testng_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationsWithTest {
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am from before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am from after test");
  }

}

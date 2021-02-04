package testng_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsWithSuite {
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am from before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am from after suite");
  }

}

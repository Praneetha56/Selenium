package testng_practice;

import org.testng.annotations.Test;

public class OrderOfExecution {
  @Test(priority=4)
  public void tc_1() {
	  System.out.println("This is from testcase 1");
  }
  
  @Test(priority=4)
  public void tc_4() {
	  System.out.println("This is from testcase 4");
  }
  
  @Test(priority=4)
  public void tc_2() {
	  System.out.println("This is from testcase 2");
  }
  
  @Test(priority=4)
  public void tc_3() {
	  System.out.println("This is from testcase 3");
  }
  
  @Test(priority=4)
  public void tc() {
	  System.out.println("This is from testcase");
  }
  
  
  @Test(priority=1)
  public void selectProduct() {
	  System.out.println("Product is selected");
  }
  
  @Test(priority=2)
  public void PlaceAnOrder() {
	  System.out.println("Place the order");
  }
  
  @Test(priority=3)
  public void addToCart() {
	  System.out.println("Product is added to cart");
  }
}

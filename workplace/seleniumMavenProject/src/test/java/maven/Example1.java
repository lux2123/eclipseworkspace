package maven;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void Testcase() {
	  System.out.println("Hello");
	  calling();
  }
  void calling() {
	  System.out.println("i am calling");
  }
  
}

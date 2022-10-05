package maven;

import org.testng.annotations.Test;

public class Example2 {
  @Test(enabled=true,invocationCount=5)
  public void openBrowserAndAppURL() {
	  System.out.println("open browser and app url");
  }
}

package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartBasicValidation {

	public static void main(String[] args) {
		//String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//set the driver executable path using System.setProperty(String key,String value)
		//System.setProperty("webdriver.chromedriver",driverPath3);
		//create an instance of required browser class
		
String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		
		WebDriver driver=new ChromeDriver();
		//to enter the url on the open browser
		
		driver.get("https://www.flipkart.com");
		
		//validate page title
		String pageTitle=driver.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
		System.out.println("title validation:"+pageTitle.equals(expectedTitle));
		
		//validate current Url
		
		String pageURL=driver.getCurrentUrl();
		String expectedURL="https://www.flipkart.com/";
		System.out.println("page URL validation:"+pageURL.equals(expectedURL));
		
		
		//get page source content count
		
		int contentlength=driver.getPageSource().length();
		System.out.println("content length:"+contentlength);
		
		//close the current browser current instance
		driver.close();

	}

}

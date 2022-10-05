package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

	public static void main(String[] args) {
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath3);
	System.out.println("driverPath3");
		//create an instance of required browser class
		
     //  String currentWorkingDir=System.getProperty("user.dir");
		
		//String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		//System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		
		WebDriver driver=new ChromeDriver();
		//to enter the url on the open browser
		
		driver.get("https://www.google.com");
		
		//Expected page Url
		String expectedUrl="https://www.google.com";
		//get the entered URL from the opened browser
		String appCurrentUrl=driver.getCurrentUrl();
		System.out.println("Actual URL:"+appCurrentUrl);
		System.out.println("Expected URL:"+expectedUrl);
		if(appCurrentUrl.equals(expectedUrl)) {
			System.out.println("Current URL validation is pass");
		}
		else {
			System.out.println("Current URL validation is fail");
		}
		

						
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		//WebDriver driver=new ChromeDriver();
		//to enter the url on the open browser
		
		driver.get("https://www.google.com");
		
		
		//verify that Google search page is opened or not using title
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("ActulTitle:"+actualTitle);
		System.out.println("ExpectedTitle:"+expectedTitle);
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Title validation is passes");
		}
		else 
		{
			System.out.println("Title validation is failed");
			
			//get the webpage source content
			
			String sourceContent=driver.getPageSource();
			System.out.println("Source content length:"+sourceContent.length());
			//close current browser
			driver.close();
			
		
	}

	}
}

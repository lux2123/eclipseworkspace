package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {

	public static void main(String[] args) {
      String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String pageTitle=driver.getTitle();
		System.out.println("page title:"+pageTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("page title validation:"+pageTitle.equals(expectedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("page url:"+pageUrl);
		String expectedUrl="https://www.amazon.in/";
		System.out.println("page url vallidation:"+pageUrl.equals(expectedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("page source length:"+pageSource.length());
		
		driver.close();
		
		

	}

}

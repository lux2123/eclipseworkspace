package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) {
        String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter the url on the open browser
		driver.get("https://demo.actitime.com/login.do");
		
		String pageTitle=driver.getTitle();
		String pageUrl=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		
		System.out.println("page title:"+pageTitle);
		System.out.println("page title length:"+pageTitle.length());
		
		System.out.println("page url:"+pageUrl);
		String expectedURl="https://demo.actitime.com";
		System.out.println("Url validation:"+pageUrl.contains(expectedURl));
		
		System.out.println("page source length:"+pageSource.length());
		
		driver.close();
	
		
		

	}

}

package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentis {

	public static void main(String[] args) {
       String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tricentis.com/");
		
		String pageTitle=driver.getTitle();
		System.out.println("page title:"+pageTitle);
		System.out.println("page title length:"+pageTitle.length());
		String expectedTitle="Automated Software Testing Tools | Tricentis";
		System.out.println("page title vaidation:"+pageTitle.equals(expectedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("page url:"+pageUrl);
		String expectedUrl="https://www.tricentis.com/";
		System.out.println("page url validation:"+pageUrl.equals(expectedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("page source length:"+pageSource.length());
		
		driver.close();

	}

}

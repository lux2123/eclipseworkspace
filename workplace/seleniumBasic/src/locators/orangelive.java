package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangelive {

	public static void main(String[] args) {
     String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login page validation
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		System.out.println("Page title status: "+pageTitle.equals("OrangeHRM"));
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page URL is: "+pageURL);
		System.out.println("Page URL status: "+pageURL.equals("https://opensource-demo.orangehrmlive.com/"));
		String pageContent=driver.getPageSource();
		//System.out.println("Page Source is: "+pageContent);
		System.out.println("Page Source length: "+pageContent.length());
		
		//identify and type user name as Admin
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String homePageUrl=driver.getCurrentUrl();
		System.out.println("Home validation status: "+homePageUrl.contains("dashboard"));
		
		//identify user profile and click on it
		driver.findElement(By.id("welcome")).click();
		//identify Logout link and click on it
		driver.findElement(By.linkText("Logout")).click();
		driver.close();		
	}

		
		

	}



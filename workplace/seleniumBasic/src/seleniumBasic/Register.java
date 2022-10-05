package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String pageTitle=driver.getTitle();
		System.out.println("page title:"+pageTitle);
		System.out.println("page title length:"+pageTitle.length());
		String expectedTitle="Register";
		System.out.println("page title validation:"+pageTitle.equals(expectedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("page Url:"+pageUrl);
		String expectedUrl="https://demo.automationtesting.in/Register.html";
		System.out.println("page url validation:"+pageUrl.equals(expectedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("page source length:"+pageSource.length());
		
		driver.close();
		

	}

}

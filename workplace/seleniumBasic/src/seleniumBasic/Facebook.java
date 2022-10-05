package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
        String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String pageTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("page title validation:"+pageTitle.equals(expectedTitle));
		System.out.println("page title:"+pageTitle);
		
		driver.close();

	}

}

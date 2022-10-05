package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileDataInScript {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\PropertyFile\\Data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("appUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("loginPageTitle");
		String loginButtonName=prop.getProperty("buttonName");
		
	    String chromeExePath=System.getProperty("user.dir")+executablePath;
		//setting the path for driver executable
		System.setProperty(driverKey,chromeExePath);
		//creating an instance of chrome browser and up-casting it to webdriver interface
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		//to gt title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
		
		System.out.println("page title is:"+pageTitle);
		System.out.println("page title length:"+pageTitle.length());
		
		//validation login page
		System.out.println("Title validation status:"+pageTitle.equals(expectedLoginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("page url is:"+pageUrl);
		//validating login page
		System.out.println("Url validation status:"+pageUrl.contains(applicationUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("page source:"+pageSource);
		System.out.println("page source length:"+pageSource.length());
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(username);
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));	     
		passwordInputField.sendKeys(password);
	
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();

		//driver.close();
		
	}

}

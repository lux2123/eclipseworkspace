package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis1=new FileInputStream(".\\PropertyFile\\actitime.properties");
		Properties prop=new Properties();
		prop.load(fis1);
		
		String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("Url");
		String UserName=prop.getProperty("username");
		String PassWord=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("loginPageTitle");
		String loginButtonName=prop.getProperty("buttonName");
		
		System.setProperty(driverKey,executablePath);
		//System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrl);
		
		String PageTitle=driver.getTitle();
		System.out.println("pageTitle:"+PageTitle);
		System.out.println("pageTitle length:"+PageTitle.length());
		System.out.println("pagetitle validation:"+PageTitle.contains(expectedLoginPageTitle));
		
		//validation login page
		String PageUrl=driver.getCurrentUrl();
		System.out.println("pageUrl is:"+PageUrl);
		System.out.println("page url validation:"+PageUrl.contains(applicationUrl));
		
		String PageSource=driver.getPageSource();
		System.out.println("page source:"+PageSource);
		System.out.println("page source length is:"+PageSource.length());
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys(UserName);
		
		WebElement passName=driver.findElement(By.name("pwd"));
		passName.sendKeys(PassWord);
		
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		//driver.close();
		
		
		
		
		
		
		

	}

}

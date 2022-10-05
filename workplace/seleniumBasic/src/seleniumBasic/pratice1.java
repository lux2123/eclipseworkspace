package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice1 {

	public static void main(String[] args) {
	String CurrentWorkingDir=System.getProperty("user.dir");
	
	String chromeExePath=CurrentWorkingDir+"\\Executables\\\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", chromeExePath);
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	String PageTitle=driver.getTitle();
	System.out.println("page title is:"+PageTitle);
	System.out.println("page title length is:"+PageTitle.length());
	String expectedTitle="actiTIME - Login";
	//validation login page
	System.out.println("Title validation status:"+PageTitle.equals(expectedTitle));
	
	String PageUrl=driver.getCurrentUrl();
	System.out.println("page Url is:"+PageUrl);
	String expectedUrl="https://demo.actitime.com/login.do";
	System.out.println("Page url validation is:"+PageUrl.equals(expectedUrl));
	
	String PageSource=driver.getPageSource();
	System.out.println("page source is:"+PageSource);
	System.out.println("page source length is:"+PageSource.length());
	
	
	WebElement userNameInputField=driver.findElement(By.id("username"));
	userNameInputField.sendKeys("admin");
	
	WebElement passWordInputField=driver.findElement(By.name("pwd"));
	passWordInputField.sendKeys("manager");
	
	WebElement loginButton=driver.findElement(By.id("loginButton"));
	loginButton.click();
	
	driver.close();
	
	
	
	
	
			
			
	
	
	

	}

	
}

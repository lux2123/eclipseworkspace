package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange {

	public static void main(String[] args) {
     String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//username
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		//or
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//password
		WebElement pwd=driver.findElement(By.id("txtpassword"));
		pwd.clear();
		pwd.sendKeys("admin123");
		
		WebElement signIn=driver.findElement(By.id("btnLogin"));
		signIn.click();
		
		//validate home page
		String homepageUrl=driver.getCurrentUrl();
		System.out.println("home page url validation:"+homepageUrl.contains("dashboard"));
		
		driver.close();
		
		

	}

}

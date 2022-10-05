package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerlogin {

	public static void main(String[] args) {
         String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		/**
		 * to perform any operator first we need to identify the object/element from the
		 * application then you can perform any required operation:
		 *   input type: sendkeys("Input");
		 *   click     : click();
		 *   existing text deletion: clear();
		 *   
		 *   
		 /*Identify user name field*/
		
		WebElement username=driver.findElement(By.id("username"));
		/*perform require operation in the username field*/
		username.clear();
		username.sendKeys("admin");
		
		/*identify password field*/
		WebElement pwd=driver.findElement(By.name("password"));
		/*perform require operation in the pwd field*/
		pwd.clear();
		pwd.sendKeys("test@123");
		
		/*identify sign in button*/
		WebElement signInButton=driver.findElement(By.className(" button"));
		signInButton.click();
		
		
		
		driver.close();

	}

}

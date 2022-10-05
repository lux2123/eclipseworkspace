package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) {
        String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		
		WebElement login=driver.findElement(By.id("loginButtom"));
		login.click();
				
		driver.close();
		
		
		

	}

}

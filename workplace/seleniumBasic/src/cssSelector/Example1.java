package cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
        String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter application url
		driver.get("https://demosite.executeautomation.com/Login.html");
		//enter username as execution
		driver.findElement(By.name("UserName")).sendKeys("exeution");
		//enter password as admin
		driver.findElement(By.name("Password")).sendKeys("admin");
		//click login button
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		System.out.println("hi");
		
		
		

	}

}

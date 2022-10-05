package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("container_tasks")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".addNewButton")).click();
		driver.findElement(By.cssSelector("div.dropdownContainer.addNewMenu>div:nth-of-type(3)")).click();
	     //task
		
		driver.findElement(By.cssSelector(".projectSelector"));
		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)"));
		
		WebElement name=driver.findElement(By.cssSelector("tr:nth-of-type(1)>.nameCell.first>input[placeholder='Enter task name']:nth-of-type(1)"));
		name.click();
		name.sendKeys("Testing1");
		
		//creat task
	  driver.findElement(By.cssSelector("#createTasksPopup tbody>tr:nth-of-type(1)>td:nth-of-type(4)")).click();
	     //cancel
	  Thread.sleep(2000);
	  
	  driver.findElement(By.cssSelector("div[class='checkbox active']")).click();
	  driver.findElement(By.cssSelector("div[class='delete button']")).click();
	  
	 
		
		
		
		
		

	}

}

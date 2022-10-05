package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getloacationactitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("loginButton"));
		
		WebElement errorMsg=driver.findElement(By.cssSelector("#ClientSideErrorMessage"));
		
		System.out.println("Error msg:"+errorMsg.getText());
		System.out.println("Error msg text color:"+errorMsg.getCssValue("color"));
		//error msg
		Point locationOfErrorMsg=errorMsg.getLocation();
		int errorX=locationOfErrorMsg.getX();
		int errorY=locationOfErrorMsg.getY();
		System.out.println("Error X cord:"+errorX);
		System.out.println("Error Y cord:"+errorY);
		
		
		//username cord
			WebElement usernameInputField=driver.findElement(By.id("username"));
			
			Point errormsgUsername=usernameInputField.getLocation();
			int userX=errormsgUsername.getX();
			int userY=errormsgUsername.getY();
			System.out.println("username X cord:"+userX);
			System.out.println("username Y cord:"+userY);
			
				
		int pwdY=driver.findElement(By.name("pwd")).getLocation().getY();
		System.out.println("pwd y:"+pwdY);
		
		System.out.println("is Error msg getting display above the username field?"+(errorY<userY));
		
		

	}

}

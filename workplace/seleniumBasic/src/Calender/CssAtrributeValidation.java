package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAtrributeValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement signButton=driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		
		String fontSize=signButton.getCssValue("font-size");
		String fontColor=signButton.getCssValue("color");
		String fontBackground=signButton.getCssValue("background");
		
		System.out.println("font size:"+fontSize);
		System.out.println("font color:"+fontColor);
		System.out.println("font background:"+fontBackground);
		
		String forgetPassword=driver.findElement(By.cssSelector("a[class='forgotPasswordLink']")).getCssValue("color");
		
		System.out.println("forgetPassword color:"+forgetPassword);//RGBA format color code
		
		//driver.findElement(By.cssSelector("a[class='forgotPasswordLink']"));
		//String fontBack=signButton.getCssValue("color");
	//	System.out.println("back:"+fontBack);
		

	}

}

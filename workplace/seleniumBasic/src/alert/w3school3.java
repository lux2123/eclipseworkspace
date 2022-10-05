package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class w3school3 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert msg:"+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("pune");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		

	}

}

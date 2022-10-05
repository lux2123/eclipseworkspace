package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.SeleniumUtility;

public class OrangeHrm {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement getUsername=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]"));
		String userId=getUsername.getText().substring(11);
		
		WebElement getPassword=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]"));
		String passId=getPassword.getText().substring(11);
		
		driver.switchTo().activeElement().sendKeys(userId,Keys.TAB);
		driver.switchTo().activeElement().sendKeys(passId,Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-userdropdown")));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		

	}
}

package cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWidgets {

	public static void main(String[] args) {
    String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//click on sign button
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
		
		//click on widgets button
		driver.findElement(By.className(".addButton.dropdown-toggle")).click();
		//click history
		driver.findElement(By.cssSelector("a[data-name='History']")).click();
		
		//click on widgets button
		driver.findElement(By.cssSelector(".addButton")).click();
		//click on history
		driver.findElement(By.cssSelector("a[data-name='OpenTickets']")).click();
		
		//click on widgets button
		driver.findElement(By.cssSelector(".addButton")).click();
		//click history
		driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
		
		//click on profile
		driver.findElement(By.cssSelector(".userName")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		

	}

}

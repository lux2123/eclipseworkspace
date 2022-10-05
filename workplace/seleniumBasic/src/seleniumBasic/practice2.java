package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) {
		// String currentWorkingDir=System.getProperty("user.dir");
			
		//	String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
					
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String PageTitle=driver.getTitle();
		System.out.println("page title is:"+PageTitle);
		System.out.println("page title length:"+PageTitle.length());
		
		String PageUrl=driver.getCurrentUrl();
		System.out.println("pageUrl is:"+PageUrl);
		String expectedUrl="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("url validation:"+PageUrl.equals(expectedUrl));
		
		WebElement userName=driver.findElement(By.cssSelector("input#username"));
		userName.clear();
		userName.sendKeys("admin");
		
		WebElement passWord=driver.findElement(By.cssSelector("input#password"));
		passWord.clear();
		passWord.sendKeys("Test@123");
		
		WebElement Login=driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		Login.click();
		
		//click widges
		driver.findElement(By.cssSelector(".addButton")).click();
		//click upcoming activities 
		driver.findElement(By.cssSelector("a[data-name='CalendarActivities']")).click();
		
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
		//click history
		driver.findElement(By.cssSelector("a[data-name='History']")).click();
	
	
		driver.findElement(By.cssSelector("button[class='btn btn-default addButton dropdown-toggle']")).click();
		//click sale pipeline
		driver.findElement(By.cssSelector("a[data-name='PipelinedAmountPerSalesPerson']")).click();
		
		
		//click profile for logout
		driver.findElement(By.cssSelector(".userName")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		
		//driver.close();
		
		
		
		

	}

}



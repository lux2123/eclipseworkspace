package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarenapractice4 {

	public static void main(String[] args) throws InterruptedException {
     // String currentWorkingDir=System.getProperty("user.dir");
		
		//String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement>list=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		Thread.sleep(2000);
		
		System.out.println(" count:"+list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
		}
		
		
		

	}

}

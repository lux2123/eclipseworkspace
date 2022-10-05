package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class geeksforgeeks extends SeleniumUtility {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://practice.geeksforgeeks.org/courses");
		
		String HomeId=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Complete Test Series for Product-Based Companies']")).click();
		
		Set<String>allwind=driver.getWindowHandles();
		System.out.println(allwind);
		//removing homeId
		
		allwind.remove(HomeId);
		
		Iterator<String>itr=allwind.iterator();
		String childWindow=itr.next();
		
		Thread.sleep(2000);
		
		System.out.println(childWindow);
		
		driver.switchTo().window(HomeId);
		Thread.sleep(2000);
		driver.switchTo().window(childWindow);
		driver.close();
		
		driver.switchTo().window(HomeId);
		driver.findElement(By.xpath("//h4[text()='Complete Interview Preparation - Self Paced']")).click();
		driver.quit();
		
		
		
		
		
		

	}

}

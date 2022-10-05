package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarenaSamsung {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		List<WebElement>list1=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
		
		Thread.sleep(2000);
		System.out.println("count:"+list1.size());
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i).getText());
		}
		

	}

}

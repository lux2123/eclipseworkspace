package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartmenuCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		List<WebElement>count=driver.findElements(By.cssSelector(".eFQ30H div:nth-of-type(2)"));
		System.out.println("menu count:"+count.size());            
		
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText());
		}
		

	}

}

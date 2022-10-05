package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement>count=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement>devicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		System.out.println("count:"+count.size());
	
		
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText()+":"+devicePrice.get(i).getText());
		}
		

	}




	}



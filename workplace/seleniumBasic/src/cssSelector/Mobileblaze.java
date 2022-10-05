package cssSelector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobileblaze {

	public static void main(String[] args) {
          String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement>deviceName=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement>devicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		for(int i=0;i<deviceName.size();i++){
			System.out.println(deviceName.get(i).getText()+":"+devicePrice.get(i).getText());
		}
		

		
		
		


	}
	
	

}

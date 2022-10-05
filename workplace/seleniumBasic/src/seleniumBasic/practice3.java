package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {

	public static void main(String[] args) throws InterruptedException {
		
         //String currentWorkingDir=System.getProperty("user.dir");
		
		//String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium interview questions");
		
		Thread.sleep(2000);
		
		List<WebElement>sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		
		System.out.println("suggestion count:"+sugg.size());
		
		for(int i=0;i<sugg.size();i++) {
			//WebElement element=sugg.get(i);
			//System.out.println(element.getText());
			//or
			System.out.println(sugg.get(i).getText());
		}
		

	}
}



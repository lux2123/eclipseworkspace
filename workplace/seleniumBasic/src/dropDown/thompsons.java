package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class thompsons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		WebElement dropdown=driver.findElement(By.id("bsd1-button"));
		dropdown.click();
		
		List<WebElement>list=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println("option count:"+list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		

	}

}

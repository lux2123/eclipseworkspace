package dragDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		Actions act=new Actions(driver);
		
		List<WebElement>sourceElements=driver.findElements(By.cssSelector("ul[id='gallery']"));
		WebElement target=driver.findElement(By.id("trash"));
		
		//act.dragAndDrop(sourceElements.get(0),target).build().perform();
		//Thread.sleep(1000);
		
		//act.dragAndDrop(sourceElements.get(1) ,target).build().perform();
		//Thread.sleep(1000);
		
		//act.dragAndDrop(sourceElements.get(2), target).build().perform();
		
		performDragAndDrop(act,sourceElements.get(1),target);
		
		

	}
	
	static void performDragAndDrop(Actions act,WebElement src,WebElement target) {
		act.dragAndDrop(src, target).build().perform();
	}
}



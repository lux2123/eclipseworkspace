package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("div[id='root']")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(3)>div")).click();
	
		
		

	}

}

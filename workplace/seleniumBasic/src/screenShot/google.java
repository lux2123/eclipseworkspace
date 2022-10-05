package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot,new File(".\\ScreenShots\\GoogleSearchPage.png"));
		
		

	}

}

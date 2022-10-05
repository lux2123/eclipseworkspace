package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver = s1.setUp("chrome","https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot,new File(".\\Screenshots\\GooglePage.png"));
		
		

	}

}

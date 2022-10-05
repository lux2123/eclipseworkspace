package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class genericWayToOpenBrowser {

	public static void main(String[] args) {
		/**
		 * step1: set the path of required browser executable file using System.out.setProperty(key,value)
		 * 
		 * 1.absolute path---->//E:\\workplace\\seleniumBasic\\Executables\\chromedriver.exe
		 * 2.Relative path---->.\\Executables\\chromedriver.exe
		 * 
		 * step2: create an instance of required browser class 
		 */
		
		String currentWorkingDir=System.getProperty("user.dir");
		
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		//ChromeDriver cdriver=new ChromeDriver();
		//creating an instance of chrome Browser and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter the url on the open browser
		
		driver.get("https://www.google.com");
		//close the current browser
		driver.close();
				  

	}

}

package seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCromeBrowser {

	public static void main(String[] args) {
		/**
		 * step1: set the path of required browser executable file using System.out.setProperty(key,value)
		 * step2: create an instance of required browser class 
		 */
		System.setProperty("webdriver.chrome.driver",
				"E:\\workplace\\seleniumBasic\\Executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		
		//to enter the url on the open browser
		
		cdriver.get("https://www.google.com");
		//close the current browser
		//cdriver.close();
				 

	}

}

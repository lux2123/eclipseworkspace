package seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPath {

	public static void main(String[] args) {
		/**
		 * step1: set the path of required browser executable file using System.out.setProperty(key,value)
		 * 
		 * 1.absolute path---->//E:\\workplace\\seleniumBasic\\Executables\\chromedriver.exe
		 * 2.Relative path---->.\\Executables\\chromedriver.exe
		 * 
		 * step2: create an instance of required browser class 
		 */
		System.setProperty("webdriver.chrome.driver",
				".\\Executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		
		//to enter the url on the open browser
		
		cdriver.get("https://www.google.com");
		//close the current browser
		//cdriver.close();
				 

	}

}

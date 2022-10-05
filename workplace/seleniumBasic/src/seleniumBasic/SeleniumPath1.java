package seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPath1 {

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
		System.out.println("current working dir:"+currentWorkingDir);
		String chromeExePath=currentWorkingDir+"\\Executables\\\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
				
		ChromeDriver cdriver=new ChromeDriver();
		
		//to enter the url on the open browser
		
		cdriver.get("https://www.google.com");
		//close the current browser
		//cdriver.close();
				  
	
	}

}

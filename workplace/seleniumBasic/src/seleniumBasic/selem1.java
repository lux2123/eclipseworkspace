package seleniumBasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class selem1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workplace\\seleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://wwww.google.com");
		cdriver.close();

	}

}

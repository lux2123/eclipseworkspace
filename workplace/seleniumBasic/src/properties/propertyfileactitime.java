package properties;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyfileactitime {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\PropertyFile\\Detail.Properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println("First Name:"+prop.getProperty("firstname"));
		System.out.println("Last Name:"+prop.getProperty("lastname"));
		System.out.println("Email Id:"+prop.getProperty("emailId"));
		System.out.println("Mob No:"+prop.getProperty("mobNo"));
		
	}

}

package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class mobile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\PropertyFile\\Data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("appUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("loginPageTitle");
		String loginButtonName=prop.getProperty("buttonName");
		
		System.out.println(username);
		
		

	}

}

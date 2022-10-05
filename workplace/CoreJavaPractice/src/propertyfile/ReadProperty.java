package propertyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		//String filePath=System.getProperty("user.dir")+"\\AppData\\file.properties";
		//System.out.println("Current Dir:"+filePath);
		FileInputStream fis= new FileInputStream(".\\AppData\\file.properties");
		Properties prop=new Properties();
		prop.load(fis);
		//read the data from property file using getProperty(String key)
		
		System.out.println("First Name:"+prop.getProperty("firstname"));
		System.out.println("Last Name:"+prop.getProperty("lastname"));
		System.out.println("EmailID:"+prop.getProperty("emailID"));
		System.out.println("Mobile Number:"+prop.getProperty("MobileNumber"));
		
		
		//to wrote content into the file use setProperty()
		prop.setProperty("Test1", "selenium");
		prop.setProperty("Test2", "automation");
		//location where you want to save your file using FileOutputStream
		FileOutputStream fos= new FileOutputStream(".\\AppData\\file.properties"); 
		//saving the file into required location using store()
		prop.store(fos,"Added two key");
		//close the connection
		fos.close();
		
		

	}

}

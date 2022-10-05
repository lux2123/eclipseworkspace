package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	//Absolute path--->E:\workplace\CoreJavaPractice\AppData\txtFile.properties
		String filePath=System.getProperty("user.dir")+"\\AppData\\txtFile.properties";
		System.out.println("Current Dir:"+filePath);
		//file location and filename
		//Absolute path
		//FileInputStream fis= new FileInputStream("E:\\workplace\\CoreJavaPractice\\AppData\\txtFile.properties");
				
				 //or
		FileInputStream fis1=new FileInputStream(filePath);
		          //or relative path
		
		FileInputStream fis2=new FileInputStream(".\\AppData\\txtFile.properties");
		
		//create an instance of properties class
		
		Properties prop=new Properties();
		//load property file using load() of properties class
		prop.load(fis2);
		
		//read data from property file using getproperty(string key)
		System.out.println("First Name:"+prop.getProperty("firstname"));
		System.out.println("Last Name:"+prop.getProperty("lastname"));
		System.out.println("EmailID Name:"+prop.getProperty("emailID"));
		System.out.println("Mobile Number"+prop.getProperty("mobileNumber"));
		
		

	}

}

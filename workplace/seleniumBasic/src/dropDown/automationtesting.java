package dropDown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationtesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		
		//create an instance of chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify dropsown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		//****create an instance of Slelect class and pass above element into its constructor
		Select selectSkill=new Select(skillDropdown);
		
		//***check weather dropdown is multiselector dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option:"+selectSkill.isMultiple());
		
		//***get default or already select option
		
		//WebElement selectedOption=selectSkill.getFirstSelectedOption();
		//String selectOptionName=selectedOption.getText();
	    //System.out.println("Already selected option name:"+selectOptionName);
	    //or
	    
	    System.out.println("Alrady selected option name:"+selectSkill.getFirstSelectedOption().getText());
	    
	    //get option count
	    List<WebElement> options=selectSkill.getOptions();
	   System.out.println("option count is:"+options.size());
	    
	    //get dropdown names
	    for(int i=0;i<options.size();i++) {
	    	System.out.println("options"+i+": "+options.get(i).getText());
	    }
	    
	    
	  //select options from dropdown
	    selectSkill.selectByIndex(4);
	    System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
	    
	    selectSkill.selectByValue("Backup Management");
	    System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
	    
	    selectSkill.selectByVisibleText("Analytics");
	    System.out.println("Already selected option name:"+selectSkill.getFirstSelectedOption().getText());
	    
	   
	    
	    
	    
	  
		
		
		
		
		
		
	
		

	}

}

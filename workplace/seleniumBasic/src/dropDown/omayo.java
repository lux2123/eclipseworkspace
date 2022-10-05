package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class omayo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		WebElement selectDropdown=driver.findElement(By.id("multiselect1"));
		
		Select selectSkill=new Select(selectDropdown);
		
		System.out.println("is dropdwon multiselected or not:"+selectSkill.isMultiple());
		
		//System.out.println("seleted option name:"+selectSkill.getFirstSelectedOption().getText());
		
		//list count
		List<WebElement> allOptions=selectSkill.getOptions();
		System.out.println("all options count:"+allOptions.size());
		
		//all multiple options
		for(int i=0;i<allOptions.size();i++) {
				System.out.println("all option "+allOptions.get(i).getText());
		}
		
		//select option from dropdown
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(2);
		selectSkill.deselectByIndex(3);
		
		List<WebElement>Carlist=selectSkill.getAllSelectedOptions();
		System.out.println("car count:"+Carlist.size());
		
		for(int i=0;i<Carlist.size();i++) {
			System.out.println("total selected car list "+i+": "+Carlist.get(i).getText());
			
			
		}
		

	}

}

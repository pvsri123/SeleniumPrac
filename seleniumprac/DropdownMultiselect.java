package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiselect {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		
		int dropdownsize = dropdown.getOptions().size();
		System.out.println("Numer of courntires in the dropdown:"+dropdownsize);
		
		for(int i=0;i<dropdownsize;i++)
		{
			String StringVal = dropdown.getOptions().get(i).getText();
			System.out.println(StringVal);
		}
		
		driver.close();
		
	}

}

package seleniumprac;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksExample01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseUrl="https://www.officedepot.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
				
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));	
		System.out.println("Number of links present in the website are:"+linkElements.size());
		
		String[] linkTexts = new String[linkElements.size()];
		
		int i =0;
		
		for(WebElement element:linkElements)
		{
			linkTexts[i] = element.getText();							
			
			System.out.println(linkTexts[i]);
			i++;
			System.out.println("***************");
		
		}
				
	}
	
}



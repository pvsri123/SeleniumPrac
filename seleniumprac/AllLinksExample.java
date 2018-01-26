package seleniumprac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksExample {

	public static void main(String[] args) {
		//The WebDriver code below checks each link from the Mercury Tours home page to determine those that are working and those 
				// that are still under construction
				//One of the common procedures in web-Testing is to test if all the links 
				//present within the page are working. This can be conveniently done using a combination of 
				// the Java for-each loop, findElements() & By.tagName("a") method.
				
				
				WebDriver driver = new FirefoxDriver();
				String baseUrl = "https://www.amazon.com/";	
				driver.get(baseUrl);
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
				
				driver.get(baseUrl);					
		        List<WebElement> linkElements = driver.findElements(By.tagName("a"));	
		      
		        System.out.println("Number of links present in the website are:"+linkElements.size());
		        
		        String linkTexts[] = new String[linkElements.size()];
		        
		        int i =0;
		        
		        for (WebElement element : linkElements) 
				{							
				linkTexts[i] = element.getText();							
					
				System.out.println(linkTexts[i]);
				i++;
				System.out.println("**************************************************");
				}
		        		      		        
	}

}

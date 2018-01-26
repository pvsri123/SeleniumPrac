package seleniumprac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksExample02 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseUrl= "http://apsrtconline.in";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links present in the webpage:"+linkElements.size());
		
		String [] linkText = new String[linkElements.size()];
		int i=0;
		
		for(WebElement element: linkElements)
		{
			linkText[i]= element.getText();
			System.out.println(linkText[i]);
			i++;
			System.out.println("***************");
		}
		
	}

}

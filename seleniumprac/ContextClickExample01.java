package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextClickExample01 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.officedepot.com/");
		driver.manage().window().maximize();
		
	WebElement element=	driver.findElement(By.xpath(".//*[@id='navGroup1']/h1/a"));
	element.click();
		
	WebElement element2 = driver.findElement(By.xpath(".//*[@id='featuredMatrix']/div/div/div[3]/div[1]/a/span"));
	
	WebElement auto_suggested = (new WebDriverWait(driver,30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='featuredMatrix']/div/div/div[3]/div[1]/a/span")));
	
	Actions action= new Actions(driver);
    
    action.contextClick(element2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	
	}

}

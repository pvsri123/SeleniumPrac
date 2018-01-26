package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionClassOffDept02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.officedepot.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='navGroup2']/h2/a"));
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.tagName("a"));
		/* WebElement element2 = driver.findElement(By.xpath(".//*[@id='productView']/div[2]/div/div[2]/div[3]/div/div/a"));
		*/
		Actions actions =  new Actions(driver);
		
		actions.moveToElement(element).build().perform();
		actions.moveToElement(element1).click().build().perform();
		/* actions.moveToElement(element2).click().build().perform();
		
		driver.findElement(By.xpath(".//*[@id='quantityBox0']")).sendKeys("2");
		driver.findElement(By.xpath(".//*[@id='featuredMatrix']/div/div/div[1]/a[2]/span[1]")).click();
		*/
		
	}

}

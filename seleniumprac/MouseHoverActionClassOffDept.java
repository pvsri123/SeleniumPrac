package seleniumprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionClassOffDept {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.officedepot.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.linkText("Office Supplies"));
        Thread.sleep(3000);
        
        Actions action = new Actions(driver);
        
        action.moveToElement(element).build().perform();
        
        driver.findElement(By.xpath(".//*[@id='sg1676']/div/div/div[1]/div[1]/ul/li[2]/a/span")).click();
        driver.findElement(By.className("bx-close-xsvg")).click();
        
        driver.findElement(By.xpath(".//*[@id='m02']/div[1]/div/div/div[1]/ul/li[1]/div[2]/div/a")).click();
        driver.findElement(By.id("mainqtybox")).sendKeys("2");
        driver.findElement(By.id("addToCartButtonId")).click();
        
		
        
	}

}

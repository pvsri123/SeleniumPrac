package seleniumprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionClassOffDept01 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.get("https://www.officedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("nav_a1")).click();
		
		Thread.sleep(1000);
		// Actions
		
				Actions actions = new Actions(driver);
				
				actions.moveToElement(driver.findElement(By.xpath(".//*[@id='sg1676']/div/div/div[1]/div[1]/ul/li[2]/a/span"))).build().perform();
				
				Thread.sleep(3000);
				driver.findElement(By.className("bx-close-xsvg")).click();
										
				driver.findElement(By.xpath(".//*[@id='m02']/div[1]/div/div/div[1]/ul/li[1]/div[2]/div/a")).click();
		
	}

}

package sampleone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBlogin {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters({"myBrowser"})
	
	public void setUp(String mybr){
		
		switch(mybr){
		case "FF":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void applogin(){
		
		driver.findElement(By.name("email")).sendKeys("madhukar");
		driver.findElement(By.name("pass")).sendKeys("mercury");
		driver.findElement(By.id("u_0_2")).click();
		
	}
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}
}

package seleniumprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	public static WebDriver driver;
	
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
	public static void main(String[] args) {
		
		DriverClass.setUp();
		Parent1.usrReg(driver);
		Parent2.mtlogin(driver);
		Parent1.closeApp(driver);
	}

}

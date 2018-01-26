package test.cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import object.repository.MtHomePg;

public class MtLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		//to enter user name
		MtHomePg.userid(driver).sendKeys("mercury");
		//to enter password
		MtHomePg.passwd(driver).sendKeys("mercury");
		//to click on Signin
		MtHomePg.signin(driver).click();
		
		Thread.sleep(5000);
		
		//to validate pagetitle
		String pgTitle=driver.getTitle();
		if (pgTitle.contains("Find a Flight: Mercury")){
			System.out.println("successful login operation");
		}
		else{
			System.out.println("unsuccessful login operation");
		}
	}

}

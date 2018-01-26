package object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtHomePg {

	// non-executable class  (without main function then it is non-executable class)
	
	//object identification code
		public static By uidObj=By.name("userName");
		public static By pwdObj=By.name("password");
		public static By signinObj=By.name("login");
		
	//	 create individual methods/functions to return each web element identification value
		
		public static WebElement userid(WebDriver driver){
			return (driver.findElement(uidObj));
		}
		
		public static WebElement passwd(WebDriver driver){
			return (driver.findElement(pwdObj));
		}
		public static WebElement signin(WebDriver driver){
			return (driver.findElement(signinObj));
		}
}




package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent2 {

	// non-executable class means main method is not required
	
	public static void mtlogin(WebDriver driver){
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		System.out.println("To perform login operation");
	}
}

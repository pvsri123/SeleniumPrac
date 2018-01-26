package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parent1 {
	// non-executable class means main method is not required
	
	public static void usrReg(WebDriver driver){
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Venkata");
		driver.findElement(By.name("lastName")).sendKeys("Puli");
		driver.findElement(By.name("email")).sendKeys("Puli");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
		driver.findElement(By.name("register")).click();
		System.out.println("User registration operation");
		
	}
	public static void closeApp(WebDriver driver){
		driver.close();
		System.out.println("To Close App");
		
	}
}

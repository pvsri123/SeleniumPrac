package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

public class VerifywordpressLogin {
	@Test
	public void VerifyValidLogin(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in");
		
		LoginPage login = new LoginPage(driver);
		login.typeUserName("admin");
		login.typePassword("demo123");
		login.clickOnLoginButton();
		driver.quit();
		
			}

}

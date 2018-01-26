package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By username =By.id("usernameOrEmail");
	By password = By.xpath(".//*[@id='password']");
	By loginButton = By.xpath(".//*[@id='primary']/div/main/div/div[1]/div/form/div[1]/div[2]/button");
	
// create constructor 

	public LoginPage (WebDriver driver)
	{
	
			this.driver = driver;
	}
	public void typeUserName(String uid)
	{
		
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassword(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		
		driver.findElement(loginButton).click();
	}
}
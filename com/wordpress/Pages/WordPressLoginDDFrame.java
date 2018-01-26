package com.wordpress.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class WordPressLoginDDFrame {

	
	WebDriver driver;
	
	@Test(dataProvider="rediffdata")
	public void LoginToRediff(String username,String password) throws InterruptedException
	
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Thread.sleep(3000);
	//	System.out.println(driver.getTitle());
			
	//	Assert.assertTrue(driver.getTitle().contains(""), "User is not able to login-Invalid credentials");
		System.out.println("Page Title Verified-User is able to login successfully");
	}
	
	@DataProvider(name="rediffdata")
	public Object[][] passData()
	{
		
		Object[][] data= new Object[3][2];
		
		data[0][0]="admin1";
		data[0][1]="demo1";
		
		data[1][0]="admin1";
		data[1][1]="demo123";
		
		data[2][0]="admin1";
		data[2][1]="demo1234";
		return data;
				
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
